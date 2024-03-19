plugins {
    id("java")
    application
    checkstyle
}

application {
    mainClass = "hexlet.code.App"
}

//compileJava {
//    options.release = 21
//}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

//tasks.test {
//    useJUnitPlatform()
//}