# [ElasticSearch Filebeat, logstash](https://findstar.pe.kr/2018/05/28/install-and_configuration-filebeat-logstash/)


# MQTT

## 개념
- MQTT(메시지 큐잉 텔레메트리 트랜스포트, Message Queuing Telemetry Transport)는 ISO 표준(ISO/IEC PRF 20922) 발행-구독 기반의 메시징 프로토콜이다.
- TCP/IP 프로토콜 위에서 동작한다. 
## 특징
- 발행-구독 메시징 패턴은 메시지 브로커가 필요하다. -> Broker, Publisher, Subscriber 구조!\
[이미지](https://user-images.githubusercontent.com/64191382/111421929-280cb200-8731-11eb-87be-ffabc64cfe53.png)\
- 최소한의 전력과 패킷량으로 통신하는 프로토콜입니다. 따라서 IOT와 모바일 어플리케이션 등의 통신에 매우 적합한 프로토콜입니다.
- Publisher는 Topic을 발행(publish)
- Subscriber는 Topic에 구독(subscribe)
- Broker는 이들을 중계
- 단일 Topic에 여러 Subscriber가 구독할 수 있기 때문에, 1:N 통신 구축에도 매우 유용합니다.
- MQTT는 발행인과 구독자가 메시지를 주고 받을 수 있도록 다리를 놔주는 역할만을 한다.
## Qos(Quality of Service) - Qos와 품질 비례, 성능 반비례 
- 0: 메세지는 한번만 전달되며, 전달이후의 수신과정을 체크하지 않는다. (default)
- 1: 메세지는 한번 이상 전달되고, 핸드셰이킹 과정을 추적하나, 엄격하게 추적하지 않기 때문에 중복수신의 가능성이 있다.
- 2: 메세지는 한번만 전달되고, 핸드셰이킹의 모든 과정을 체크한다.

## Broker
- 종류: Mosquitto, HiveMQ, mosca, ActiveMQ, RabbitMQ (Plug-in 형태로 지원) 등등(테스트 Mosquitto로 진행)
### 설치
1. Docker Mosquitto 이미지 다운
```sudo docker pull ansi/mosquitto ```
2. Mosquitto 컨테이너 생성
``` sudo docker run -p 1883:1883 --name mosquitto -d ansi/mosquitto> ```

## Publish
### JS 코드
``` js
const mqtt = require('mqtt');
const client = mqtt.connect('mqtt://localhost');

  //subscriber
  client.subscribe(['test1', 'test2']);

  client.on('message', function (topic, message) {
    console.log(`토필: ${topic.toString()}, 메시지: ${message.toString()}`);
    if(topic.toString() === 'test10'){
      client.end();
    }
  });

// publisher
var num = 0;
setInterval(
  () =>{
    client.publish('test'+num, 'hello, '+num,{qos:2});
    num++;
    if(num%10 == 0){
      num = 0;
    }
  },
  2000
);
```

# 참고 자료
- [위키백과](https://ko.wikipedia.org/wiki/MQTT)
- [블로그](https://medium.com/@jspark141515/mqtt%EB%9E%80-314472c246ee)
