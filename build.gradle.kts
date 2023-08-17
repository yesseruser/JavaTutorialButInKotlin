plugins {
    kotlin("jvm") version "1.9.0"
}

group = "com.yesser-studios"
version = "1.1"

tasks.jar {
    manifest {
        attributes["Main-Class"] = "com.yesserstudios.javatutorialbutinkotlin.KotlinClassKt"
    }
    configurations["compileClasspath"].forEach { file: File ->
        from(zipTree(file.absoluteFile))
    }
    duplicatesStrategy = DuplicatesStrategy.INCLUDE
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}