##我的第一个springboot项目
 - main入口程序
 - 组合注解
 - 习惯优于配置
###自定义消息转换器
 - @Baen
###新增 springboot整和mybatis
 - @Mapper注解
 Mapper接口直接使用mapper注解
 
 - 加载mybatis配置文件
 
 mybatis.mapper-locations = classpath:mapper/*Mapper.xml
 
 mybatis.config-location = classpath:mapper/config/sqlMapConfig.xml
 - 定义别名
 
 mybatis.type-aliases-package = com.cuibusi.xspringdemo.bean
 - 数据源
 
 spring.datasource.url=jdbc:mysql://localhost:3306/mybatis
 spring.datasource.driver-class-name=com.mysql.jdbc.Driver
 spring.datasource.username=root
 spring.datasource.password=root

 
 