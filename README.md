#虚谷数据库使用springDATAJPA的demo程序
1. db.properties为虚谷数据库连接配置文件
2. context.xml为spring应用上下文配置文件
3. DAO实现Repository，还有其他接口可供实现（详情看官方文档）
4. AppTest类为测试类
5. 该demo程序使用了c3p0,druid数据源
6. target/db下为测试表
7. target/lib为虚谷驱动，在meven目录下加入驱动，或者add to build path(pom驱动的dependency注释掉)