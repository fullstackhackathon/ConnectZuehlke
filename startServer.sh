#!/bin/bash

cd backend
java -jar build/libs/backend-0.0.1-SNAPSHOT.jar --spring.profiles.active=ci &
# For port changes add -Dserver.port=21000

until [ "`curl --silent --show-error --connect-timeout 1 -I http://localhost:8080 | grep '200'`" != "" ];
do
  echo --- sleeping for 5 seconds
  sleep 5
done

echo Application is ready!