# 목표
1. [백준 단계별 문제풀이 챌린지](JAVA/baekjun/)


# Study_Q-A
공부한 내용 정리

## 기본 상식

* [객체 지향 프로그래밍이란 무엇인가](#object-oriented-programming)
  * 객체 지향 개발 원칙은 무엇인가?
* [RESTful API 란](#restful-api)
* [MVC 패턴이란 무엇인가?](http://asfirstalways.tistory.com/180)

</br>

## Object Oriented Programming
* 사전적 의미
  * OOP란 Object-Oriented Programming의 약어로써 객체지향 프로그래밍을 의미한다.

* 쉬운 예시
  * 객체 지향 프로그래밍 이전의 프로그래밍 패러다임을 살펴보면, 중심이 컴퓨터에 있었다. 컴퓨터가 사고하는대로 프로그래밍을 하는 것이다. 하지만 객체지향 프로그래밍이란 인간 중심적 프로그래밍 패러다임이라고 할 수 있다. 즉, 현실 세계를 프로그래밍으로 옮겨와 프로그래밍하는 것을 말한다. 현실 세계의 사물들을 객체라고 보고 그 객체로부터 개발하고자 하는 애플리케이션에 필요한 특징들을 뽑아와 프로그래밍 하는 것이다. 이것을 추상화라한다.
데이터를 객체로 취급하여 프로그램에 반영한 것이며, 순차적으로 프로그램이 동작하는 기존의 것들과는 다르게 객체와 객체의 상호작용을 통해 프로그램이 동작하는 것을 말한다.

* OOP 특징
  * 설명
    * OOP 로 코드를 작성하면 이미 작성한 코드에 대한 재사용성이 높다. 자주 사용되는 로직을 라이브러리로 만들어두면 계속해서 사용할 수 있으며 그 신뢰성을 확보 할 수 있다. 또한 라이브러리를 각종 예외상황에 맞게 잘 만들어두면 개발자가 사소한 실수를 하더라도 그 에러를 컴파일 단계에서 잡아낼 수 있으므로 버그 발생이 줄어든다. 또한 내부적으로 어떻게 동작하는지 몰라도 개발자는 라이브러리가 제공하는 기능들을 사용할 수 있기 때문에 생산성이 높아지게 된다. 객체 단위로 코드가 나눠져 작성되기 때문에 디버깅이 쉽고 유지보수에 용이하다. 또한 데이터 모델링을 할 때 객체와 매핑하는 것이 수월하기 때문에 요구사항을 보다 명확하게 파악하여 프로그래밍 할 수 있다.
  
  * 정리
    * 객체지향 프로그래밍은 코드의 재사용성이 높다.

    * 코드의 변경이 용이

    * 직관적인 코드분석
  
    * 개발속도 향상

    * 상속을 통한 장점 극대화

  * 단점
    * 객체 간의 정보 교환이 모두 메시지 교환을 통해 일어나므로 실행 시스템에 많은 overhead 가 발생하게 된다. 하지만 이것은 하드웨어의 발전으로 많은 부분 보완되었다. 객체 지향 프로그래밍의 치명적인 단점은 함수형 프로그래밍 패러다임의 등장 배경을 통해서 알 수 있다. 바로 객체가 상태를 갖는다는 것이다. 변수가 존재하고 이 변수를 통해 객체가 예측할 수 없는 상태를 갖게 되어 애플리케이션 내부에서 버그를 발생시킨다는 것이다. 이러한 이유로 함수형 패러다임이 주목받고 있다.

_공부예정) 정말 간단한 내용만 정리_    
            함수형 프로그래밍(functional programming)은 자료 처리를 수학적 함수의 계산으로 취급하고 상태와 가변 데이터를 멀리하는 프로그래밍 패러다임의 하나이다. 
            명령형 프로그래밍에서는 상태를 바꾸는 것을 강조하는 것과는 달리, 함수형 프로그래밍은 함수의 응용을 강조한다.
                    
### Object(객체) 란
Object(객체)는 OOP에서 데이터(변수)와 그 데이터에 관련되는 동작(함수). 즉 절차, 방법, 기능을 모두 포함한 개념
    
> 예)
기차역에서 승차권을 발매하는 경우, 실체인 '손님'과 동작인 '승차권 주문'은 하나의 객체이며, 
실체인 '역무원'과 동작인 '승차권 발매'도 하나의 객체이다.
    
같은 성질, 같은 구조와 형태를 가지는 객체는 등급으로 정의하고 등급에 속하는 객체는 그 등급의 인스턴스라고 한다.

출처: https://hahahoho5915.tistory.com/16 [넌 잘하고 있어]          

## RESTful API

우선, 위키백과의 정의를 요약해보자면 다음과 같다.

> 월드 와이드 웹(World Wide Web a.k.a WWW)과 같은 분산 하이퍼미디어 시스템을 위한 소프트웨어 아키텍처의 한 형식으로 자원을 정의하고 자원에 대한 주소를 지정하는 방법 전반에 대한 패턴

`REST`란, REpresentational State Transfer 의 약자이다. 여기에 ~ful 이라는 형용사형 어미를 붙여 ~한 API 라는 표현으로 사용된다. 즉, REST 의 기본 원칙을 성실히 지킨 서비스 디자인은 'RESTful'하다라고 표현할 수 있다.

`REST`가 디자인 패턴이다, 아키텍처다 많은 이야기가 존재하는데, 하나의 아키텍처로 볼 수 있다. 좀 더 정확한 표현으로 말하자면, REST 는 `Resource Oriented Architecture` 이다. API 설계의 중심에 자원(Resource)이 있고 HTTP Method 를 통해 자원을 처리하도록 설계하는 것이다.

따라서, `Restful API`는 REST 특징을 지키면서 API를 제공하는 것

### REST 6 가지 원칙

* Uniform Interface - HTTP 표준에만 따른다면, 안드로이드/IOS 플랫폼이든, 특정 언어나 기술에 종속되지 않고 모든 플랫폼에 사용이 가능하며, URI로 지정한 리소스에 대한 조작이 가능한 아키텍처 스타일을 의미한다.

* Stateless(무상태성) - HTTP는 Stateless Protocol 이므로, REST 역시 무상태성을 갖는다. 즉, HttpSession과 같은 컨텍스트 저장소에 상태정보를 따로 저장하고 관리하지 않고, API 서버는 들어오는 요청만을 단순 처리하면 된다. 세션과 같은 컨텍스트 정보를 신경쓸 필요가 없어 구현이 단순해진다.

* Caching(캐시가능) - HTTP 기존의 웹 표준을 그대로 사용하므로, 웹에서 사용하는 기존의 인프라를 그대로 활용 가능하다. HTTP 프로토콜 기반의 로드밸런서(mod_proxy)나, SSL은 물론이고 HTTP가 가진 가장 강력한 특징 중의 하나인 캐싱 기능을 적용할 수 있다. 일반적인 서비스에서 조회 기능이 주로 사용됨을 감안하면, HTTP 리소스들을 웹 캐쉬 서버 등에 캐싱하는 것은 용량이나 성능 면에서 이점이 있다. 캐싱 구현은 HTTP 프로토콜 표준에서 사용하는 Last-Modified 태그나 E-Tag를 이용하면 가능하다.
  - 캐시란 무엇인가?
    웹 캐시는 자주 쓰이는 문서의 사본을 자동으로 보관하는 HTTP 장치이다. 웹 요청이 캐시에 도착했을 때, 캐시된 로컬 사본이 존재한다면, 그 문서는 원 서버가 아니라 그 캐시로부터 제공된다.

* Client-Server - REST 서버는 API 제공, 클라이언트는 사용자 인증이나 컨텍스트(세션, 로그인 정보 등)을 직접 관리하는 구조로 각각의 역할이 확실히 구분되기 때문에 클라이언트와 서버에서 개발해야 할 내용이 명확해지고 서로간 의존성이 줄어들게 된다.

* Self-descriptiveness (자체 표현 구조) : 동사(Method) + 명사(URI) 로 이루어져있어 어떤 메서드에 무슨 행위를 하는지 알 수 있으며, 메시지 포맷 역시 JSON을 이용해서 직관적으로 이해가 가능한 구조로, REST API 메시지만 보고도 이를 쉽게 이해할 수 있다.

* Client - Server 구조 : REST 서버는 API 제공, 클라이언트는 사용자 인증이나 컨텍스트(세션, 로그인 정보 등)을 직접 관리하는 구조로 각각의 역할이 확실히 구분되기 때문에 클라이언트와 서버에서 개발해야 할 내용이 명확해지고 서로간 의존성이 줄어들게 된다.

* 계층형 구조 : API 서버는 순수 비지니스 로직을 수행하고, 그 앞단에 사용자 인증, 암호화(ssl), 로드밸런싱 등을 하는 계층을 추가하여 구조상의 유연상을 둘 수 있다. 이는 간단하게는 HA Proxy나 Apache의 Reverse Proxy를 통해, 더 나아가서는 API gateway 등을 활용하여 Micro Service Architecture로도 구현이 가능하게 한다.

* Hierarchical system
* Code on demand  
  _cf) 보다 자세한 내용에 대해서는 Reference 를 참고해주세요._
  _참고자료) https://brainbackdoor.tistory.com/53
  
