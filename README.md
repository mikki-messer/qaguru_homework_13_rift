# Automated tests for the RedRift.com main page
## <a href = "https://redrift.com" target ="_blank">redrift.com</a>

## :rescue_worker_helmet: Contents

- <a href="#rescue_worker_helmet-coverage">Coverage</a>
- <a href="#rescue_worker_helmet-technology-stack">Technology stack</a>
- <a href="#rescue_worker_helmet-how-to-launch-from-the-command-line">How to launch from the command line</a>

## :rescue_worker_helmet: Coverage

- Check that the "Join our team" link opens the "Jobs" page
- Check that the "News" link opens the "Blog & News" page
- Check that on scrolling down to the "100% Success Rate" block the lion widget appears
- Check that the lion widget disappears after the click on the close button
- Check that the contact card with links to the Facebook and LinkedIn appears on mouse hover over the first contact in the "Team block"

## :rescue_worker_helmet: Technology stack

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logos/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/logos/Java.svg">
<img width="6%" title="Selenide" src="images/logos/Selenide.svg">
<img width="6%" title="Selenoid" src="images/logos/Selenoid.svg">
<img width="6%" title="Allure Report" src="images/logos/Allure_Report.svg">
<img width="6%" title="Gradle" src="images/logos/Gradle.svg">
<img width="6%" title="JUnit5" src="images/logos/JUnit5.svg">
<img width="6%" title="GitHub" src="images/logos/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logos/Jenkins.svg">
<img width="6%" title="Telegram" src="images/logos/Telegram.svg">
</p>

## :rescue_worker_helmet: How to launch from the command line

### How to launch on the local machine

```
gradle clean test
```

### How to launch remotely on Jenkins
```
clean
test
-DselenoidURL=${SELENOID_URL}
```
### Jenkins build params
- selenoidURL - the URL of the Selenoid instance to run tests on, default value: `selenoid.autotests.cloud`
Don't forget to create the `credentials.properties` file in the `src/test/resources/configuration/` folder with the login and password to the Selenoid
Credentials.properties example, put your real login and password there
```
login=myAwesomeLogin
password=mySecurePassword
```
