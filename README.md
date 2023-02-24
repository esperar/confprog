### protoconfig

spring boot configuration processor 를 kotlin으로 구현한 v2 버전입니다.  

**@ConfigurationProperties**  
> You can easily generate your own configuration metadata file from items annotated with @ConfigurationProperties by using the spring-boot-configuration-processor jar.
> The jar includes a Java annotation processor which is invoked as your project is compiled.
  
https://docs.spring.io/spring-boot/docs/current/reference/html/configuration-metadata.html#configuration-metadata.annotation-processor
  
```gradle
kotlin("kapt") version "{VERSION}"
```

```gradle
annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
kapt("org.springframework.boot:spring-boot-configuration-processor")
```

```mave
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-configuration-processor</artifactId>
    <optional>true</optional>
</dependency>
```