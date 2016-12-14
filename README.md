[Codecov][0] Java Maven Example [![Build Status](https://travis-ci.org/Jimver/example-java-maven.svg?branch=master)](https://travis-ci.org/Jimver/example-java-maven)
===============================

1. Add `cobertura-maven-plugin` plugin to your pom.xml file, [see here](https://github.com/codecov/example-java-maven/blob/master/pom.xml#L47-L58)
2. Call `bash <(curl -s https://codecov.io/bash)` at the end of your CI build, [see here](https://github.com/codecov/example-java-maven/blob/master/.travis.yml#L7)
  - [Learn how to include your upload repository token][5]

> Other Examples
> - [Java JaCoCo Example][1]
> - [Android Example][3]
> - [Gradle Example][2]



[0]: https://codecov.io/
[1]: https://github.com/codecov/example-java
[2]: https://github.com/codecov/example-gradle
[3]: https://github.com/codecov/example-android
[5]: http://docs.codecov.io/docs/about-the-codecov-bash-uploader#section-upload-token
