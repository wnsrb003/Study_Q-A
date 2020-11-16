## UNION
> 두 개 이상의 SELECT 문들의 결과 집합을 단일 결과 집합으로 결합하며 결합 시 중복된 데이터는 제거된다.

### 기본 문법
- 두 개의 SELECT문 간 컬럼의 개수는 동일해야 하며 해당 순서의 열에는 서로 호환되는 데이터 유형 이어야 합니다.
- 두 개의 SELECT문에서 중복되는 데이터 값이 있다면 중복은 제거된다.
- ORDER BY로 정렬하고자 할 경우 맨 마지막 SELECT문에 ORDER BY 절을 사용한다.
> 예제
```
SELECT * 
  FROM sql_test_a 
UNION
SELECT * 
  FROM sql_test_a;
```

## UNION ALL
> 두 개 이상의 SELECT 문들의 결과 집합을 단일 결과 집합으로 결합하며 결합시 중복된 데이터도 모두 출력 합니다.
> 예제
```
SELECT * 
  FROM sql_test_a 
UNION ALL 
SELECT * 
  FROM sql_test_a;
```

## INTERSECT
> 두 개 이상의 SELECT 문들의 결과 집합을 하나의 결과 집합으로 결합 합니다.
> INTERSECT 연산자에 의해 조회된 결과는 A와B의 교집합의 값을 반환 합니다.
### 기본문법
- 두개의 SELECT문 간 컬럼의 개수는 동일해야 하며 해당 순서의 열에는 서로 호환되는 데이터 유형 이어야 합니다.
- ORDER BY로 정렬하고자 할 경우 맨 마지막 SELECT문에 ORDER BY절을 사용합니다.
> 예제 
```
SELECT FIRST_NAME,LAST_NAME
  FROM sql_test_a 
INTERSECT
SELECT FIRST_NAME,LAST_NAME
  FROM sql_test_b;
```

## EXCEPT
> 맨위에 SELECT문의 결과 집합에서 그 아래에 있는 SELECT문의 결과 집합을 제외한 LEFT ONLY 결과를 반환합니다.
### 기본문법
> 두개의 SELECT문 간 컬럼의 개수는 동일해야 하고 해당 순서의 열에는 서로 호환되는 데이터 유형 이어야 합니다.
