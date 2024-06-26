FROM openjdk:21
EXPOSE 8080
ADD target/paymentservice.jar paymentservice.jar
ENTRYPOINT [ "java", "-jar", "/paymentservice.jar" ]