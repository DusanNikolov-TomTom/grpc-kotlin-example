plugins {
    kotlin("jvm") version "1.8.10"
    id("application")
}

group = "com.example"
version = "0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

application {
    mainClass.set("com.example.MainKt")
}
