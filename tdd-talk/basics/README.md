Getting started with Test Driven Development
============================================

* Start with an observation

    1 km = 1000 m

* If the observation is not "simple enough" choose a another:

    1 km = 1 km

* Write it down as an assertion

```java
assertThat(Distance.km(1), equalTo( Distance.km(1) ));
```

* Run!


* Make it pass


* Move to the next observation


* Repeat...until you find that the code could be done in a better way


* Refactor / Redesign

  * All tests must pass


Important things to know
------------------------

* _TDD_ doesn't replace other kinds of testing.
* _TDD_ not about tests, is about making easy to introduce changes in your code base.
* Refactor is not limited to small things like _extract method_. For example the code could be re-designed while
  maintaining compatibility with the tests.


Ideas to extend this exercise
-----------------------------

* Add support for other distance units (cm, mm).
* Extend the framework to support other kind of units (like kg).
