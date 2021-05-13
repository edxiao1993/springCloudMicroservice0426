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