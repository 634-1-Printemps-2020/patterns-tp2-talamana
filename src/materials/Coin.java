package materials;

import java.util.Random;

public class Coin {

  private CoinState coinState;

  private static Coin uniqueInstance = null;

  private Coin(){}

  /**
   * Change l'état de la pièce.
   * 50% de probabilité d'obtenir HEADS, 50% de probabilité d'obtenir TAILS
   */
  public void throwCoin() {
    Random rand = new Random();
    rand.ints(0,1);
    int result = rand.nextInt();
    if (result == 0){
      coinState = CoinState.HEADS;
    }
    else{
      coinState = CoinState.TAILS;
    }
  }

  public CoinState getState() {
    return coinState;
  }
  public static Coin getInstance(){
    if (uniqueInstance == null) {uniqueInstance = new Coin();}
    return uniqueInstance;
  }

}
