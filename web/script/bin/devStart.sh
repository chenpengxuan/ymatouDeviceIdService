#!/bin/bash

source "/etc/profile"
MAIN_CLASS="com.ymatou.deviceid.starter.Application"
APP_NAME="sellerquery.trading.iapi.ymatou.com"
CLASS_PATH="lib/*:conf"
JAVA_OPTS="-Xms1096M -Xmx1096M -Xmn500M -XX:PermSize=256M -XX:MaxPermSize=512M \
    -XX:+UseConcMarkSweepGC -XX:+UseCMSInitiatingOccupancyOnly -XX:CMSInitiatingOccupancyFraction=75 \
    -XX:+PrintGCDetails -XX:+PrintGCDateStamps -verbose:gc -XX:+DisableExplicitGC"

#############intial work##########################
cd /usr/local/${APP_NAME}/default

##############launch the service##################
nohup java ${JAVA_OPTS} -cp ${CLASS_PATH} ${MAIN_CLASS} >> log 2>&1 &

##############check the service####################
ps aux | grep ${MAIN_CLASS} | grep -v grep > /dev/null 2>&1
if [ $? -eq 0 ]; then
    exit 0
else
    exit 1
fi
