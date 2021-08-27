package com.lzm.springbootlearn.Test;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.IColumnType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 数据库逆向工程
 *
 * @author inleft
 * @date 2020-10-15 00:50
 * <p>
 * 生成器文档:https://mybatis.plus/config/generator-config.html#tableprefix
 */
public class CodeGenerator {

    private static GlobalConfig gc = null;

    private static DataSourceConfig dsc = null;

    private static PackageConfig pc = null;

    private static InjectionConfig cfg = null;

    private static StrategyConfig strategy = null;

    private static TemplateConfig templateConfig = null;

        private static String defaultOutPutPath = "/nv-#module_name#/nv-#module_name#-biz/src/main/java/";//默认模板文件的输出目录
    //自定义生成的文件的packge名
    private static String parentPackage = "org.jeecg.modules.#module_name#";//父包
    //     projectPath + otherModule + targetPath  自定义生成的文件
    private static String otherModule = "/nd-common/nd-model/";//需要分模块输出的模块名

    private static String targetPath = "/src/main/java/org/jeecg/modules/#module_name#";//data模块模板文件的输出目录

    private static String dbName = "nv_#module_name#_dev";

    private static String url = "jdbc:mysql://192.168.73.122:3306/nv_#module_name#_dev?tinyInt1isBit=false&useUnicode=true&useSSL=false&characterEncoding=utf8";
    private static String account = "root";
    private static String password = "Root!@3";

    private static boolean forceOverWrite = true;//是否强制覆盖代码,小心xml的自定义语句也被覆盖了

    //选择输出那些文件
    private static boolean controller_output = true;//是否输出控制器模板
    private static boolean service_output = true;//服务层模板
    private static boolean service_impl_output = true;//服务实现类模板
    private static boolean entity_output = true;//自带实体输出模板
    private static boolean mapper_output = true;

    //自定义输出路径
    private static boolean xml_output = false; //自定义mapper.xml模板
    private static boolean custom_mapper_output = false;//自定义mapper模板
    private static boolean custom_entity_output = false;//自定义实体模板


    /**
     * 查询语句:select GROUP_CONCAT(table_name) from information_schema.tables where table_schema='nanfanghosp_dev' and TABLE_NAME like "nf_%"
     * 目标生成:nf_backlist_history,nf_file
     * <p>注意：
     *     <b>注意，不要轻易重新生成现有表的代码，会覆盖非表字段</b>
     */
    public static void main(String[] args) {
//        {"activity","content","creator","interaction","live","member","operate","third","pay",};
        String[] arr = {"creator"};//activity,content,creator
        Map<String,String> map = new HashMap<>(13);
        map.put("activity","nv_lottery,nv_lottery_activity,nv_lottery_prize,nv_lottery_prize_detail,nv_lottery_prize_relation,nv_lottery_record,nv_lottery_record_user,nv_lottery_statistic");
        map.put("content","nv_appoint_key_word,nv_appoint_result,nv_appoint_result_relation");
//        map.put("content","nv_allot,nv_channel,nv_channel_column,nv_channel_item,nv_column,nv_column_item,nv_doc,nv_doc_draft_audit,nv_doc_duplicate,nv_doc_related_report,nv_doctags,nv_doctags_creator,nv_import_original_doc,nv_import_plan,nv_import_process_doc,nv_recommend,nv_slide,nv_slide_item,nv_special_topic,nv_special_topic_column,nv_special_topic_item,nv_video,nv_video_file,nv_video_sync_channel");
//        map.put("creator","nv_content_auditor,nv_creator,nv_creator_attr,nv_creator_content_auditor,nv_creator_examine,nv_creator_operator,nv_creator_permission,nv_creator_permission_rela,nv_enter,nv_invite_code,nv_member_block_creator,nv_rss");
        map.put("creator","nv_territory,nv_creator_territory_rela");
        map.put("interaction","nv_comment,nv_comment_bullet,nv_comment_counter,nv_doc_channel_data,nv_doc_counter,nv_praise,nv_statistics,nv_subscribe");
        map.put("live","nv_live,nv_live_stream,nv_live_user_appointment,nv_module_tag");
        map.put("member","nv_certification,nv_device,nv_failedlogin,nv_member,nv_member_attr,nv_push_set,nv_token");
        map.put("operate","nv_adv,nv_app_release,nv_feedback,nv_message,nv_notice,nv_theme");
        map.put("third","nv_push,nv_push_group,nv_sms_log");
        map.put("pay","nv_pay_channel,nv_pay_order,nv_procamera,nv_procamera_order");

/*        for (String moduleName:arr) {
            System.out.println("开始处理"+moduleName);
            initVar(moduleName);
            generateCode(map.get(moduleName));
        }*/
        initVar("pay");
        generateCode(map.get("pay"));

        List<String> list = new ArrayList<String>(){{
            add("a");
            add("b");
            add("c");
        }};
        for(String s:list){
            s.toUpperCase();
        }
        for(int i=0;i<list.size();i++){
            list.get(i).toUpperCase();
        }
        System.out.println(list);
    }

