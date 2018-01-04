import org.junit.Assert.assertEquals
import org.junit.Test
import utils.getResourceAsString

class Day22Test {

  @Test
  fun part1sample() {
    assertEquals(5, Day22.part1(getResourceAsString("day22-sample.txt"), 7))
    assertEquals(41, Day22.part1(getResourceAsString("day22-sample.txt"), 70))
  }

  @Test
  fun part1() {
    assertEquals(5462, Day22.part1(getResourceAsString("day22.txt"), 10000))
  }

  @Test
  fun part2sample() {
    assertEquals(26, Day22.part2(getResourceAsString("day22-sample.txt"), 100))
  }

  @Test
  fun part2() {
    assertEquals(2512135, Day22.part2(getResourceAsString("day22.txt"), 10000000))
  }

}