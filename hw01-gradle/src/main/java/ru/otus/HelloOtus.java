/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ru.otus;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.base.MoreObjects.firstNonNull;


/**
 *
 * To start the application:
 * gradlew build
 * java -jar ./hw01-gradle/build/libs/hw01-gradle.jar
 */
public class HelloOtus {
    public static void main(String... args) {

        String first = null;
        String second = "Hello";
        System.out.println(firstNonNull(first, second));

    }
}
