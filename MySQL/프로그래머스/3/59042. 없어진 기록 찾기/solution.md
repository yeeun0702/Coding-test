### ✅ LEFT JOIN이란?

> 왼쪽(기준) 테이블의 모든 행을 가져오고,
> 
> 
> 오른쪽 테이블은 매칭되는 값이 있으면 붙이고, 없으면 `NULL`로 채우는 방식
> 


### 📍 예시 테이블: 동물 입소/퇴소

| 🏠 ANIMAL_INS (입소 기록) |

| ANIMAL_ID | NAME |
| --- | --- |
| A001 | 강아지 |
| A002 | 고양이 |
| A003 | 앵무새 |

| 🚪 ANIMAL_OUTS (퇴소 기록) |

| ANIMAL_ID | NAME |
| --- | --- |
| A001 | 강아지 |
| A004 | 햄스터 |


### 📍 LEFT JOIN 쿼리

```sql
SELECT O.ANIMAL_ID, O.NAME
FROM ANIMAL_OUTS O
LEFT JOIN ANIMAL_INS I ON O.ANIMAL_ID = I.ANIMAL_ID;
```


### 📍 결과

| O.ANIMAL_ID | O.NAME | I.ANIMAL_ID (입소 기록) |
| --- | --- | --- |
| A001 | 강아지 | A001 |
| A004 | 햄스터 | NULL |
- A001: 입소 기록도 있고 퇴소 기록도 있음 → 붙음
- A004: 퇴소 기록만 있고 입소 기록 없음 → NULL로 채워짐


### ✅ 왜 LEFT JOIN이 필요했나?

이걸 `INNER JOIN`으로 하면:

- `O.ANIMAL_ID = I.ANIMAL_ID`가 있는 경우만 가져오므로
- 입소 기록이 없는 애들은 아예 안 보임

하지만 `LEFT JOIN`은:

- 나간 동물(O)을 무조건 다 가져오고
- 입소 기록(I)이 없으면 NULL로 채워서 결과에 남김

그래서 WHERE I.ANIMAL_ID IS NULL 조건을 걸어

결국 입소 기록이 없는 애들만 걸러낼 수 있었던 것 !

### ✅ 언제 쓰나요?

✔ 왼쪽 기준으로 **전체 데이터**를 유지하고 싶을 때

✔ 오른쪽 값이 없더라도 **채워서 보여주고 싶을 때**


### ✅ LEFT JOIN vs INNER JOIN

| 구분 | LEFT JOIN | INNER JOIN |
| --- | --- | --- |
| 포함 범위 | 왼쪽 전부 + 오른쪽 매칭 | 양쪽 다 매칭되는 것만 |
| 오른쪽 없으면? | NULL로 채워서 포함 | 아예 결과에서 빠짐 |
| 사용 예 | 주문 없는 회원도 포함한 전체 리스트 | 주문 있는 회원만 조회 |
