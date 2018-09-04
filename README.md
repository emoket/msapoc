# msapoc

MSA 도입을 위한 POC

## 시나리오 1차

## 시나리오 2차

## Ports 구성

| Application                       | Port                  |
| --------------------------------- | --------------------- |
| Limits Service                    | 8080, 8081, ...       |
| Currency Exchange Service         | 8000, 8001, 8002, ... |
| Currency Conversion Service       | 8100, 8101, 8102, ... |
| Spring Cloud Config Server        | 8888                  |
| Netflix Eureka Naming Server      | 8761                  |
| Netflix Zuul API Gateway Server   | 8765                  |
| Zipkin Distributed Tracing Server | 9411                  |