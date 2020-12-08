package com.example.demo.dao;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.util.StrUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author wenbn
 * @version 1.0
 * @date 2018/5/22
 */
public class BaseDao extends SqlSessionDaoSupport {
    /**
     * 需要继承
     * @param sqlSessionFactory
     */
    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    /**
     * 执行SQL
     * @param condition
     * @param sql
     * @return
     */
    protected Map<Object, Object> executeSql(Map<Object, Object> condition, String sql) {
        String _pageIndex = StrUtil.toString(condition.get("pageIndex"));
        String _pageSize = StrUtil.toString(condition.get("pageSize"));
        if(!StrUtil.isEmpty(_pageIndex)&& !StrUtil.isEmpty(_pageSize)){
            int pageIndex = Convert.toInt(_pageIndex);
            int pageSize = Convert.toInt(_pageSize);
            PageHelper.startPage(pageIndex,pageSize);
            List<Object> resultList = this.getSqlSession().selectList(sql ,condition);
            condition.clear();
            if(resultList==null || resultList.size()<1){
                condition.put("data",null);
                condition.put("pageInfo",null);
                return condition;
            }
            PageInfo result = new PageInfo(resultList);
            result.setList(null);
            condition.put("data",resultList);
            condition.put("pageInfo",result);
            return condition;
        }else{
            List<Object> resultList = this.getSqlSession().selectList(sql ,condition);
            condition.clear();
            condition.put("data",resultList);
            condition.put("pageInfo",null);
            return condition;
        }
    }
}