    public static void initVar(String moduleName){
        parentPackage = parentPackage.replace("#module_name#",moduleName);//父包

        defaultOutPutPath = defaultOutPutPath.replaceAll("#module_name#",moduleName);//默认模板文件的输出目录

        targetPath = targetPath.replace("#module_name#",moduleName);//data模块模板文件的输出目录

        dbName = dbName.replace("#module_name#",moduleName);

        url = url.replace("#module_name#",moduleName);
    }

    /**
     * 方法加载入口
     */
    public static void generateCode(String tableNames) {

        gc = getGlobalConfig();//加载全局配置

        dsc = getDataSourceConfig();//加载数据源配置

        pc = getPackageConfig();//加载包配置

        cfg = getInjectionConfig(); //加载自定义配置模版参数配置

        strategy = getStrategyConfig(tableNames.replace(" ", "").split(","));//加载策略配置

        templateConfig = getTemplateConfig();//加载模板配置

        doIt();//代码生成

    }

    /**
     * 代码生成
     */
    private static void doIt() {
        AutoGenerator mpg = new AutoGenerator();
        mpg.setDataSource(dsc);
        mpg.setPackageInfo(pc);
        mpg.setGlobalConfig(gc);
        mpg.setStrategy(strategy);
        mpg.setCfg(cfg);
        mpg.setTemplate(templateConfig);
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }

    /**
     * 配置模板引擎
     */
    private static TemplateConfig getTemplateConfig() {

        //配置模板引擎
        TemplateConfig templateConfig = new TemplateConfig();

        // 配置自定义输出模板
        //指定自定义模板路径，注意不要带上.ftl/.vm, 会根据使用的模板引擎自动识别
        // templateConfig.setEntity("templates/entity2.java");
        // templateConfig.setService();
        // templateConfig.setController();


        //这里是默认文件模板配置,设为空或者"",则不输出

//        templateConfig.setXml(null);//不用这里的xml模板输出,默认设为空

        if (!controller_output) {
            templateConfig.setController("");
        }
        if (!service_output) {
            templateConfig.setService("");
        }
        if (!service_impl_output) {
            templateConfig.setServiceImpl("");
        }
        if (!mapper_output) {
            templateConfig.setMapper("");
        }
        if (!entity_output) {
            templateConfig.setEntity("");
        }

        return templateConfig;
    }

    /**
     * 策略配置
     */
    private static StrategyConfig getStrategyConfig(String... tableNames) {
        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);// 数据库表 映射到实体的命名策略,下划线变驼峰
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);//数据库表 字段 映射到实体 字段 命名策略, 未指定按照 naming 执行
        strategy.setEntityLombokModel(true);//实体lom注解
        strategy.setRestControllerStyle(true);//RestController注解
//        strategy.setSuperEntityClass("com.baomidou.mybatisplus.extension.activerecord.Model");//自己的实体父类
//        strategy.setSuperControllerClass("com.baomidou.ant.common.BaseAuthController");//自己的控制器父类

        strategy.setInclude(tableNames);// 需要生成的表
        //strategy.setExclude(new String[]{"test"}); //排除生成的表,二选一,可以正则

        strategy.setControllerMappingHyphenStyle(false);//驼峰转连字符 bookTest >>> book-test
