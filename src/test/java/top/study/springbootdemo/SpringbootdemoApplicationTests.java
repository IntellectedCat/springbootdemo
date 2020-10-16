package top.study.springbootdemo;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SpringbootdemoApplicationTests.class)
class SpringbootdemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void MysqlGenerator(){
        AutoGenerator ag = new AutoGenerator();

        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");//得到当前项目的路径
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("jjhe");   // 作者
        gc.setFileOverride(false);  //文件覆盖
        gc.setOpen(false);      //生成代码后是否打开文件夹
        gc.setActiveRecord(false);// 不需要ActiveRecord特性的请改为false
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(false);// XML columList
        ag.setGlobalConfig(gc);

        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/test?characterEncoding=utf8&useSSL=false&serverTimezone=UTC");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        ag.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName("springbootdemo"); // 模块名称, 这里可以根据不同模块来写
        pc.setParent("top.study"); // 父包名
        pc.setController("controller");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        pc.setMapper("mapper");
        pc.setEntity("entity");
        pc.setXml("mapper");
        ag.setPackageInfo(pc);

        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setControllerName("%sController");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        ag.setGlobalConfig(gc);

//        不生成包
//        TemplateConfig tc = new TemplateConfig();
//        tc.setController(null);


        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
//        strategy.setSuperControllerClass("com.lcy.demo.sys.controller.BaseController");
//        strategy.setSuperEntityClass("com.lcy.demo.sys.entity.BaseEntity");
        strategy.setEntityLombokModel(true);
        strategy.setTablePrefix("t_");
        strategy.setInclude("t_teacher");  // 如果要生成多个,这里可以传入String[]
        ag.setStrategy(strategy);
        ag.execute();

//        //全局配置
//        GlobalConfig gc = new GlobalConfig();
//        String oPath = System.getProperty("user.dir");//得到当前项目的路径
//        gc.setOutputDir(oPath + "/src/main/java");   //生成文件输出根目录
//        gc.setOpen(false);//生成完成后不弹出文件框
//        gc.setFileOverride(true);  //文件覆盖
//        gc.setActiveRecord(false);// 不需要ActiveRecord特性的请改为false
//        gc.setEnableCache(false);// XML 二级缓存
//        gc.setBaseResultMap(true);// XML ResultMap
//        gc.setBaseColumnList(false);// XML columList
//        gc.setAuthor("zhaohualuo");// 作者
//
//        // 自定义文件命名，注意 %s 会自动填充表实体属性！
//        gc.setControllerName("%sController");
//        gc.setServiceName("%sService");
//        gc.setServiceImplName("%sServiceImpl");
//        gc.setMapperName("%sMapper");
//        gc.setXmlName("%sMapper");
//        autoGenerator.setGlobalConfig(gc);
//
//        // 数据源配置
//        DataSourceConfig dsc = new DataSourceConfig();
//        dsc.setDbType(DbType.POSTGRE_SQL);   //设置数据库类型，我是postgresql
//        dsc.setDriverName("org.postgresql.Driver");
//        dsc.setUsername("postgres");
//        dsc.setPassword("admin");
//        dsc.setUrl("jdbc:postgresql://localhost:5432/book");  //指定数据库
//        autoGenerator.setDataSource(dsc);
//
//        // 策略配置
//        StrategyConfig strategy = new StrategyConfig();
//        strategy.setNaming(NamingStrategy.underline_to_camel);      // 表名生成策略
//        strategy.setInclude(new String[] { "platform_goods" });     // 需要生成的表
//        strategy.setSuperServiceClass(null);
//        strategy.setSuperServiceImplClass(null);
//        strategy.setSuperMapperClass(null);
//        autoGenerator.setStrategy(strategy);
//
//        // 包配置
//        PackageConfig pc = new PackageConfig();
//        pc.setParent("com.xxxx.xx.goods");
//        pc.setController("controller");
//        pc.setService("service");
//        pc.setServiceImpl("service.impl");
//        pc.setMapper("mapper");
//        pc.setEntity("entity");
//        pc.setXml("xml");
//        autoGenerator.setPackageInfo(pc);
//
//        // 执行生成
//        autoGenerator.execute();
    }

}
