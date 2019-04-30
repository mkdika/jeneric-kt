## How to Contribute


### Creating an issue
* Reporting bug or hotfix, remember to include sufficient information.
* New features or functions, remember to add sample cases.
* Asking questions or help.
* Suggestions, advices and recommendations.
* __Note:__ Please tag the proper available labels.


### Creating a PR
Every PR will be reviewed and considered.


#### How to increase the chance of having your PR merged

* Ask about the feature beforehand (or pick one of the open issues).
* If no issue exists, create an issue for the PR.
* Format your code so it looks somewhat like the rest of the source.
* Try to write some unit test for your change. There are a lot of examples in the `test/kotlin` dir.
* Add sufficient commit message along with Github issues number.
* In order to maintain the standard quality of delivery, here are some metric that we used:
	* Coverage test: __>= 95%__ _(Will be check automatically in CI)_.
	* Mutation test: __>= 60%__


### How to run the test

#### Unit test and Coverage test

```bash
./gradlew clean test
```

#### Mutation test

```bash
./gradlew pitest
```

All generated test reports can be found at `build/reports/`.


### Libraries used for test suite

- [JUnit4](https://junit.org/junit4/)
- [AssertJ 3.11](https://joel-costigliola.github.io/assertj/)
- [JUnitParams 1.1.1](http://pragmatists.github.io/JUnitParams/)
- [Jacoco](https://docs.gradle.org/current/userguide/jacoco_plugin.html)
- [PiTest](https://gradle-pitest-plugin.solidsoft.info/)

Thanks! :heart: