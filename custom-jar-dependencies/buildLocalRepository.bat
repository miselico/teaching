cd custom-library
mvn clean package

cd target

mvn install:install-file -Dfile=custom-library-1.0-SNAPSHOT.jar -DgroupId=fi.teaching.custom.library -DartifactId=custom-library -Dversion=1.0-SNAPSHOT -Dpackaging=jar -DlocalRepositoryPath=../../customLocalRepo

cd ..
cd ..