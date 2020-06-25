## 고계 함수(higher-order function)
- 함수형 언어에서는 함수도 '값(value)'으로 취급 한다.
- 다음중 하나 이상의 동작을 수행 하는 함수를 고차원 함수라 부른다.
    - 하나 이상의 함수를 인수로 받음. 인수로 전달 받는 함수는 <u>부작용이 없어야 한다.</u>것
    - 함수를 결과로 반환
      ```java
        List<Apple> apples = new ArrayList<>();;
                Apple ap1 = new Apple(300);
                Apple ap2 = new Apple(200);
                Apple ap3 = new Apple(100);
                apples.add(ap1);
                apples.add(ap2);
                apples.add(ap3);
                
                apples.sort(Comparator.comparing(Apple::getPrice));
      ```
    
## 클로저
함수의 비지역변수를 자유롭게 참조할수 있는 함수의 인스턴스

## 커링
- x, y라는 두 인수를 가진 f라는 함수를 한개의 인수로 받는 g라는 함수로 대체하는 기법이다.    
- f(x,y) = (g(x))(y)
```java
static double converter(double x, double f, double b){
    return x * f + b;
}
```
```java
static DoubleUnaryOperator curriedConverter(double f, double b){
    return (double x) -> x * f + b;
}
```  

## 재귀
자신을 재참조하여 같은 프로세스를 반복하는 