### RESTful 하게 API 를 디자인 한다는 것은 무엇을 의미하는가.(요약)

1.  **리소스** 와 **행위** 를 명시적이고 직관적으로 분리한다.

* 리소스는 `URI`로 표현되는데 리소스가 가리키는 것은 `명사`로 표현되어야 한다.
* 행위는 `HTTP Method`로 표현하고, `GET(조회)`, `POST(생성)`, `PUT(기존 entity 전체 수정)`, `PATCH(기존 entity 일부 수정)`, `DELETE(삭제)`을 분명한 목적으로 사용한다.

2.  Message 는 Header 와 Body 를 명확하게 분리해서 사용한다.

* Entity 에 대한 내용은 body 에 담는다.
* 애플리케이션 서버가 행동할 판단의 근거가 되는 컨트롤 정보인 API 버전 정보, 응답받고자 하는 MIME 타입 등은 header 에 담는다.
* header 와 body 는 http header 와 http body 로 나눌 수도 있고, http body 에 들어가는 json 구조로 분리할 수도 있다.

3.  API 버전을 관리한다.

* 환경은 항상 변하기 때문에 API 의 signature 가 변경될 수도 있음에 유의하자.
* 특정 API 를 변경할 때는 반드시 하위호환성을 보장해야 한다.

