# Multi Browser Testing with Selenium Hub and Selenide



*Prerequisites*:

*Used software*
Java, Maven, VirtualBox (or other VM-Provider), Selenium, Selenide

https://github.com/SeleniumHQ/selenium/wiki/Grid2


## Get Started
1. Setup different virtual machines with different browsers. For different IE browsers use virtual machines from https://www.modern.ie/de-de/virtualization-tools#downloads

2. checkout on both, server and node selenium machine this project

3. start on server start_server.bat (or .sh)

4. start on node start_node.bat. Before starting, check IP-Adresses from server and node.

5. on the server machine, run the AppTest.java with mvn test, or from your IDE.