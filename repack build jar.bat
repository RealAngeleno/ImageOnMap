@echo off
color 0a
cd "build\libs"
del *-dev.jar
"..\..\advzip.exe" -z -3 *.jar