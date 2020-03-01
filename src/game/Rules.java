package game;

import materials.Coin;
import materials.CoinState;

import java.util.List;

public class Rules {
  final int nbWin = 3;
  private static Rules uniqueInstance = null;

  private Rules(){}
  /**
   * Cette méthode permet de déterminer si une suite d'états de pièce permet de gagner à une partie
   * @param states liste d'états pour un joueur
   * @return true si un joueur a gagné, false sinon
   */


  public boolean checkWin(List<CoinState> states) {
    if (states.size() ==0)
      return false;
    CoinState previewCoinState = states.get(0);
    int cpt = 0;
    for(CoinState c : states){
      if (c == previewCoinState)
        cpt++;
      else
        cpt = 1;
      previewCoinState = c;
      if (cpt == nbWin)
        return true;
    }
    return false;
  }

  public static Rules getInstance(){
    if (uniqueInstance == null) {uniqueInstance = new Rules();}
    return uniqueInstance;
  }
}
