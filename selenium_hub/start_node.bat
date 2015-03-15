
java -jar lib\selenium-server-standalone-2.43.1.jar -role node^
 -hub http://<GRID_HUB_ADDRESS>:4444/grid/register^
 -browser "browserName=internet explorer 8,plattform=WINDOWS"^
 -remoteHost http://<OWN_NODE_ADDRESS>:5555^
 -Dwebdriver.ie.driver=lib\IEDriverServer.exe
