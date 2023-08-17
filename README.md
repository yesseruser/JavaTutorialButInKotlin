# [Java Tutorial](https://docs.oracle.com/javase/tutorial/getStarted/cupojava/win32.html) but in Kotlin (at least partially)
This application is basically the Java tutorial, but the main java function is run from Kotlin.
The application prints `"Hello World"` in the prompt.

**If you are running this application from the downloaded JAR file, make sure java is installed! (Homebrew automatically installs it)**

How to run:
### JAR file
If you have downloaded the *.jar file from the [Releases Page](https://github.com/yesseruser/JavaTutorialButInKotlin/releases) then you can run it by following these steps:
1. Open a command prompt or PowerShell - On Windows press the Windows logo and type "CMD", then press enter. On Mac or Unix-based OSes search for the Terminal using its method of searching.
2. Type in the prompt: `java -jar <path/to/your/jarfile>` (the path is `C:\Users\<YourUserName>\Downloads\JavaTutorialButInKotlin-X.X.jar` on Windows and `~/Downloads/JavaTutorialButInKotlin-X.X.jar` on Mac or Unix). You can use the Tab key to autofill directories and filenames.
3. Press Enter.

### Homebrew
To install and run the app using homebrew, download the `homebrew-javatutorinkt.rb` file from the [Releases Page](https://github.com/yesseruser/JavaTutorialButInKotlin/releases). To install, follow these instructions:
1. Download the `homebrew-javatutorinkt.rb` file.
2. Run `brew install ~/path/to/downloaded/file.rb` in a terminal. Make sure to change the path to your downloads directory (`~/Downloads/homebrew-javatutorinkt.rb` by default).
3. To run the app, run `javatutorinkt` in a terminal.