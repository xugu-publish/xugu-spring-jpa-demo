#虚谷数据库使用Spring data jpa框架的demo程序
Demo程序使用步骤：
1. 从https://github.com/xugu-publish/xugu-spring-jpa-demo.git下载最新源代码，并引入工程
2. 在pom.xml中配置lib下的虚谷数据库jdbc依赖包，将依赖包拷贝只maven工程对应的环境目录结构中，并update maven工程
3. 执行init_db.sql中的SQL语句(创建表及初始化数据)
4. 执行AppTest类，查看运行结果
文件介绍
1. db.properties为虚谷数据库连接配置文件
2. context.xml为spring应用上下文配置文件
3. DAO实现Repository，还有其他接口可供实现（详情看官方文档）
4. AppTest类为测试类
5. 该demo程序使用了c3p0/druid数据源
6. resources/init_db.sql下为测试表
7. lib为虚谷驱动，在meven目录下加入驱动，或者add to build path(pom驱动的dependency注释掉)