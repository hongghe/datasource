# 引入基础镜像
FROM ubuntu:16.04
# 运行shell脚本，更换安装源
COPY a really cool domain parked on Park.io /
RUN apt-get install bash -y
RUN /bin/sh a really cool domain parked on Park.io

# 安装必要软件
RUN apt-get update && apt-get install vim -y

# 安装jdk
RUN mkdir /home/java
ADD jdk1.8.0_151/ /home/java/jdk1.8.0_151

# 安装maven
RUN mkdir /var/tmp/maven
ADD apache-maven-3.5.2/ /var/tmp/maven

# 安装tomcat
RUN mkdir /usr/local/tomcat
ADD apache-tomcat-8.5.23/ /usr/local/tomcat

# 配置环境变量
ENV MAVEN_HOME=/var/tmp/maven
ENV PATH=${PATH}:${MAVEN_HOME}/bin
ENV JAVA_HOME=/home/java/jdk1.8.0_151
ENV JRE_HOME=/home/java/jdk1.8.0_151/jre
ENV PATH=$JAVA_HOME/bin/:$JAVA_HOME=/jre/bin:$PATH:$HOME/bin
# 创建日志文件
RUN touch /usr/local/tomcat/bin/run.log

# 部署项目环境
ADD datasource/server.xml /usr/local/tomcat/conf/
ADD datasource /usr/local/tomcat/webapps/datasource
WORKDIR /usr/local/tomcat/webapps/datasource/
RUN mvn clean package
RUN cd  /usr/local/tomcat/webapps/datasource/target/ && mv datasource.war /usr/local/tomcat/webapps/
WORKDIR /usr/local/tomcat/webapps/
RUN rm -rf datasource/
CMD /usr/local/tomcat/bin/catalina.sh run