## 🧾 5월 식품들의 총매출 조회하기

---

### ✅ **집계함수와 일반 컬럼을 혼용**

### ❌ 오답 코드

```sql
SELECT P.PRODUCT_ID, P.PRODUCT_NAME, O.AMOUNT * SUM(P.PRICE) AS TOTAL_PRICE
FROM FOOD_PRODUCT P
JOIN FOOD_ORDER O ON P.PRODUCT_ID = O.PRODUCT_ID
WHERE O.PRODUCE_DATE LIKE '2022-05%'
ORDER BY TOTAL_PRICE DESC;
```

### 🧨 문제 요점

- `SUM(P.PRICE)`은 그룹 함수지만 `O.AMOUNT`는 일반 컬럼 → **혼용 불가**
- 전체 쿼리에서 `GROUP BY` 없이 집계 함수 사용 → SQL 규칙 위반

### ✅ 정답 코드

```sql
SELECT P.PRODUCT_ID, P.PRODUCT_NAME, SUM(O.AMOUNT * P.PRICE) AS TOTAL_PRICE
FROM FOOD_PRODUCT P
JOIN FOOD_ORDER O ON P.PRODUCT_ID = O.PRODUCT_ID
WHERE O.PRODUCE_DATE LIKE '2022-05%'
GROUP BY P.PRODUCT_ID, P.PRODUCT_NAME
ORDER BY TOTAL_PRICE DESC;
```

### 💡 교훈

- `SUM(A * B)`는 괜찮지만, `A * SUM(B)`은 대부분 잘못된 로직
- 집계할 땐 반드시 GROUP BY가 필요함

---

### ✅ **GROUP BY 자체를 떠올리지 못한 실수**

### 🧨 흔한 생각 오류

- "총매출을 구해야 하니까 `SUM`을 써야지!"
- → 그런데 어떤 기준으로 묶어야 하는지를 안 떠올림

### ✅ 생각 흐름

> "상품별 총매출"이니까 → 상품 단위로 묶어야 해 → GROUP BY PRODUCT_ID
> 

### 💡 교훈

- `SUM`, `AVG`, `MAX` 등을 쓴다면:
    
    > ✨ "내가 무엇을 기준으로 묶으려는 건가?" → → 그게 GROUP BY의 대상이다
    > 
- 문제에 “~별로”라는 말이 보이면 반사적으로 GROUP BY 의심하기
- → **"기준이 되는 컬럼"을 찾기**→ 그게 GROUP BY 대상
- "상품별", "카테고리별", "날짜별"이란 말이 보이면 → `GROUP BY` 떠올리기
