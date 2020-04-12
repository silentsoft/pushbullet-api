# Pushbullet API

![release](https://img.shields.io/badge/release-0.1.0-blue.svg)
[![Build Status](https://travis-ci.org/silentsoft/pushbullet-api.svg?branch=master)](https://travis-ci.org/silentsoft/pushbullet-api)
[![license](https://img.shields.io/badge/license-Apache--2.0-green.svg)](https://github.com/silentsoft/pushbullet-api/blob/master/LICENSE.txt)
[![HitCount](http://hits.dwyl.io/silentsoft/pushbullet-api.svg)](http://hits.dwyl.io/silentsoft/pushbullet-api)

`Pushbullet API` is a simple Java library to send a Pushbullet note to specfic device, client, channel and email.

## Features
  - [sendNote](https://docs.pushbullet.com/#create-push)
    - ```java
      PushbulletAPI.sendNote(accessToken, TargetType.device_iden, deviceIden, "Title", "Body");
      ```
  - [getDevices](https://docs.pushbullet.com/#list-devices)
    - ```java
      PushbulletAPI.getDevices(accessToken);
      ```
  - [getUserInfo](https://docs.pushbullet.com/#get-user)
    - ```java
      PushbulletAPI.getUserInfo(accessToken);
      ```

## Dependency
```
<dependencies>
    <dependency>
        <groupId>org.silentsoft</groupId>
        <artifactId>pushbullet-api</artifactId>
        <version>0.1.0</version>
    </dependency>
</dependencies>
``` 

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please note we have a [CODE_OF_CONDUCT](https://github.com/silentsoft/pushbullet-api/blob/master/CODE_OF_CONDUCT.md), please follow it in all your interactions with the project.

## License
Please refer to [LICENSE](https://github.com/silentsoft/pushbullet-api/blob/master/LICENSE.txt) and [NOTICE](https://github.com/silentsoft/pushbullet-api/blob/master/NOTICE.md).
