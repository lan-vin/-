## web demo

### 新建数据库

![image-20240120135751951](C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20240120135751951.png)

- 安装MySql

  - 环境变量：*系统的一个全局搜索路径*

    ![image-20240120132002177](C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20240120132002177.png)

### 配置文件

*结构示意*

- application.properties

  ```java
  ```

  spring.redis.host 和 spring.redis.port：配置Redis服务器的主机名和端口号。

  spring.redis.database：选择要使用的数据库索引。默认情况下，Redis有16个数据库，索引从0到15。

  spring.redis.lettuce.pool.max-active：指定连接池中的最大活动连接数。当连接数达到此值时，后续的连接请求将被阻塞，默认值为8。

  spring.redis.lettuce.pool.max-idle：指定连接池中的最大空闲连接数。超过此数目的空闲连接将被释放，默认值为8。

  spring.redis.lettuce.pool.min-idle：指定连接池中的最小空闲连接数。连接池中始终会保持至少这么多的空闲连接，默认值为0。

  spring.redis.lettuce.pool.max-wait：指定从连接池获取连接的最大等待时间，单位是毫秒。如果设置为-1，表示无限制等待。

  spring.redis.lettuce.shutdown-timeout：指定在应用关闭时，等待连接池中连接关闭的超时时间。
  ![image-20240120132519259](C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20240120132519259.png)

- generatorConfig.xml

  ```java
  ```

  - mybatis generator：*帮我们生成 表对应的持久化对象(po)、操作数据库的接口(dao)、CRUD sql的xml(mapper)*

- pom.xml——*配置项目相关的依赖和插件*

  ```java
  ```

  - log4j： *为Java提供了日志记录功能。能够让程序员非常方便的记录日志， 并且提供了多种适配方式*
  - 热部署：
  - redis：*NOSQL,即非关系型数据库,也是缓存数据库,即将数据存储在缓存中,缓存的读取速度快,能够大大的提高运行效率,但是保存时间有限*
  - MySQL：*关系型数据库,主要用于存放持久化数据,将数据存储在硬盘中,读取速度较慢*





出现的问题

1. 找不到 JDBC driver——注意property文件里声明的变量名和xml文件里引用的变量名是否一样
2. 连接不到数据库——
   - 固定格式`spring.datasource.url=jdbc:mysql://localhost:3306/databasename?serverTimezone=Asia/Shanghai&useSSL=false`
3. 连接数据库失败——
