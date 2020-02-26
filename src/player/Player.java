package player;

import materials.Coin;

public class Player {

  private int id2;

  public Player(int id) {
    this.id = id;
  }

  public void play(Coin coin) {
    coin.throwCoin();
  }

}
