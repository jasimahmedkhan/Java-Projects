FROM openjdk
ENV APP_HOME=/usr/app
WORKDIR $APP_HOME
COPY out/artifacts/BasicWebApplication_jar/*.jar /
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/BasicWebApplication.jar"]