Android Maven Template Project
==============================

Android template project which builds with maven, contains 4 modules:
  + Root
  + App
  + Test
  + Lib.

For each module configured testing frameworks:
  + [JUnit](http://www.junit.org/)
  + [Android Instrumentation](http://developer.android.com/tools/testing/testing_android.html)
  + [Robolectric](http://pivotal.github.com/robolectric/)
  + [Robotium](http://code.google.com/p/robotium/)

Project define 3 different build profiles which allow you to build your Android project in different environments:
  + Development
  + Test
  + Production.

During the build maven process targeted resources and substitutes required values from profiles.

Project and testing frameworks organized as follows:
```
 Root
 |---- App
 |    |---- src
 |    |---- test
 |         |---- JUnit
 |         |---- Robolectric
 |
 |---- Lib
 |    |---- src
 |    |---- test
 |         |---- JUnit
 |         |---- Robolectric
 |
 |---- Test
      |---- src
           |---- Instrumentation
           |---- Robotium
```