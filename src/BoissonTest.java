package src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoissonTest {

  private Boisson boisson;
  private Boisson alcool;

  @BeforeEach
  void setUp() {
    boisson = new Boisson("boisson");
    alcool = new Boisson("alcool", (float)2.0);
  }

  @Test
  void testNom() {
    assertEquals(boisson.nom, "boisson");
  }

  @Test
  void testDegre() {
    assertEquals(alcool.degre, (float)2.0);
    assertNull(new Boisson("negatifDegree", (float)-1), "Boisson avec un degree négatif crée");
  }

  @Test
  void testAlcoolise() {
    assertFalse(boisson.alcoolise);
    assertTrue(alcool.alcoolise);
  }

  @Test
  void testToString() {
    assertEquals(boisson.toString(), "boisson");
    assertEquals(alcool.toString(), "alcool (l'abus d'alcool est dangereux pour la sante)");
  }

}