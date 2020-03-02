# Selenium Grid Homework

### Homework 1 - Run your tests on different browsers
#### JAVA AUTOMATION A4  Homework - Run your tests on different browsers
1. Run your tests on different browsers
2. Change your tests to use different driver options. To run them on Firefox, Safari or Edge browsers

### Homework 2 - Implement Parallel testing
#### JAVA AUTOMATION A4  Homework - Implement Parallel testing
1. Implement Parallel testing
2. Add option to your tests to run them in parallel in 5 threads


### Homework 3 - Set up Selenium grid locally
#### JAVA AUTOMATION A4  Homework - Set up Selenium grid locally
1. Set up Selenium grid locally
2. Run your tests through Selenium Grid, not through the driver directly.

### Running Grid Locally
```bash
http://localhost:4444/grid/console/
````

### Command to run the Hub
```bash
java -jar selenium-server-standalone-3.141.59.jar -role hub
````

### Command to run the Node
```bash
java -jar selenium-server-standalone-3.141.59.jar -role node -hub http://localhost:4444/grid/register/ -port 5556 -browser browserName=chrome,maxInstances=2,platform=MAC -browser browserName=firefox,maxInstances=2,platform=MAC -browser browserName=safari,maxInstances=1,platform=MAC
````
