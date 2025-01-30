# Step 1: 기본 이미지로 openjdk 사용
FROM openjdk:17-jdk-slim AS build

# Step 2: 애플리케이션 소스 코드를 복사
WORKDIR /app
COPY . /app/

# Step 3: gradle wrapper로 빌드 실행
RUN ./gradlew bootJar

# Step 4: 빌드된 JAR 파일을 컨테이너로 복사
FROM openjdk:17-jdk-slim
COPY --from=build /app/build/libs/hjhotel-back-0.0.1.jar /usr/app/hjhotel-back.jar

# Step 5: 작업 디렉토리 설정
WORKDIR /usr/app

# Step 6: 포트 8080을 외부에 노출
EXPOSE 8080

# Step 7: Spring Boot JAR 파일 실행
CMD ["java", "-jar", "hjhotel-back.jar"]