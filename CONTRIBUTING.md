## How to Contribute


### Creating an issue
* Reporting bug or hotfix, remember to include sufficient information.
* New features or functions, remember to add sample cases.
* Asking questions.
* Suggestions, advices and recommendations.


### Creating a PR
Every PR will be reviewed and considered.


#### How to increase the chance of having your PR merged

* Ask about the feature beforehand (or pick one of the open issues).
* If no issue exists, create an issue for the PR.
* Format your code so it looks somewhat like the rest of the source.
* Write a proper and sufficient __javadoc__ for each method or attribute, give some example of usage if needed. Try to follow the style and convension from the existing code.
* Try to write some unit test for your change. There are a lot of examples in the `test/kotlin` dir.
* Add sufficient commit message along with Github issues number.
* In order to maintain the standard quality of delivery, here are some metric that we used:
	* Coverage test: __>= 95%__
	* Mutation test: __>= 60%__


### How to run the test

#### Unit test

```bash
./gradlew test
```

#### Coverage test

```bash
./gradlew jacocoTestReport
```

#### Mutation test

```bash
./gradlew pitest
```

Thanks! :heart: