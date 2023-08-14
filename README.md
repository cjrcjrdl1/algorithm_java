# algorithm_java
1.피보나치
```
public static int fibonacci(int n) {
    if (n < 0) throw new IllegalArgumentException("fibonacci: n < 0");
    switch (n) {
        case 0:
        case 1:
            return n;
        default:
            int a = fibonacci(n - 1);
            int b = fibonacci(n - 2);
            return a + b;
    }
}
```
2. sphereVolume
```
 public static double sphereVolume(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("radius must be non-negative");
        }
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
```
3. TrueTest
```
public class TrueTest {
    public static boolean twoMoreTrue(String... values) {
        int trueCount = 0;
        for (String value : values) {
            trueCount = Boolean.valueOf(value) ? ++trueCount:trueCount;
        }
        return trueCount >= 2;
    }

    public static void main(String[] args) {
        System.out.println(twoMoreTrue("true", "true", "false")); 
        System.out.println(twoMoreTrue("true", "false", "false")); 
        System.out.println(twoMoreTrue("false", "false", "false")); 
    }
}
```
4.오류발생관련
```
java.lang.StackOverflowError(스택오버플로우)
postCondition() 메서드에서 fibonacci(Integer.MAX_VALUE)를 호출하는데 이 때 Integer.MAX_VALUE 는 Integer형 중 가장 큰값으로 피보나치 수열을 수행시 이전 두항의 합은 Integer형 범위 값을 넘어갈 수 밖에 없으므로 에러가 날수밖에 없다
```