4.  서버와 클라이언트가 같은 방식을 사용해서 요청하도록 한다.

* 브라우저는 form-data 형식의 submit 으로 보내고 서버에서는 json 형태로 보내는 식의 분리보다는 json 으로 보내든, 둘 다 form-data 형식으로 보내든 하나로 통일한다.
* 다른 말로 표현하자면 URI 가 플랫폼 중립적이어야 한다.

### 어떠한 장점이 존재하는가?

1.  Open API 를 제공하기 쉽다
2.  멀티플랫폼 지원 및 연동이 용이하다.
3.  원하는 타입으로 데이터를 주고 받을 수 있다.
4.  기존 웹 인프라(HTTP)를 그대로 사용할 수 있다.

### 단점은 뭐가 있을까?

1.  사용할 수 있는 메소드가 4 가지 밖에 없다.
2.  분산환경에는 부적합하다.
3.  HTTP 통신 모델에 대해서만 지원한다.

위 내용은 간단히 요약된 내용이므로 보다 자세한 내용은 다음 Reference 를 참고하시면 됩니다 :)

### URI 설계시 주의할 점

1. 슬래시 구분자(/)는 계층 관계를 나타내는데 사용

2. URI 마지막 문자로 슬래시(/)를 포함하지 않는다.

3. 하이픈(-)은 URI 가독성을 높이는데 사용

4. 밑줄(_)은 URI에 사용하지 않는다.

5. URI 경로에는 소문자가 적합하다.

6. 파일확장자는 URI에 포함하지 않는다.

### Todo 기능을 구현한다고 가정했을 때의 Restful API 표준
 
| endpoint | 기능 |
|---|:---:|
| GET /todos	| List all todos |
| POST /todos	| Create a new todo |
| GET /todos/:id	| Get a todo |
| PUT /todos/:id	| Update a todo |
| DELETE /todos/:id	| Delete a todo and its items |
| GET /todos/:id/items |	Get a todo item |
| PUT /todos/:id/items	| Update a todo item |
| DELETE /todos/:id/items	| Delete a todo item |

##### Reference

* [REST API 제대로 알고 사용하기 - TOAST](http://meetup.toast.com/posts/92)
* [바쁜 개발자들을 위한 RESTFul api 논문 요약](https://blog.npcode.com/2017/03/02/%EB%B0%94%EC%81%9C-%EA%B0%9C%EB%B0%9C%EC%9E%90%EB%93%A4%EC%9D%84-%EC%9C%84%ED%95%9C-rest-%EB%85%BC%EB%AC%B8-%EC%9A%94%EC%95%BD/)
* [REST 아키텍처를 훌륭하게 적용하기 위한 몇 가지 디자인 팁 - spoqa](https://spoqa.github.io/2012/02/27/rest-introduction.html)

</br>

## MVC 패턴?
[포스팅](https://m.blog.naver.com/jhc9639/220967034588)
[포스팅](http://asfirstalways.tistory.com/180)

</br>

[출처 목록](https://github.com/JaeYeopHan/Interview_Question_for_Beginner/tree/master/Development_common_sense)
          (https://m.blog.naver.com/jhc9639/220967034588)
