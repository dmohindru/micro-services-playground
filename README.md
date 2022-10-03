# micro-services-playground
This repository contains set of small code examples for play with various set of spring microservices features.
-----------------------------------------------------------------------------------------
Name: config_server_example
Description: This experiment has three services
1. Config server which reads the configuration from github some of them are encrypted
then decrypt these value and provide as plain values to connecting services.
2. ServiceA which reads project related values from config server and provides access to
some of these values via GET endpoint.
3. ServiceB very similar to SeviceA which reads project related values from config server
and provides access to some of these values via GET endpoint.
-----------------------------------------------------------------------------------------