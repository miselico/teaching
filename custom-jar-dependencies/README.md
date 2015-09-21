#Example of custom local repository
There are cases when the external library that you want to add to your project is not available in any centralized repository and you only
have the JAR file. In such situation it is good to have the an additional local repository located inside your project.

## Install a JAR to custom local repository
In order to install the jar to custom local repository run the following command from the command line

	mvn install:install-file -Dfile=<name of the jar file>
		-DgroupId=<group ID that should be used for dependency importing, for instance fi.tutorial>
		-DartifactId=<artifact ID that should be used for the dependency importing, for instance custom-library>
		-Dversion=<version, for instance 1.0-SNAPSHOT>
		-Dpackaging=jar
		-DlocalRepositoryPath=<location of the local repository; for instance ../../customLocalRepo>
		
##Using the custom local repository
Before we can start adding the dependencies to our pom.xml, we first have to specify the location of the new repository.
It can be achieved by adding the following lines

	<repositories>
        <repository>
            <id>my-local-repo</id>
            <name>My local repository</name>
            <url>file://../customLocalRepo</url>
        </repository>
    </repositories>
	
Where "../customLocalRepo" is the relative location of the repository.
Starting this point you can add dependencies located in your custom repository.