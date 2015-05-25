package robertcboll;

import com.google.common.collect.ImmutableList;
import java.util.List;
import robertcboll.testpkg.Another;

/**
 * Hello world!
 *
 */
public final class App {

  private App() { }

  public static void main(String[] args) {
    System.out.println("Hello World!");
    Another a = new Another();
    a.doSomething();
    List<String> l = ImmutableList.of();

    java.util.Set<String> set = new java.util.HashSet<>();

    com.google.common.annotations.Beta b;
  }
}
