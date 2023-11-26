This contains automation test cases for https://www.saucedemo.com/ web site logging function.

Prerequisites:
1.install java : https://www.oracle.com/java/technologies/javase-downloads.html
2.Download Maven : https://maven.apache.org/download/cgi
    After downloading this extracts the zip file
    then go t bin folder and copy that path
    after that add that path to system variable

3.Download allure for operting sysytem : https://allurereport.org/docs/gettingstarted-installation/
    Download allure commandline zip file and extract it
    then go t bin folder and copy that path
    after that add that path to Systm variable

4.We can check this environment varibles are correctly set using following commands
    allure --version
    mvn --version


Report gearation

After run the test we can see in the inteliji IDEA there is a folder called allure results
Then copy that folder path (absolute path)
Open command promt
Run following command - allure serve "copied path"