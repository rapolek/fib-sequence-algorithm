import java.time.Duration;
import java.time.LocalDateTime;

class Main {
  LocalDateTime start = LocalDateTime.now();

  int fib(int n) {
    if (n <= 1)
      return n;
    return fib(n - 1) + fib(n - 2);
  }

  public static void main(String args[]) {
    int n = 36;
    var instance = new Main();
    System.out.println(instance.fib(n));

    instance.end = LocalDateTime.now();
    System.out.println(instance.start);
    System.out.println(instance.end);
    System.out.println(Duration.between(instance.start, instance.end).toMillis());
  }

  LocalDateTime end = LocalDateTime.now();

}