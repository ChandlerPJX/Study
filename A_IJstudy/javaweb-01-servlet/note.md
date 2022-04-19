web xml 头：

```xml

<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee
                      http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
         version="4.0"
         metadata-complete="true">
</web-app>
```

tomcat 10之前的 依赖

```xml
<!--    https://mvnrepository.com/artifact/javax.servlet/javax.servlet-api -->
<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>javax.servlet-api</artifactId>
    <version>4.0.1</version>
</dependency>

        <!--&lt;!&ndash;         https://mvnrepository.com/artifact/javax.servlet.jsp/javax.servlet.jsp-api &ndash;&gt;-->
        <!--&lt;!&ndash;         https://mvnrepository.com/artifact/javax.servlet.jsp/javax.servlet.jsp-api &ndash;&gt;-->
<dependency>
<groupId>javax.servlet.jsp</groupId>
<artifactId>javax.servlet.jsp-api</artifactId>
<version>2.3.3</version>
</dependency>
```

tomcat 10 api 依赖

```xml

<!-- https://mvnrepository.com/artifact/org.apache.tomcat/tomcat-servlet-api -->
<dependency>
    <groupId>org.apache.tomcat</groupId>
    <artifactId>tomcat-servlet-api</artifactId>
    <version>10.0.4</version>
</dependency>

        <!-- https://mvnrepository.com/artifact/org.apache.tomcat/tomcat-jsp-api -->
<dependency>
<groupId>org.apache.tomcat</groupId>
<artifactId>tomcat-jsp-api</artifactId>
<version>10.0.4</version>
</dependency>
```

war 插件

```xml

<plugin>
    <artifactId>maven-war-plugin</artifactId>
    <version>3.2.2</version>
</plugin>
```

maven中的资源导出问题.
![img.png](img.png)

```xml

<resources>
    <resource>
        <directory>src/main/java</directory>
        <includes>
            <include>**/*.properties</include>
            <include>**/*.xml</include>
        </includes>
        <filtering>true</filtering>
    </resource>
</resources>
```
