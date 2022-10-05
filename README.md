
# Wikipedia page search tests

## Summary

It is a demo project of UI Testing of the [Wikipedia]( https://en.wikipedia.org/) search function.
<br>
The auto tests work on the [JUnit 5](https://junit.org/junit5/docs/current/user-guide/) test framework and use [Selenium WebDriver](https://www.selenium.dev/documentation/webdriver/) for browser interaction.


## Getting Started
To run this project you need to have Java and maven installed:

* [Java 17](https://openjdk.org/projects/jdk/17/) - Java based project
* [Maven](https://maven.apache.org/) - Dependency Management


### WebDriver Versioning

WebDriver is compatible with the Chrome version<br> 106.0.5249.61 <br>
If your browser version differs, you need to download the suitable version of
ChromeDriver from [here](https://sites.google.com/chromium.org/driver/)


## Test suite

The test suite in the file `WikipediaSearchTest.java` includes six tests:

1. openHomePage
2. openSearchPage
3. searchLowerCase
4. searchUpperCase
5. enterSearch
6. searchButtonSearch

## Running tests and generating a report

Test reports can be generated with 'maven-surefire-report-plugin' maven plugin.
The plugin can generate the report using its standalone goal:

```
mvn surefire-report:report
```


## Authors

**Ivan Ulianov** 
<br>
[Linkedin](https://www.linkedin.com/in/ivan-ulianov-qa-automation/)




