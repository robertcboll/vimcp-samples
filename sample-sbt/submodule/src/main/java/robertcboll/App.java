package robertcboll;

import com.google.common.collect.ImmutableList;
import java.util.List;
import robertcboll.testpkg.Another;
import java.util.Set;
import java.util.HashSet;

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

    Set<String> set = new HashSet<>();
    com.google.common.annotations.Beta b;
  }
}
