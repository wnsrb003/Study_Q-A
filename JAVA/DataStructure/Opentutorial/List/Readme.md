#List

### 인덱스가 중요한 경우는 배열을 사용, 인덱스가 중요하지 않은 경우에는 리스트를 사용한다.

* 배열의 삽입/삭제 연산에 대한 비효율성을 극복하고자 등장한 것이 LinkedList 이다. 
  Array와 LinkedList의 차이점은, LinkedList는 논리적으론 순서대로 되어있으나 물리적으론 순서대로 되어있지 않다. 
  대신 LinkedList는 각 원소가 다음 index 위치에 해당하는 물리적 주소를 가지고 있다. 그렇기에 삽입/삭제시에는 데이터를 Shift할 필요 없이, 해당되는 원소의 물리적 주소만 변경해주면 된다. 
  하지만 이 같은 특징 때문에 원하는 index를 참조하려면, 1번 index부터 차례대로 접근해야 한다는 비효율성이 있다.
  
## List
* 리스트는 배열이 가지고 있는 인덱스라는 장점을 버리고 대신 빈틈없는 데이터의 적재 라는 장점을 취한 데이터 스트럭쳐
* 리스트 자료구조의 핵심은 엘리먼트들 간의 순서. 따라서 리스트를 다른 말로는 시퀀스(sequence) 라고도 부른다. 즉 순서가 있는 데이터의 모임이 리스트이다.
* 리스트에서 인덱스는 몇 번째 데이터인가 정도의 의미를 가진다. (배열-Array에서의 인덱스는 값에 대한 유일무이한 식별자)
* 빈 엘리먼트는 허용하지 않는다.
* 순차성을 보장하지 못하기 때문에 spacial locality 보장이 되지 않아서 cash hit가 어렵다.

### 데이터 갯수가 확실하게 정해져 있고, 자주 사용된다면 array가 더 효율적이다.

## List의 기억해야할 점
- 순서
- 중복허용

## Array VS List
* 데이터 추가
  Array - 데이터가 기존 데이터에 덮어씌워짐
  List - 데이터가 기존 데이터를 인덱스가 뒤로 미뤄지면서 신규 추가됨
* 데이터 삭제
  Array - 기존 데이터 삭제하고 비워짐
  List - 기존 데이터 삭제하고 다음 인덱스 엘리먼트가 앞으로 땡겨지며 빈 엘리먼트가 없음
  
결론 : Array의 인덱스는 값에 대한 유일한 식별자이고 List의 인덱스는 순서의 의미정도로 이해

# ArrayList
## ArrayList 장/단점
- 추가 및 삭제 > 인덱스를 미루거나 땡겨야되서 느림
- 검색 > 인덱스를 이용하여 탐색하기 때문에 빠름

## 사용
### ArrayList 선언
  > ArrayList<Integer> number = new ArrayList<>();

### 데이터 추가/삭제
  
  number.add(1,50);  //인덱스:1에 50 추가
  
  number.remove(1);  //인덱스:1에 데이터 50 삭제

### get
  
  number.get(2);   //인덱스:2의 데이터 가져오기

### 크기
  
  number.size();

### Iterator
  > Iterator를 권장!!
  
  > Iterator it = number.iterator();         // Iterator 데이터 타입의 it 변수에 number 리스트 선언
  
  while(it.hasNext()){ int value = it.next();}   // it변수에 hasNext()->boolean으로 다음 엘리먼트가 있는지 확인하여 있으면 value에 it의 값이 저장
  
  > for(int value : number){System.out.println(value);}  // 위와 같음
  
 
 # LinkedList
 
 ## 특징
 - 추가 및 삭제 빠르다
 - 검색 > 전부 탐색해야되서 느림
 - 구현이 ArrayList보다 어려움
 
 ## 사용
 
  
