# Notes

## Common commands

### List all tasks

```
gradle tasks --all
```

### Perform dry run

```
gradle createZip --dry-run
```

### Force tasks to run

```
gradle createZip --rerun-tasks
```

### Build Java Classes

```
./gradlew compileJava --console=verbose
```

### Build Java Classes and Resources

```
./gradlew classes --console=verbose
```

### Build Java Documentation

```
./gradlew javadocs
```

### Show Java Dependencies

```
./gradlew dependencies
```

### Show Java Dependencies In Detail

```
./gradlew dependencyInsight
```

### List Gradle Projects

```
./gradlew projects
```

### Run Java

Requires plugin 'application' and 'mainClass' to be defined.

```
./gradlew run
```

## Publishing Jar

```
plugins {
  id 'maven-publish'
}

publishing {
  publications {
    maven(MavenPublication) {
      groupId = 'org.something'
      artifactId = 'arti'
      from components.java
    }
  }
  
  repositories {
    maven {
      url = "$rootProject.buildDir/m2repo"
    }
  }
} 
```
