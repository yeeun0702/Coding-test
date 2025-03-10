### ✅ **ORDER BY란? (정렬 연산자)**

`ORDER BY`는 **SQL에서 데이터를 특정 기준으로 정렬할 때 사용하는 명령어**고 이를 이용하면 데이터를 **오름차순(ASC) 또는 내림차순(DESC)으로 정렬할 수 있다.**

---

## **1️⃣ ORDER BY 기본 문법**

```sql
SELECT 컬럼명1, 컬럼명2, ...
FROM 테이블명
ORDER BY 정렬할_컬럼 [ASC | DESC];
```

- `ASC` (**오름차순, Ascending**): 기본값, 작은 값 → 큰 값으로 정렬
- `DESC` (**내림차순, Descending**): 큰 값 → 작은 값으로 정렬

---

## **2️⃣ 최신순 정렬은 DESC (내림차순)**

데이터를 **최신순(최근 날짜가 먼저 나오게) 정렬하려면 `DESC` 사용!**

```sql
SELECT * FROM orders
ORDER BY created_at DESC;
```

---

## **3️⃣ 정렬 방향별 비교 (ASC vs DESC)**

| 정렬 기준 | `ASC` (오름차순) | `DESC` (내림차순) |
| --- | --- | --- |
| 숫자 정렬 | 1 → 2 → 3 → 4 | 4 → 3 → 2 → 1 |
| 날짜 정렬 | 과거 → 현재 | 현재 → 과거 |
| 문자열 정렬 | A → Z (가 → 하) | Z → A (하 → 가) |

📌 **예제**

```sql
SELECT * FROM users ORDER BY username ASC;  -- 이름 오름차순
SELECT * FROM users ORDER BY username DESC; -- 이름 내림차순
SELECT * FROM products ORDER BY price ASC;  -- 가격 낮은 순
SELECT * FROM products ORDER BY price DESC; -- 가격 높은 순
```

---

## **🔹 4️⃣ 여러 개의 컬럼 정렬 (다중 정렬)**

✅ **두 개 이상의 컬럼을 정렬할 수도 있다.**

```sql
SELECT * FROM orders
ORDER BY created_at DESC, price ASC;
```

📌 **설명**

- **최신순(내림차순)으로 정렬한 후**,
- **같은 날짜라면 가격 오름차순으로 정렬**

✅ 즉, `ORDER BY 컬럼1 정렬방향, 컬럼2 정렬방향` 형식으로 사용 가능!

---

정리하자면. 

| 정렬 기준 | SQL 문법 |
| --- | --- |
| **기본 오름차순** | `ORDER BY 컬럼명 ASC` |
| **기본 내림차순** | `ORDER BY 컬럼명 DESC` |
| **최신순 정렬** | `ORDER BY created_at DESC` |
| **가격 높은 순 정렬** | `ORDER BY price DESC` |
| **가격 낮은 순 정렬** | `ORDER BY price ASC` |
| **이름 가나다순 정렬** | `ORDER BY username ASC` |
| **이름 가나다 역순 정렬** | `ORDER BY username DESC` |
| **최신순 정렬 후 가격 낮은 순 정렬** | `ORDER BY created_at DESC, price ASC` |
