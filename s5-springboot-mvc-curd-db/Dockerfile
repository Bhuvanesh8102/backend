# Stage 1: Build the WAR
FROM maven:3.9-eclipse-temurin-21 AS build
WORKDIR /app

# Copy the pom.xml from the subfolder
COPY s5-springboot-mvc-curd-db/pom.xml .

# Download dependencies
RUN mvn dependency:go-offline -B

# Copy the source code from the subfolder
COPY s5-springboot-mvc-curd-db/src ./src

# Build the WAR file
RUN mvn clean package -DskipTests

# Stage 2: Run the WAR
FROM eclipse-temurin:21-jre-ubi9-minimal
WORKDIR /app

# Copy WAR from build stage
COPY --from=build /app/target/*.war app.war

EXPOSE 8080
ENTRYPOINT ["java","-jar","app.war"]