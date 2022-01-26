package src;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PubTest {

  private Pub pub;


  @BeforeEach
  void setUp() {
    pub = new Pub();
  }

  @Test
  void testApprovisionnerBar() {
    Boisson boisson = new Boisson("Cola");
    pub.cave.add(boisson);
    pub.approvisionnerBar("Cola");

    assertEquals(0, pub.cave.rayons.size());
    assertEquals(1, pub.bar.boissonFroide.size());
  }
}