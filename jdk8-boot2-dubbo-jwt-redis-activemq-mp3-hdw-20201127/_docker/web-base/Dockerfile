# service-base-consumer docker配置
FROM fabric8/java-alpine-openjdk8-jdk

MAINTAINER JacksonTu (tuminglong@126.com)

ENV PROJECT_HOME /home/project
ENV TOMCAT_HOME /home/tomcat/webapps
ENV OUTPUT_HOME /output
ENV JAVA_OPTS="-Xms256m -Xmx256m -Xss1m -Xmn128m"

RUN mkdir -p "$PROJECT_HOME" && mkdir -p "$OUTPUT_HOME" && mkdir -p "$TOMCAT_HOME"

ADD service-base-consumer.jar $PROJECT_HOME/service-base-consumer.jar

WORKDIR /home/project

# 指定容器内的时区
RUN echo "Asia/Shanghai" > /etc/timezone

ENTRYPOINT ["sh","-c","java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar $PROJECT_HOME/service-base-consumer.jar"]

EXPOSE 8182

# docker run -it -d --name service-base-consumer -p8190:8190 -v /output:/output -v /home/tomcat/webapps:/home/tomcat/webapps service-base-consumer:v1
