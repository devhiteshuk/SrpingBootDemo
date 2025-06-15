plugins {
	java
	id("org.springframework.boot") version "3.2.0"
	id("io.spring.dependency-management") version "1.1.3"
}

group = "com.dhl.spring"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

repositories {
	mavenCentral()
}

/*dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	implementation("org.springframework.boot:spring-boot-starter-web:3.4.4")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.4.4")
	//implementation("org.springframework.data:spring-data-jpa:3.4.4")
	//implementation("jakarta.persistence:jakarta.persistence-api:3.0.0")
	implementation("io.github.resilience4j:resilience4j-spring-boot3:2.2.0")
	implementation("io.github.resilience4j:resilience4j-circuitbreaker:2.2.0")
	implementation("org.springframework.boot:spring-boot-starter-actuator")
	implementation("com.h2database:h2")

	implementation("org.springframework.boot:spring-boot-starter-kafka")

	testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2")
	testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.2")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework.boot:spring-boot-starter-test:3.4.4")
}*/

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("io.github.resilience4j:resilience4j-spring-boot3:2.2.0")
	implementation("io.github.resilience4j:resilience4j-circuitbreaker:2.2.0")
	implementation("org.springframework.boot:spring-boot-starter-actuator")
	implementation("com.h2database:h2")
	implementation("org.springframework.boot:spring-boot-starter-kafka")

	testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2")
	testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.2")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
