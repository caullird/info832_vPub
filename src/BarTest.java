package src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BarTest {

  private Bar bar;

  @BeforeEach
  void setUp() {
    bar = new Bar();
  }

  @Test
  void testAddBoissonFroide() {
    Boisson boisson = new Boisson("testBoisson");
    bar.add(boisson);
    assertEquals(boisson, bar.boissonFroide.lastElement());
  }

  @Test
  void testAddBoissonAlcoolisee() {
    Boisson boissonAlcoolisee = new Boisson("testBoissonAlcoolisee", (float)2.0);
    bar.add(boissonAlcoolisee);
    assertEquals(boissonAlcoolisee, bar.boissonAlcoolisee.lastElement());
  }

  @Test
  void testAddCocktail() {
    Cocktail cocktail = new Cocktail("testCocktail");
    bar.add(cocktail);
    assertEquals(cocktail, bar.cocktailSansAlcoole.lastElement());
  }

  @Test
  void testAddCocktailAlcoolisee() {
    // TODO: implement me!
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @Test
  void testServBoissonFroide() {
    Boisson boissonFroide = new Boisson("testBoissonFroide");
    bar.add(boissonFroide);
    assertSame(boissonFroide, bar.serv("testBoissonFroide"));
  }

  @Test
  void testServBoissonChaude() {
    // TODO: implement me!
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @Test
  void testServBoissonAlcoolisee() {
    Boisson boissonAlcoolisee = new Boisson("testBoissonAlcoolisee");
    bar.add(boissonAlcoolisee);
    assertSame(boissonAlcoolisee, bar.serv("testBoissonAlcoolisee"));
  }

  @Test
  void testServCocktail() {
    Boisson cocktail = new Boisson("testCocktail");
    bar.add(cocktail);
    assertSame(cocktail, bar.serv("testCocktail"));
  }

  @Test
  void testServCocktailAlcoolisee() {
    // TODO: implement me!
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @Test
  void testToString() {
    bar.add(new Boisson("testBoisson"));
    bar.add(new Boisson("testBoissonAlcoolisee",(float)2.0));
    bar.add(new Boisson("testBoissonAlcoolisee2",(float)2.0));
    bar.add(new Boisson("testCocktail"));

    String resultat = "Bar : \n"
        + "\t Sans alcool\n"
        + "\t\ttestBoisson\n"
        + "\t\ttestCocktail\n"
        + "\t Avec alcool\n"
        + "\t\ttestBoissonAlcoolisee (l'abus d'alcool est dangereux pour la sante)\n"
        + "\t\ttestBoissonAlcoolisee2 (l'abus d'alcool est dangereux pour la sante)\n"
        + "\t Cocktail sans alcool\n"
        + "\t Cocktail avec alcool\n"
        + "\t Boissons chaudes\n";

    System.out.println(bar);
    assertEquals(bar.toString(), resultat);
  }


}