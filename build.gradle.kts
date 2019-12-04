plugins {
    java
    application
}

repositories {
    jcenter()
}

dependencies {
    testImplementation("junit:junit:4.12")
}

application {
    mainClassName = "ru.avalon.java.j20.labs.Application"
}


sourceSets["main"].java.srcDir("src")
sourceSets["test"].java.srcDir("test")
