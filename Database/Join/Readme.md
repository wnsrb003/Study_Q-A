# Join
[참고 사이트]https://sql-joins.leopard.in.ua \
[공부 자료(생활코딩)]https://github.com/egoing/sql-join

[Join 간단 사진]https://images.app.goo.gl/52o5zSREr3m9KWBU9

## LEFT OUTER JOIN
> 왼쪽 테이블을 기준으로 조건과 같은 값만 출력되게 함

## RIGHT OUTER JOIN
> LEFT OUTER JOIN과 반대로 생각

## INNER JOIN
> JOIN의 기본값으로 두 테이블의 교집합

> NULL == NULL -> False 이므로 양쪽에 모두 있는 것만 가지고 온다(두 테이블 모두 조건이 맞는 것만 가져온다).\
  EX) SELECT * FROM A INNER JOIN B ON aid == bid; 일때 \
      A.aid == null OR B.bid == null 인 컬럼은 가져오지 않는다.
     
## FULL OUTER JOIN
> LEFT JOIN 과 RIGHT JOIN으로 테이블 형성하고 중복된 컬럼은 삭제 -> FULL OUTER JOIN 지원하지 않을 경우, UNION(중복제거)로 사용
