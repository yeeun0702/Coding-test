# **[level 0] 두 수의 나눗셈 - 120806**

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120806)

**✏️ 나의 생각**

```java
class Solution {
    public int solution(int num1, int num2) {
        double answer = 0;
        if ((num1 >0 && num1 <= 100) & (num2 >0 && num2 <= 100))
           answer = (double)num1 / num2 * 1000;
        return (int)answer;
    }
}
```

두 수를 나누고, `1000` 을 곱한 후 정수 부분을 `return` 하기 위해서는 형변환이 필요하다고 생각하였다.

**✏️ 다른 사람의 풀이**

```java

class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        return num1 * 1000 / num2;
    }
}
```

모든 연산이 정수 타입 내에서 수행되므로 소수점 이하가 자동으로 버려지므로 형 변환이 불필요하다.

**🔐  생각의 키 포인트 및 문제 풀이  !**

`형변환`이 꼭 필요한가 생각해보고 문제를 풀어야겠다

# 📝 **자바의 형변환 정리**

### **1. 자동(묵시적) 형변환 (Implicit Casting)**

- 작은 크기의 데이터 타입을 **더 큰 크기의 데이터 타입**으로 변환할 때 자동으로 변환됨
- 데이터 손실이 발생하지 않음

**📌 예제**

```java
int num = 10;
double d = num;  // int → double 자동 변환
System.out.println(d); // 출력: 10.0
```

정수 `int` → 실수 `double` 변환이 자동으로 수행됨

데이터 손실 없음

---

### **2. 명시적 형변환 (Explicit Casting)**

- 큰 크기의 데이터 타입을 작은 크기의 데이터 타입으로 변환할 때 **명시적으로 형변환 필요**
- **데이터 손실 가능성 있음**

**예제**

```java
double d = 10.99;
int num = (int) d;  // double → int 명시적 변환 (소수점 제거)
System.out.println(num); // 출력: 10
```

`double`을 `int`로 변환할 때 **소수점 이하 값이 버려짐**

명시적 형변환 `(int)`을 사용하여 변환해야 함
