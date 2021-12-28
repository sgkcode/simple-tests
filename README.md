Run from command line:

mvn -Dsurefire.suiteXmlFiles=src\test\resources\suite1.xml -Denvironment=dev clean test

mvn -Dsurefire.suiteXmlFiles=src\test\resources\suite2.xml -Denvironment=dev clean test

mvn -Dsurefire.suiteXmlFiles=src\test\resources\suite3.xml -Denvironment=dev clean test
