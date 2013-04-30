Examples for the TDD Colts Talk
===============================

* `basics` a simple example using distance units
* `marsrovers` a _getting started_ project to design a mars rovers implemetation using TDD.
* `marsrovers-spock` same as `marsrovers` but tested using the Spock framework instead of JUnit.


Eclipse import
--------------

### On Eclipse Juno (Eclipse 4+) 
* Use `File -> Import..` then choose `Maven -> Existing Maven Projects`.
* Choose this directory as root folder (you can uncheck `marsrovers-spock` if the Groovy Plugin is not installed).
* Next.. Finish
* Run the test doing right click on `test` directories (`src/test/java`), then choose  `Run -> JUnit Tests`.

### On Eclipse Indigo (Eclipse 3.7)
* Install [m2eclipse][1]
* Follow the same steps as Eclipse 4

[1]: http://eclipse.org/m2e/download/

Running with Maven
------------------

* Install [Maven 3][2], and ensure that is available in the PATH

* The run `mvn test` to run the unit tests for all the modules in this project (grab a coffee it can take a while the first time).

[2]: http://maven.apache.org/
