plugins {
    id("org.jetbrains.kotlin.jvm") version "1.7.20"
    application
}

repositories {
    jcenter()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.google.guava:guava:31.1-jre")
}

application {
    mainClass.set("AppKt")
}
