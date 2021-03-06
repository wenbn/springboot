package com.example.demo.test;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.example.demo.generator.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 修改 controller模板方法 https://blog.csdn.net/qq_33842795/article/details/80227382
 * https://blog.csdn.net/u014745069/article/details/80720980
 * @author wenbn
 * @version 1.0
 * @date 2018/11/22
 */
public class CodeGenerator1 {

    //项目路径
    private static String canonicalPath = "";

    //基本包名
    private static String basePackage = "com.yhxd.modular.system";
    //作者
    private static String authorName = "wenbn";
    //要生成的表名
    private static String[] tables = {"lc_project_tasks_receipt_template","lc_project_tasks_receipt"};
    //table前缀
    private static String prefix = "";

    //数据库类型
//    private static DbType dbType = DbType.MYSQL;
//    private static DbType dbType = DbType.POSTGRE_SQL;
//    //数据库配置四要素
//    private static String driverName = "org.postgresql.Driver";
//    private static String url = "jdbc:postgresql://183.62.69.35:18007/postgres?useSSL=false";
//    private static String username = "postgres";
//    private static String password = "_Admin001";


    //数据库类型
    private static DbType dbType = DbType.MYSQL;
    //数据库配置四要素
    private static String driverName = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/milestone?useSSL=false&useUnicode=true&characterEncoding=utf8";
    private static String username = "root";
    private static String password = "123";

    public static void main(String[] args) {
        WenbnAutoGenerator gen = new WenbnAutoGenerator();

        /**
         * 获取项目路径
         */
        try {
            canonicalPath = new File("").getCanonicalPath();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /**
         * 数据库配置
         */
        gen.setDataSource(new DataSourceConfig()
                .setDbType(dbType)
                .setDriverName(driverName)
                .setUrl(url)
                .setUsername(username)
                .setPassword(password)
//                .setTypeConvert(new MySqlTypeConvert() {
//                    // 自定义数据库表字段类型转换【可选】
//                    //@Override
//                    //public DbColumnType processTypeConvert(String fieldType) {
//                    //System.out.println("转换类型：" + fieldType);
//                    // if ( fieldType.toLowerCase().contains( "tinyint" ) ) {
//                    //    return DbColumnType.BOOLEAN;
//                    // }
//                    //return super.processTypeConvert(fieldType);
//                    //}
//                })
        );

        /**
         * 全局配置
         */
        WenbnGlobalConfig wenbnGlobalConfig = new WenbnGlobalConfig();
//        wenbnGlobalConfig.setOutputDir( "D://jt/" + "/src/main/java");//输出目录
        wenbnGlobalConfig.setOutputDir( canonicalPath + "/src/main/java");//输出目录
        wenbnGlobalConfig.setFileOverride(true);// 是否覆盖文件
        wenbnGlobalConfig.setActiveRecord(true);// 开启 activeRecord 模式
        wenbnGlobalConfig.setEnableCache(false);// XML 二级缓存
        wenbnGlobalConfig.setBaseResultMap(true);// XML ResultMap
        wenbnGlobalConfig.setBaseColumnList(true);// XML columList
//        wenbnGlobalConfig.setEntityName("%sDto");
        wenbnGlobalConfig.setEntityName("%s");
        wenbnGlobalConfig.setOpen(false);//生成后打开文件夹
        wenbnGlobalConfig.setAuthor(authorName);
        wenbnGlobalConfig.setMapperName("%sMapper");
//        wenbnGlobalConfig.setMapperName("%sDao");
        wenbnGlobalConfig.setXmlName("%sMapper");
        wenbnGlobalConfig.setServiceName("%sService");
        wenbnGlobalConfig.setServiceImplName("%sServiceImpl");
        wenbnGlobalConfig.setManagerName("%sManager");
        wenbnGlobalConfig.setManagerImplName("%sManagerImpl");
        wenbnGlobalConfig.setControllerName("%sController");


//        wenbnGlobalConfig.setSwagger2(true);//model swagger2
        gen.setGlobalConfig(wenbnGlobalConfig);
//        gen.setGlobalConfig(new GlobalConfig()
//                .setOutputDir( canonicalPath + "/src/main/java")//输出目录
//                .setFileOverride(true)// 是否覆盖文件
//                .setActiveRecord(true)// 开启 activeRecord 模式
//                .setEnableCache(false)// XML 二级缓存
//                .setBaseResultMap(true)// XML ResultMap
//                .setBaseColumnList(true)// XML columList
//                .setOpen(false)//生成后打开文件夹
//                .setAuthor(authorName)
//                // 自定义文件命名，注意 %s 会自动填充表实体属性！
//                .setMapperName("%sMapper")
//                .setXmlName("%sMapper")
//                .setServiceName("%sService")
//                .setServiceImplName("%sServiceImpl")
//                .setControllerName("%sController")
//        );

        /**
         * 策略配置
         */
        gen.setStrategy(new StrategyConfig()
                        // .setCapitalMode(true)// 全局大写命名
                        //.setDbColumnUnderline(true)//全局下划线命名
                        .setTablePrefix(new String[]{prefix})// 此处可以修改为您的表前缀
                        .setNaming(NamingStrategy.underline_to_camel)// 表名生成策略
                        .setInclude(tables) // 需要生成的表
                        .setRestControllerStyle(true)
                        //.setExclude(new String[]{"test"}) // 排除生成的表
                        // 自定义实体父类
                        // .setSuperEntityClass("com.baomidou.demo.TestEntity")
                        // 自定义实体，公共字段
                        //.setSuperEntityColumns(new String[]{"test_id"})
                        //.setTableFillList(tableFillList)
                        // 自定义 mapper 父类 默认BaseMapper
                        //.setSuperMapperClass("com.baomidou.mybatisplus.mapper.BaseMapper")
                        // 自定义 service 父类 默认IService
                        // .setSuperServiceClass("com.baomidou.demo.TestService")
                        // 自定义 service 实现类父类 默认ServiceImpl
                        // .setSuperServiceImplClass("com.baomidou.demo.TestServiceImpl")
                        // 自定义 controller 父类
                        //.setSuperControllerClass("com.kichun."+packageName+".controller.AbstractController")
                        // 【实体】是否生成字段常量（默认 false）
                        // public static final String ID = "test_id";
                        // .setEntityColumnConstant(true)
                        // 【实体】是否为构建者模型（默认 false）
                        // public User setName(String name) {this.name = name; return this;}
                        // .setEntityBuilderModel(true)
                        // 【实体】是否为lombok模型（默认 false）<a href="https://projectlombok.org/">document</a>
                        .setEntityLombokModel(true)
                // Boolean类型字段是否移除is前缀处理
                // .setEntityBooleanColumnRemoveIsPrefix(true)
                // .setRestControllerStyle(true)
                // .setControllerMappingHyphenStyle(true)
        );

        /**
         * 包配置
         */
        WenbnPackageConfig packageConfig = new WenbnPackageConfig();
        packageConfig.setParent(basePackage);// 自定义包路径
        packageConfig.setController("controller");// 这里是控制器包名，默认 web
//        packageConfig.setEntity("model"); // 设置Entity包名，默认entity
        packageConfig.setMapper("mapper"); // 设置Mapper包名，默认mapper
        packageConfig.setService("service"); // 设置Service包名，默认service
        packageConfig.setServiceImpl("service.impl"); // 设置Service Impl包名，默认service.impl
        packageConfig.setXml("mapper"); // 设置Mapper XML包名，默认mapper.xml
        gen.setPackageInfo(packageConfig);


        /**
         * 注入自定义配置
         */
        // 注入自定义配置，可以在 VM 中使用 cfg.abc 设置的值
        WenbnInjectionConfig abc = new WenbnInjectionConfig() {
            @Override
            public void initMap() {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
                this.setMap(map);
            }
        };
        //自定义文件输出位置（非必须）
        List<FileOutConfig> fileOutList = new ArrayList<FileOutConfig>();
        fileOutList.add(new FileOutConfig("/templates/mapper.xml.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return canonicalPath + "/src/main/resources/mapper/" + tableInfo.getEntityName() + "Mapper.xml";
            }
        });
        abc.setFileOutConfigList(fileOutList);
        gen.setCfg(abc);

        /**
         * 指定模板引擎 默认是VelocityTemplateEngine ，需要引入相关引擎依赖
         */
        //gen.setTemplateEngine(new FreemarkerTemplateEngine());

        /**
         * 模板配置
         */
        gen.setTemplate( new WenbnTemplateConfig());
//                // 关闭默认 xml 生成，调整生成 至 根目录
//                new TemplateConfig().setXml(null)
//                // 自定义模板配置，模板可以参考源码 /mybatis-plus/src/main/resources/template 使用 copy
//                // 至您项目 src/main/resources/template 目录下，模板名称也可自定义如下配置：
//                // .setController("...");
//                // .setEntity("...");
//                // .setMapper("...");
//                // .setXml("...");
//                // .setService("...");
//                // .setServiceImpl("...");
//        );

        // 执行生成
        gen.execute();
    }

