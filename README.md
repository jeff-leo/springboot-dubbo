# springboot-dubbo
springboot-dubbo

# 注意事项
### 1. pojo要实现Serializable
### 2. 公共的工程
把Service接口放到dubbo-api这个公共工程中，Server实现的ServiceImpl所在的包路径要和Service接口一致，例如：  
- Service接口在dubbo-api的  com.yy.test.dubbodemo.service下
- ServiceImpl接口在dubbo-server的 com.yy.test.dubbodemo.service.impl下

这样，dubbo配置spring.dubbo.scan=com.yy.test.dubbodemo.service  就可以发现服务

### 3. 让dubbo发现的服务，要用dubbo的@Service而不是Spring的注解
### 4. client中消费dubbo的服务，使用@Reference
