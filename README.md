# kafka-ssl



This is poc for kafka-consumer and kafka-producer using Camel

Following Properties are configurable

```
server.port: 9999
spring.main.sources: uk.co.argos.middleware.Application
isProducerUp: false
isConsumerUp: false



kafka:
       topic.name: ssl_topic
       topic.key: 1
       topic.partitionKey: 0
       broker.url: localhost:9092

# options always starts with & and enclosed in double quotes("")
producer:
         options:
         input.message.directory: /Users/sumeetraheja/development/workspace/company/argos/temp/kafka-messages

consumer:
         options: "&groupId=testing1&autoOffsetReset=earliest&consumersCount=1"
         output.message.directory: /Users/sumeetraheja/development/workspace/company/argos/temp/kafka-output-messages
```

**Override Properties**

--spring.config.location=file:/Users/sumeetraheja/development/workspace/company/argos/temp/myapplication.yml

**Overriding particular Property**

java -jar your-app.jar --server.port=8081
OR
mvn spring-boot:run -Drun.arguments="--server.port=8081"

**Producer:**
For running Producer set "isProducerUp" to "true"

**Consumer:**
* For running Producer set "isConsumerUp" to "true"


**Build package jar And testing**

Build war  : `mvn clean install `

**You can also execute the fat WAR directly:**

  `java -jar target/kafka-ssl-1.0-SNAPSHOT.war`
