FROM eclipse-temurin:21-jre
# Fabric8 legt die JAR standardmäßig hierhin:
COPY maven/*jar /myapp.jar
# Und setzt den Einstiegspunkt automatisch
RUN sh -c 'touch /myapp.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-jar", "/myapp.jar"]