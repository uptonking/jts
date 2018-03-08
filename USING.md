# JTS User Guide

## Project Structure

JTS consists of several Java modules.
Each one corresponds to a separate JAR file.

The core modules are:

* `jts-core` - The JTS  core: geometry model, operations, algorithms, and spatial data structures
* `jts-io-common` - I/O classes for open spatial formats

The following modules depend on proprietary libraries, and are not built by default:

* `jts-io-ora` - Oracle reader and writer
* `jts-io-sde` - SDE reader and writer

The following modules are applications and data for testing and working with JTS

* `jts-tests` - The JTS XML test suite and the Test Runner application
* `jts-app` -The TestBuilder GUI, for working with JTS geometry interactively

## Using JTS with Maven

To include JTS in your Maven project, add a dependency block like the next one.

```xml
<dependency>
    <groupId>org.locationtech.jts</groupId>
    <artifactId>jts-core</artifactId>
    <version>${jts.version}</version>
</dependency>
```

JTS snapshot artifacts are published to the LocationTech Maven repository. To include JTS in your project, add the following repositories to your pom.

```xml
<repositories>
  <repository>
    <id>locationtech-releases</id>
    <url>https://repo.locationtech.org/content/groups/releases</url>
    <snapshots>
      <enabled>false</enabled>
    </snapshots>
  </repository>
  <repository>
    <id>jts-snapshots</id>
    <url>https://repo.locationtech.org/content/repositories/jts-snapshots</url>
    <releases>
      <enabled>false</enabled>
    </releases>
	<snapshots>
      <enabled>true</enabled>
    </snapshots>
   </repository>
</repositories>
```
