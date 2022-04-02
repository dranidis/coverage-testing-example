# coverage-testing

An example used in basis-path-testing Software Engineering module.

## How to use

### Build and test:

```
mvn package
```

### Generate a coverage report (target/site/jacoco):

```
mvn jacoco:report
```

### Generate mutation coverage report
```
mvn -DwithHistory package org.pitest:pitest-maven:mutationCoverage
```
