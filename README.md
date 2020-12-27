# [Codecov][1] Java Maven Example
[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2Fcodecov%2Fexample-java-maven.svg?type=shield)](https://app.fossa.com/projects/git%2Bgithub.com%2Fcodecov%2Fexample-java-maven?ref=badge_shield)

## Guide
### Travis Setup

Add to your `.travis.yml` file.
```yml
language: java

# Cobertura is not supported in JDK11 so you must downgrade the JDK that Travis uses if you want to use Cobertura with Travis.
# See https://github.com/cobertura/cobertura/issues/381
jdk:
  - openjdk8

script: "mvn cobertura:cobertura"

after_success:
  - bash <(curl -s https://codecov.io/bash)
```
### Produce Coverage Reports
#### Add Cobertura plugin
```xml
<plugin>
    <groupId>org.codehaus.mojo</groupId>
    <artifactId>cobertura-maven-plugin</artifactId>
    <version>2.7</version>
    <configuration>
        <formats>
            <format>html</format>
            <format>xml</format>
        </formats>
        <check />
    </configuration>
</plugin>
```
Call `mvn cobertura:cobertura` during your CI tests, [see here](https://github.com/codecov/example-java-maven/blob/master/.travis.yml#L4)

## Caveats
### Private Repos
Add to your `.travis.yml` file.
```yml
after_success:
  - bash <(curl -s https://codecov.io/bash) -t uuid-repo-token
```
## Support
### FAQ
- Q: Is there a Gradle example?<br/>A: **Yes**, enter [codecov/example-gradle][2]
- Q: Is there a Android example?<br/>A: **Yes**, enter [codecov/example-android][3]
- Q: Is there a JaCoCo example?<br/>A: **Yes**, enter [codecov/example-java][4]

1. More documentation at https://docs.codecov.io
2. Configure codecov through the `codecov.yml`  https://docs.codecov.io/docs/codecov-yaml

We are happy to help if you have any questions. Please contact email our Support at [support@codecov.io](mailto:support@codecov.io)

[1]: https://codecov.io/
[2]: https://github.com/codecov/example-gradle
[3]: https://github.com/codecov/example-android
[4]: https://github.com/codecov/example-java


## License
[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2Fcodecov%2Fexample-java-maven.svg?type=large)](https://app.fossa.com/projects/git%2Bgithub.com%2Fcodecov%2Fexample-java-maven?ref=badge_large)
