package essai;
import java.util.Scanner;
public class Tester {

	public static void main(String[] args) {
		Yatzy yz=new Yatzy();
			int tabdes[]=new int[5];//tableau contient les 5 dés
	    //essayez de donner les choix des dés  	
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			 			System.out.println("donner la valeur de dés numero :" +(i+1)+"   ");
			tabdes[i]=sc.nextInt();
	}
	//pour des choix aléatoires
	/* for(int i=0;i<5;i++) {
		tabdes[i]= ((int)(Math.random() * 6))+1;
			}
	*/	
		
	for(int i=0;i<5;i++) {
		System.out.print("dés"+(i+1)+": "+tabdes[i]+"\t");}
	System.out.println("\n*******************************************");
	System.out.println("\nvotre score chance est "+yz.categorieChance(tabdes));
	System.out.println("*******************************************");
	System.out.println("votre score yatzy est "+yz.categorieYatzy(tabdes));
	System.out.println("*******************************************");
	
	System.out.println("votre score Ones est : "+yz.categorieOnes(tabdes));
	System.out.println("*******************************************");
	System.out.println("votre score Twos est : "+yz.categorieTwos(tabdes));
	System.out.println("*******************************************");
	System.out.println("votre score Threes est : "+yz.categorieThrees(tabdes));
	System.out.println("*******************************************");
	System.out.println("votre score Fours est : "+yz.categorieFours(tabdes));
	System.out.println("*******************************************");
	System.out.println("votre score Fives est : "+yz.categorieFives(tabdes));
	System.out.println("*******************************************");
	System.out.println("votre score Sixes est : "+yz.categorieSixes(tabdes));
	System.out.println("*******************************************");
	System.out.println("votre score Paires est :"+yz.categoriePair(tabdes));
	System.out.println("*******************************************");
	System.out.println("il existe deux paires qui vaut : "+yz.categorieTwoPaire(tabdes));
	System.out.println("*******************************************");
	System.out.println("il existe un foule qui vaut : "+yz.categorieFoule(tabdes));
	System.out.println("*******************************************");
	System.out.println("votre score Three of kind est :"+yz.categorieThreeOfkind(tabdes));
	System.out.println("*******************************************");
	System.out.println("votre score Four of kind est :"+yz.categorieFourOfkind(tabdes));
	System.out.println("*******************************************");
	System.out.println("votre score Small straight est :"+yz.categorieSmallStraight(tabdes));
	System.out.println("*******************************************");
	System.out.println("votre score large Straight est :"+yz.categorieLargeStraight(tabdes));
	System.out.println("*******************************************");
	}

}
