# Tron Math

## Description
Tron Math implements some specific methods of JDK8 x86 , which will produce 
different results in other platform environments.
The current [java-tron](https://github.com/tronprotocol/java-tron) runtime environment is JDK8 x86. 
To support the upgrade to JDK11 x86, incompatible functions are implemented in 
C++ inline assembly and package the native libraries used by java-tron.


## Using the Dependency
gradle

```gradle
    dependencies {
        implementation 'io.github.zhang0125:tron-math:0.1.0'
        }
```
maven
```maven
    <dependency>
        <groupId>io.github.zhang0125</groupId>
        <artifactId>tron-math</artifactId>
        <version>0.1.0</version>
    </dependency>
```

## Usage
Recommended Package imports:
```java
import org.tron.math.TronMath;
```

Loading dynamic library at server startup:
```java
TronMath.loadLib();
```

Use 
```java
double result = TronMath.pow(4. 0.5);
```

## Building
>The following Steps work on mac, linux well, other platforms are not verified yet.

### Supported Platforms

The following platforms are supported:
* OS X Mojave with X Code 11 (x86_64)
* CentOS  (x86_64)

### Prerequisites
*  GNU compiler toolchain, gcc-c++
*  JAVA(1.11+)，make sure the current session $JAVA_HOME is set.
*  [cmake2.8+](https://cmake.org/download/)
*  git
*  maven3
*  pkg-configls (linux maybe required)
*  libtool (linux maybe required)

### Build Procedure
First，build the native library on both osx64 and linux64 

```shell
git clone https://github.com/zhang0125/tron-math.git
cd tron-math/cpp
mkdir build && cd build
cmake ..
make
```
Use the dynamic libraries ```libtron_math.so``` and ```libtron_math.dylib``` built above to 
replace the dynamic libraries in ```src/main/resources/META-INF/native``` for the corresponding platform.

Then，build TronMath
```shell
mvn clean install
```

### Build Results
tron-math/target/tron-math-${version}.jar : The java class file to the library.