//        strategy.setVersionFieldName("version");//乐观锁字段
        strategy.setLogicDeleteFieldName("is_del");//逻辑删除字段
        strategy.setSkipView(false);//跳过视图的输出

        //字段填充策略
        strategy.setTableFillList(new ArrayList() {{
            add(new TableFill("create_time", FieldFill.INSERT));
            add(new TableFill("update_time", FieldFill.INSERT_UPDATE));
        }});

        //strategy.setSuperEntityColumns("id");
        //strategy.setEntityTableFieldAnnotationEnable(true);//实体字段注解
        //strategy.setTablePrefix(pc.getModuleName() + "_");//表前缀

        strategy.setChainModel(true);//开启链式
        return strategy;
    }

    /**
     * 自定义配置模版参数配置
     */
    private static InjectionConfig getInjectionConfig() {
        String projectPath = System.getProperty("user.dir");
        //自定义配置模版参数配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing,自定义参数注入可供ftl模板文件读取
            }
        };

         /*cfg.setFileCreate(new IFileCreate() {
            @Override
            public boolean isCreate(ConfigBuilder configBuilder, FileType fileType, String filePath) {
                // 判断自定义文件夹是否需要创建
                checkDir("调用默认方法创建的目录");

                return false;
            }
         });*/

        // 如果模板引擎是 freemarker
        String entityTemplatePath = "/templates/mapper.xml.ftl";
        String mapperTemplatePath = "/templates/mapper.java.ftl";
        String xmlTemplatePath = "/templates/entity.java.ftl";

        // 自定义输出配置,自定义配置会被优先输出
        List<FileOutConfig> focList = new ArrayList<>();

        if (xml_output) {
            focList.add(new FileOutConfig(entityTemplatePath) {
                @Override
                public String outputFile(TableInfo tableInfo) {
                    // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
                    return projectPath + otherModule + targetPath + "/" + pc.getMapper() + "/"
                            + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
                }
            });
        }
        if (custom_mapper_output) {

            //暂时不用这里的配置
            focList.add(new FileOutConfig(mapperTemplatePath) {
                @Override
                public String outputFile(TableInfo tableInfo) {
                    return projectPath + otherModule + targetPath + "/" + pc.getMapper() + "/"
                            + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_JAVA;
                }
            });
        }

        if (custom_entity_output) {
            focList.add(new FileOutConfig(xmlTemplatePath) {
                @Override
                public String outputFile(TableInfo tableInfo) {
                    return projectPath + otherModule + targetPath + "/" + pc.getEntity() + "/"
                            + tableInfo.getEntityName() + StringPool.DOT_JAVA;
                }
            });
        }

        cfg.setFileOutConfigList(focList);
        return cfg;
    }

    /**
     * 加载包配置
     */
    private static PackageConfig getPackageConfig() {
        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent(parentPackage);//父包
        pc.setModuleName("");//模块名称,追加在父包的子包
        return pc;
    }

    /**
     * 提供数据库配置
     */
    private static DataSourceConfig getDataSourceConfig() {
        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setUrl(url);
        dsc.setSchemaName(dbName);//连接哪个数据库
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername(account);
        dsc.setPassword(password);
        dsc.setTypeConvert(new MySqlTypeConvertCustom());
        return dsc;
    }

    /**
     * 提供全局配置
     */
    private static GlobalConfig getGlobalConfig() {
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        System.out.println(projectPath);
        gc.setOutputDir(projectPath + defaultOutPutPath);//默认模板文件输出目录
        gc.setFileOverride(forceOverWrite);//是否覆盖
        gc.setEnableCache(false);//XML 二级缓存
        gc.setBaseResultMap(true);
        gc.setBaseColumnList(true);
        gc.setActiveRecord(true);//AR模式,实体自己curd
        gc.setDateType(DateType.ONLY_DATE);//时间类型对应策略
        gc.setOpen(false);//是否打开输出目录
        gc.setAuthor("nd");
        gc.setSwagger2(true); //实体属性 Swagger2 注解
        gc.setIdType(IdType.INPUT);//主键id自增类型

        return gc;
    }

    final static String TINY_INT_1 = "tinyint(1)";
    static class MySqlTypeConvertCustom extends MySqlTypeConvert implements ITypeConvert {
        @Override
        public IColumnType processTypeConvert(GlobalConfig globalConfig, String fieldType) {
            String t = fieldType.toLowerCase();
            if (t.contains(TINY_INT_1)) {
                return DbColumnType.INTEGER;
            }
            return super.processTypeConvert(globalConfig, fieldType);
        }
    }
}