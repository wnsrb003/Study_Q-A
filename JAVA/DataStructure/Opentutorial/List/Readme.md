#List

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
> ArrayList 선언
  ArrayList<Integer> number = new ArrayList<>();

> 데이터 추가/삭제
  number.add(1,50);  //인덱스:1에 50 추가
  number.remove(1);  //인덱스:1에 데이터 50 삭제

> get
  number.get(2);   //인덱스:2의 데이터 가져오기

> 크기
  number.size();

> Iterator
  >> Iterator it = number.iterator();         // Iterator 데이터 타입의 it 변수에 number 리스트 선언
     while(it.hasNext()){ int value = it.next();}   // it변수에 hasNext()->boolean으로 다음 엘리먼트가 있는지 확인하여 있으면 value에 it의 값이 저장
  >> for(int value : number){System.out.println(value);}  // 위와 같음
  
 
  
