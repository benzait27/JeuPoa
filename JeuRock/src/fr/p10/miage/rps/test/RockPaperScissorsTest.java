package fr.p10.miage.rps.test;

import org.testng.annotations.Test;

import fr.p10.miage.rps.Player;
import fr.p10.miage.rps.RPSEnum;
import fr.p10.miage.rps.Result;
import fr.p10.miage.rps.RockPaperScissors;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.LinkedList;

import org.testng.Assert;
import org.testng.annotations.AfterClass;

@Test
public class RockPaperScissorsTest {
  
	RockPaperScissors rps;
	Player p1;
	Player p2;
	Player p3;
	Player p4;
	
	
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @BeforeClass
  public void beforeClass() throws CloneNotSupportedException {
	  rps  = new RockPaperScissors();
	  p1 = new Player("zaki");
	  LinkedList<RPSEnum> mouvement  = new LinkedList<RPSEnum>();
	  for (int i = 0; i < 10; i++) {
		mouvement.add(p1.Mouvement.get(9-i));
	}
	  p2 = new Player("Zaki Inverse",mouvement);
	  p3 = new Player("ali");
	  p4 =  (Player) p1.clone();
	  //p4 = new Player("ZakiMeme");
	  p1.setScore(0);
	  p2.setScore(0);
	  p3.setScore(0);
	  p4.setScore(0);
  }

  @AfterClass
  public void afterClass() {
	  p1 = null;
	  p2 = null;
  }


  public void playLost() {
	  
	  p1.setScore(0);
	  p4.setScore(0);
	  Assert.assertEquals(rps.play(p1, p4), Result.LOST);
  }

  public void playWin() {
	  p1.setScore(5);
	  p3.setScore(0);
   Assert.assertEquals(rps.play(p1, p3), Result.WIN);
  }
  
  public void playTie() {
	  p1.setScore(0);
	  p2.setScore(0);
   Assert.assertEquals(rps.play(p1, p2), Result.TIE);
  }
  /*
  @DataProvider(name = "TieData")
  public Object[][] TieDataCreate() {
    return new Object[][] {
       {RPSEnum.PAPER , RPSEnum.PAPER },
       {RPSEnum.ROCK , RPSEnum.ROCK },
       {RPSEnum.SCISSORS , RPSEnum.SCISSORS},
    };
  }
  
  @DataProvider(name = "WinData")
  public Object[][] WinDataCreate() {
    return new Object[][] {
       {RPSEnum.ROCK, RPSEnum.SCISSORS },
       {RPSEnum.SCISSORS, RPSEnum.PAPER },
       {RPSEnum.PAPER , RPSEnum.ROCK},
    };
  }
  @DataProvider(name = "LostData")
  public Object[][] LostDataCreate() {
    return new Object[][] {
       {RPSEnum.SCISSORS, RPSEnum.ROCK },
       {RPSEnum.ROCK, RPSEnum.PAPER },
       {RPSEnum.PAPER , RPSEnum.SCISSORS},
    };
  }
  @Test(dataProvider = "TieData")
  public void Play1(RPSEnum p1, RPSEnum p2) {
	  Assert.assertEquals(rps.play(p1, p2),Result.TIE);
  }

  @Test(dataProvider = "WinData")
  public void Play2(RPSEnum p1, RPSEnum p2) {
	  Assert.assertEquals(rps.play(p1, p2),Result.WIN);
  }
  @Test(dataProvider = "LostData")
  public void Play3(RPSEnum p1, RPSEnum p2) {
	  Assert.assertEquals(rps.play(p1, p2),Result.LOST );
  }
  */
}
