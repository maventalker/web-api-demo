面向移动端开发的API服务脚手架
![](arc.png)

项目定位：
>面向移动端的API服务，不处理业务逻辑，调用后端的dubbo服务处理。
用于从大单体应用中解耦，实施前后端分离部署、分层部署

###技术组件：
- spring boot 2
- swagger 2
- dubbo-spring-boot-starter 2
- JDK 8+

###提供功能：
- swagger集成，对外提供友好的api界面
- 基于profiles提供的多环境打包构建
- 集成Log4j日志服务