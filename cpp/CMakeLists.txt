cmake_minimum_required(VERSION 2.8)

project(tronmath)

find_package(Java REQUIRED)
find_package(JNI REQUIRED)


include_directories(include)
include_directories(${JNI_INCLUDE_DIRS})
include_directories(${JAVA_INCLUDE_PATH})
include_directories(${JAVA_INCLUDE_PATH2})

ADD_LIBRARY(tron_math SHARED tron_math.h tron_math.cpp)
libtron_math.jnilib