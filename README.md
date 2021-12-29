Run from command line:

mvn -Dsurefire.suiteXmlFiles=src\test\resources\suite1.xml clean test

mvn -Dsurefire.suiteXmlFiles=src\test\resources\suite2.xml clean test

mvn -Dsurefire.suiteXmlFiles=src\test\resources\suite3.xml clean test

mvn -Dsuite.file=suite1 clean test

mvn -Dsuite.file=suite2 clean test

mvn -Dsuite.file=suite3 clean test
