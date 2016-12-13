# 使用spring cloud构建的微服务项目demo

方案一：spring cloud zookeeper

* Zookeeper：服务注册中心
* Spring cloud zookeeper:实现服务注册、服务发现
* Robbin/feign：客户端负载均衡
* Hystrix： 断路器（Circuit Breaker）
    
代码示例：
    
* service: service-zookeeper
* client: client-zookeeper
  
    
--------------


方案二：Netflix Eureka

* Eureka: 服务注册中心
* Hystrix: 断路器(Circuit Breaker)
* Zuul： 路由、网关、过滤器
* Ribbon/Feign: 客户端负载均衡

代码示例：

* Eureka server: eureka-server
* service: eureka-service-demo
* client: eureka-client-ribbbon/eureka-client-feign
    
