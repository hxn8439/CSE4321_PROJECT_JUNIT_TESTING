README
**************
File included: source_code.zip->tokens.txt, charParameterTest.java, CommentParameterTest.java, handletokenTest.java, identifierParameterTest.java,
keywordParameterTest.java, numParameterTest.java, printoutTokenTest.java, specsymbolParameterTest.java, stringParameterTest.java,
SuiteTestExecution.java, Printtokens.java
**************
Description: This program provides an opportunity to practice the basic concepts, principles, and techniques covered in Software Testing. From these
collection of files, it is a good example of control flow testing a program of a moderate size (Printtokens.java) which implements a string
tokenizer. There are approximately more than 600 lines of source code (Printtokens.java) with solved 15 seeded faults. However, there are 27 faults 
that were discovered during Software Testing. 

**************
Compilation instructions:

->Run netbeans, (this was performed on Windows 10 OS)
->install plugin for JaCoCoverage from tools->Plugins
->File->Import Project->From Zip...click browse and select source_code.zip from your directory.
->download and import JUnit-4.11 jar and hamcrest-core-1.3.jar into a ProjectCSE4321 -> Libraries folder
->rightclick on ProjectCSE4321 and go to properties->Run-> in Arguements field choose a directory that directs
your text file when the source java code is compiled. e.g. C:\....\Documents\NetBeansProjects\ProjectCSE4321\tokens.txt
-> click okay and the project is ready for unit and system testing.

Unit testing:
->Navigate to TestPackages folder and open SuiteTestExecution.java, right-click on file and click test file. This will execute all unit
tests within the project folder. 

End-to-End system Testing:
-> Navigate to Source Packages -> Printtokens.java->right click and click to Run Project. 

JaCOCoverage codde analysis:
->right click on Project CSE4321.
->click Run with JaCoCoverage for system testing execution.
->click Test with JaCoCoverage for Unit testing execution.

