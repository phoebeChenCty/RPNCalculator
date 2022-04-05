# RPNCalculator
JavaFx Tutorial

### inside app's build.gradle
     mainClassName = 'RPNCalculator.App'

### App.java
add following at the beginning

    package RPNCalculator;
no 

    public static void main(String[] args)

### RPNCAlculator/.vscode/launch.json
add

    "vmArgs": "--module-path D:/JavaFX/openjfx-18_windows-x64_bin-sdk/javafx-sdk-18/lib --add-modules javafx.controls,javafx.fxml"

### run App.java
    D:\Coding\RPNCalculator> ./gradlew run
or

    D:\Coding\RPNCalculator\app> gradle run