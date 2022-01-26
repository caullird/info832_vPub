package src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CaveTest {

  private Cave cave;

  @BeforeEach
  void setUp() {
    cave = new Cave();
    cave.add(new Boisson("testBoisson1"));
    cave.add(new Boisson("testBoisson2"));
    cave.add(new Boisson("testBoisson3"));
    cave.add(new Boisson("testBoisson3"));
    cave.add(new Boisson("testBoisson3"));
  }

  @Test
  void testAdd() {
    Boisson boissonAdd = new Boisson("testBoisson");
    cave.add(boissonAdd);
    assertEquals(boissonAdd, cave.rayons.lastElement());
  }

  @Test
  void testTake() {
    assertEquals("testBoisson1", cave.take("testBoisson1").nom);
  }

  @Test
  void testToString() {
    System.out.println(cave.toString());

    String eol = System.getProperty("line.separator");

    String result = "Cave : \n"
        + "\ttestBoisson1\n"
        + "\ttestBoisson2\n"
        + "\ttestBoisson3\n"
        + "\ttestBoisson3\n"
        + "\ttestBoisson3\n";

    assertEquals(cave.toString(), result);
  }
}