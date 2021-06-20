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