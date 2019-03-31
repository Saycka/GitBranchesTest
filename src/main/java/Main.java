public class Main {

  public static void main(String[] args) {
    System.out.println("Hello, World");
    foo();
    foo1();
  }

  public static void foo() {
    System.out.println("master branch");
    foo1();
  }

  public static void foo1() {
    System.out.println("branch1");
  }

}
