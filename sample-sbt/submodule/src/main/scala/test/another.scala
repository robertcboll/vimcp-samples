package test

object AMainClass {
  def main(args: Array[String]) {
    System.out.println("running!")
    import com.google.common.collect.ImmutableList;
    val a = ImmutableList.of();
    val b = com.google.common.base.Charsets.UTF_8;
  }
}
