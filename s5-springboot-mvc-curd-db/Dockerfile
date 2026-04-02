# Stage 1: Build the WAR
FROM maven:3.9-eclipse-temurin-21 AS build
WORKDIR /app

# 1. Copy the pom.xml FROM THE SUBFOLDER
COPY s5-springboot-mvc-curd-db/pom.xml .

# 2. Download dependencies
RUN mvn dependency:go-offline -B

# 3. Copy the source code FROM THE SUBFOLDER
COPY s5-springboot-mvc-curd-db/src ./src

# 4. Build the WAR file
RUN mvn clean package -DskipTests


# Stage 2: Run the WAR
FROM eclipse-temurin:21-jre-ubi9-minimal
WORKDIR /app

# Copy the generated WAR file
COPY --from=build /app/target/*.war app.war

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.war"]