    public static String str(CharSequence cs) {
        return null == cs ? null : cs.toString();
    }

    public static String removePrefix(CharSequence str, CharSequence prefix) {
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(prefix)) {
            String str2 = str.toString();
            return str2.startsWith(prefix.toString()) ? subSuf(str2, prefix.length()) : str2;
        } else {
            return str(str);
        }
    }

    public static String sub(CharSequence str, int fromIndex, int toIndex) {
        if (StringUtils.isEmpty(str)) {
            return str(str);
        } else {
            int len = str.length();
            if (fromIndex < 0) {
                fromIndex += len;
                if (fromIndex < 0) {
                    fromIndex = 0;
                }
            } else if (fromIndex > len) {
                fromIndex = len;
            }

            if (toIndex < 0) {
                toIndex += len;
                if (toIndex < 0) {
                    toIndex = len;
                }
            } else if (toIndex > len) {
                toIndex = len;
            }

            if (toIndex < fromIndex) {
                int tmp = fromIndex;
                fromIndex = toIndex;
                toIndex = tmp;
            }

            return fromIndex == toIndex ? "" : str.toString().substring(fromIndex, toIndex);
        }
    }
    public static String subPre(CharSequence string, int toIndex) {
        return sub(string, 0, toIndex);
    }

    public static String subSuf(CharSequence string, int fromIndex) {
        return StringUtils.isEmpty(string) ? null : sub(string, fromIndex, string.length());
    }
}
