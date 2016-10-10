package fr.p10.miage.rps;

public class RockPaperScissors {
	
	 public Result play(RPSEnum p1, RPSEnum p2){
		 
	if (p1.equals(p2)) return Result.TIE;
    if (((p1.equals(RPSEnum.ROCK)) && (p2.equals(RPSEnum.SCISSORS)))|| ((p1.equals(RPSEnum.PAPER)) && (p2.equals(RPSEnum.ROCK)) ) ||((p1.equals(RPSEnum.SCISSORS)) && (p2.equals(RPSEnum.PAPER)))) return Result.WIN;
    return Result.LOST;

	 }
	 
	 public Result play(Player p1, Player p2){
		 int a = 0;

		 for (int i = 0; i < 10; i++) {
			 if ((play(p1.Mouvement.get(i), p2.Mouvement.get(i)).equals(Result.WIN)))
				 p1.setScore(p1.getScore()+1);
			 else{
				 if ((play(p1.Mouvement.get(i), p2.Mouvement.get(i)).equals(Result.LOST))){
					 p2.setScore(p2.getScore()+1); 
				 }
				 else  
				 {
					 p2.setScore(p2.getScore()+1); 
					 p1.setScore(p1.getScore()+1); 
					 a++;
					 
				 }
					 
			 }
				 
		}
		if ((p1.getScore()-a)>5) return Result.WIN;	
		if ((p1.getScore()-a)==5) return Result.TIE;
		return Result.LOST;
	}
}
