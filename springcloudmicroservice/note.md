# begin at 0426 23:19

-----------------

### date: 0512
添加了 Eureka Server 的项目，写了个注册到Eureka服务中心测试的项目。
没什么问题，Eureka 的配置和之前的没什么区别。明天尝试着写 GateWay
EurekaServer项目地址：
/Users/xiaoxiang/IdeaProjects/springCloudMicroservice0426/springcloudEureka
  port: 8761
有个只提供接口的项目 testProject，也注册到了Eureka，单纯地用来测试而已
/Users/xiaoxiang/IdeaProjects/springCloudMicroservice0426/testProject
  port: 8083
  application.name: testproject

### date: 0513
添加了 GateWay 的项目，也不知道能不能成功写出来～～～
GatewayService项目地址：
/Users/xiaoxiang/IdeaProjects/springCloudMicroservice0426/springcloudGateway
  port: 8071
  application.name: gateway_service

启动项目之后，可以


### date before 0620:
add OpenFeign project.
location:
/Users/xiaoxiang/IdeaProjects/springCloudMicroservice0426/springcloudOpenFeign
  port: 7891


add frontEnd project
location:
/Users/xiaoxiang/IdeaProjects/springCloudMicroservice0426/frontEnd
  port: 8080

### date 0620:
add OAuth2 Authorization Server:
actually, only handle the SpringSecurity, noting to do with OAuth2
: because the springboot 2.4 remove the support for OAuth2 Authorization server......

OK, let's assume the SSO is works normally. focus on the dataService and the display of frontEnd.
No matter what, create a basic SpringCloudMicroService project, then the rest would be completed as you wish~


### data 0621:
提说今天是夏至～～～热倒是很热，只是没啥心情去熬夜看日出嘞。。。
添加了前端blog项目：springcloudBlog, 只是最基本的显示，保证能跑通 GateWay, DataService, Eureka。
完整的博客，明天再搞吧。
端口：8080

添加了数据操作的项目：springcloudDatabase， 应该叫 springcloudData 才对的，又不仅仅是操作 MySQL 的数据库。算了，先这么叫着
今晚只是做了查询的操作，余下的应该不怎么难。就是 OpenFeign 传递多个参数的问题，要好好写个笔记才行。
端口：8376 （MySQL的端口是 3306，这里为什么叫 8376？）


### date 0622:
今天早上起床，发现外面正在下着雨，心情莫名其妙地就好了～

完成了把单体 blog 拆分成微服务的架构了。其实还没有，毕竟安全模块完全没有添加……
OAuth2部分，SpringBoot2.4开始把认证服务器给拆出去了，搞得现在整合会发生莫名其妙的错误。
开始慢慢往这个只有雏形的 blog 加东西了，这次一定要好好弄明白才行。