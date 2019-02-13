#!/bin/bash
VERSION=$1
SERVERPORT=21000

# Verify Version provided.
if [ -z "$VERSION" ]
then
      echo "Please provide the version to execute as parameter."
      exit -1
fi

echo Booting up application with version $VERSION

# Kill previously running server
pkill -F server.pid

# Execute
java -jar -Dserver.port=$SERVERPORT backend/build/libs/backend-$VERSION.jar --spring.profiles.active=ci > server.log &

# Store pid id in file
echo $! > server.pid

# Curl to check if server is running, otherwise sleep for 5 seconds.
until [ "`curl --silent --show-error --connect-timeout 1 -I http://localhost:$SERVERPORT | grep '200'`" != "" ];
do
  echo --- sleeping for 5 seconds
  sleep 5
done

echo Application is ready!