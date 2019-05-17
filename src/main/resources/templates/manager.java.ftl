package ${package.Service};

import ${package.Entity}.${entity};
import ${superServiceClassPackage};

/**
 * <p>
 * ${table.comment!} 服务类
 * </p>
 *
 * @author ${author}
 * @since ${date}
 */
<#if kotlin>
interface ${table.serviceName} : ${superServiceClass}<${entity}>
<#else>
public interface ${table.serviceName} {

    //新增$!{table.comment}
    public ResultVo add${entity}(${entity} ${table.entityPath});

    //修改$!{table.comment}
    public ResultVo update${entity}(${entity} ${table.entityPath});

    //删除$!{table.comment}
    public ResultVo delete${entity}ById(@PathVariable Integer ${table.entityPath}Id);

    //查询$!{table.comment}列表
    public ResultVo get${entity}List(Map<String,Object> condition);

   //获取$!{table.comment}详情
    public ResultVo get${entity}Detail(Integer ${table.entityPath}Id);
}
</#if>
