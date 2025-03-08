### **✏️ 다른 사람의 풀이**

```java

class Solution {
    public int solution(int num1, int num2) {
        int answer = (num1 == num2) ? 1 : -1;
        return answer;
    }
}
```

### 🤔 **생각의 키 포인트**

삼항연산자를 이용해보자 !


**✅ 삼항연산자란 ?**

삼항 연산자는 **조건에 따라 값을 선택하는 연산자**로, `if-else` 문을 **한 줄로 간결하게 표현**할 수 있다.

```java
조건식 ? 참일 때 값 : 거짓일 때 값;
```

- `조건식`: `true` 또는 `false`를 반환하는 논리 표현식
- `?` 뒤의 값 → `조건식`이 `true`일 때 선택됨
- `:` 뒤의 값 → `조건식`이 `false`일 때 선택됨
