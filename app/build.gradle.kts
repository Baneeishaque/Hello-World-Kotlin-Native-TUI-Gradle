plugins {
    id("org.jetbrains.kotlin.jvm") version "1.4.30-RC"
    application
}

repositories {
    jcenter()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom")) 
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8") 
    implementation("com.google.guava:guava:29.0-jre") 
}

application {
    mainClass.set("AppKt") 
}