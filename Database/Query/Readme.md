## UNION
> 두 개 이상의 SELECT 문들의 결과 집합을 단일 결과 집합으로 결합하며 결합 시 중복된 데이터는 제거된다.

### 기본 문법
- 두 개의 SELECT문 간 컬럼의 개수는 동일해야 하며 해당 순서의 열에는 서로 호환되는 데이터 유형 이어야 합니다.
- 두 개의 SELECT문에서 중복되는 데이터 값이 있다면 중복은 제거된다.
- ORDER BY로 정렬하고자 할 경우 맨 마지막 SELECT문에 ORDER BY 절을 사용한다.
> 예제
```
SELECT * FROM sql_test_a 
UNION
SELECT * FROM sql_test_a;
```

## UNION ALL
> 두 개 이상의 SELECT 문들의 결과 집합을 단일 결과 집합으로 결합하며 결합시 중복된 데이터도 모두 출력 합니다.
> 예제
```
SELECT * FROM sql_test_a 
UNION ALL 
SELECT * FROM sql_test_a;
```

## INTERSECT
> 두 개 이상의 SELECT 문들의 결과 집합을 하나의 결과 집합으로 결합 합니다.
> INTERSECT 연산자에 의해 조회된 결과는 A와B의 교집합의 값을 반환 합니다.
### 기본문법
- 두개의 SELECT문 간 컬럼의 개수는 동일해야 하며 해당 순서의 열에는 서로 호환되는 데이터 유형 이어야 합니다.
- ORDER BY로 정렬하고자 할 경우 맨 마지막 SELECT문에 ORDER BY절을 사용합니다.
> 예제 
```
SELECT FIRST_NAME,LAST_NAME FROM sql_test_a 
INTERSECT
SELECT FIRST_NAME,LAST_NAME FROM sql_test_b;
```

## EXCEPT
> 맨위에 SELECT문의 결과 집합에서 그 아래에 있는 SELECT문의 결과 집합을 제외한 LEFT ONLY 결과를 반환합니다.
### 기본문법
> 두개의 SELECT문 간 컬럼의 개수는 동일해야 하고 해당 순서의 열에는 서로 호환되는 데이터 유형 이어야 합니다.
```
SELECT COLUMN_1_1, COLUMN_1_2 FROM TABLE_NAME_1
EXCEPT
SELECT COLUMN_2_1, COLUMN_2_2 FROM TABLE_NAME_2
```

## 서브쿼리
> 하나의 SQL 문에 포함되어 있는 또 다른 SQL 문을 말합니다.
### 서브쿼리 사용시 주의사항
1. 서브쿼리를 괄호로 감싸서 사용한다.

2. 서브쿼리는 단일 행 또는 복수 행 비교 연산자와 함께 사용 가능하다.

3. 서브쿼리에서는 ORDER BY 를 사용하지 못한다.
### 서브쿼리가 사용 가능한 곳
1. SELECT 절

2. FROM 절

3. WHERE 절

4. HAVING 절

5. ORDER BY 절

6. INSERT 문의 VALUES 절

7. UPDATE 문의 SET 절
### 트랜잭션(Transaction)
> 데이터베이스의 상태를 변환시키는 하나의 논리적 기능을 수행하기 위한 작업의 단위 또는 한꺼번에 모두 수행되어야 할 일련의 연산들을 의미한다.
> 하나의 처리를 여러 단계로 다루는 기능을 트랜잭션(Transaction)이라고 합니다. 
> 하나의 처리를 Commit이라는 명령어를 수행하기전 마지막으로 한번 더 확인할 수 있는 기회를 줌으로써 좀더 안정적인 데이터베이스 작업을 가능하게 합니다. 
> 트랜잭션의 실행결과를 데이터베이스에 반영하는것을(Commit)이라고 하고 반영하기 전으로 되돌리는것을 롤백(RollBack)이라고 합니다. 
> 예제
```
--문법
SELECT * FROM 테이블명 WHERE 칼럼명 = '내용' --칼럼의 존재 확인

BEGIN TRAN --트랜잭션 시작
UPDATE 테이블명 SET Update할칼럼 = '바꿀문구' WHERE 칼럼명 ='기존문구' --홍길동을 이순신으로 바꿈
SELECT * FROM 테이블명 WHERE 칼럼명 = '바뀐문구'--나만 바뀐것을 확인할수 있고 아직 적용은 안되어있는 상태이다.
ROLLBACK TRAN -되돌리기 --Update 취소
COMMIT TRAN --트랜잭션 완료 --Update 적용
-------------------------------------------------------------------------------------------------------------Example
SELECT * FROM My_Table WHERE Nm_Kor = '홍길동' --홍길동 칼럼의 존재 확인

BEGIN TRAN --트랜잭션 시작
UPDATE My_Table SET Nm_Kor = '이순신' WHERE Nm_Kor ='홍길동' --홍길동을 이순신으로 바꿈
SELECT * FROM My_Table WHERE NM_KOR = '이순신'--나만 바뀐것을 확인할수 있고 아직 적용은 안되어있는 상태이다.
ROLLBACK TRAN -되돌리기
COMMIT TRAN --트랜잭션 완료
```
[출처] https://coding-factory.tistory.com/82
