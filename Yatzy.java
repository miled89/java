package essai;

public class Yatzy {
//categorie chance
	public  int categorieChance(int[] tab) {
		int score=0;
		for(int i=0;i<tab.length;i++) {
		score=score+tab[i];	
		}
					return score;
					}
//categorie yatzy
		public int categorieYatzy(int[] tab) {
          int score=50;
          boolean comp=true;
         int i=1;
         int ref=tab[0];
          while(comp==true && i<tab.length) {
        	if (tab[i]!=ref) {
        		comp=false;
        	    score=0;
        	    }  
        	 i=i+1;            }
	return score;}
    
		
//categorie One
		public int categorieOnes(int[] tab) {
			int score=0;
		    for(int i=0;i<tab.length;i++) {
		    	if(tab[i]==1)
		    		score=score+1;
		    }
			return score;}
		
		
//categorie two
				public int categorieTwos(int[] tab) {
					int score=0;
				    for(int i=0;i<tab.length;i++) {
				    	if(tab[i]==2)
				    		score=score+2;
				    }
					return score;}
		
				
//categorie Three
				public int categorieThrees(int[] tab) {
					int score=0;
				    for(int i=0;i<tab.length;i++) {
				    	if(tab[i]==3)
				    		score=score+3;
				    }
					return score;}
				
				
				
//categorie Fours
				public int categorieFours(int[] tab) {
					int score=0;
				    for(int i=0;i<tab.length;i++) {
				    	if(tab[i]==4)
				    		score=score+4;
				    }
					return score;}
				
//categorie Fives
				public int categorieFives(int[] tab) {
					int score=0;
				    for(int i=0;i<tab.length;i++) {
				    	if(tab[i]==5)
				    		score=score+5;
				    }
					return score;}
				
//categorie Six
				public int categorieSixes(int[] tab)      {
					
					int score=0;
					
				    for(int i=0;i<tab.length;i++)   {
				    	if(tab[i]==6) 
				    		score=score+6;
				    		          
				                                     }
			 return score;                     
				}
 	
//categorie des Paires
				
				public int categoriePair(int[] tab) {//methode
			   int score=0;	
				if(  (categorieSixes(tab)/6)>=2){score=12;}
				else 
				{//else1 
					if(  (categorieFives(tab)/5)>=2){score=10;}
					else
					{//else2  
						if((categorieFours(tab)/4)>=2) {score=8;}
						else 
						{//else3
							if((categorieThrees(tab)/3)>=2) {score=6;}
							else
							{//else4
								
								if((categorieTwos(tab)/2)>=2) {score=4;}
								else
								{//else5
									if(categorieOnes(tab)>=2) {score=2;}
								}//else5
							}//else4
						}//else3
						
					}//else2
					
			   }//else1
			 return score; 
 }//methode
// three of kind
				public int categorieThreeOfkind(int[] tab) {
				int score=0;
			if(  (categorieSixes(tab)/6)>=3){score=18;}
				else 
				{//else1 
					if(  (categorieFives(tab)/5)>=3){score=15;}
					else
					{//else2  
						if((categorieFours(tab)/4)>=3) {score=12;}
						else 
						{//else3
							if((categorieThrees(tab)/3)>=3) {score=9;}
							else
							{//else4
								
								if((categorieTwos(tab)/2)>=3) {score=6;}
								else
								{//else5
									if(categorieOnes(tab)>=3) {score=3;}
								}//else5
							}//else4
						}//else3
						
					}//else2
					
			   }//else1
	return score;}//method
// Four of kind
								public int categorieFourOfkind(int[] tab) {
								int score=0;
									
									
								if(  (categorieSixes(tab)/6)>=4){score=24;}
								else 
								{//else1 
									if(  (categorieFives(tab)/5)>=4){score=20;}
									else
									{//else2  
										if((categorieFours(tab)/4)>=4) {score=16;}
										else 
										{//else3
											if((categorieThrees(tab)/3)>=4) {score=12;}
											else
											{//else4
												
												if((categorieTwos(tab)/2)>=4) {score=8;}
												else
												{//else5
													if(categorieOnes(tab)>=4) {score=4;}
												}//else5
											}//else4
										}//else3
										
									}//else2
									
							   }//else1
								return score;}//method
//Small Straight
					public int categorieSmallStraight(int[] tab) {
					int score=0;
					if(tab[0]==1 && tab[1]==2 && tab[2]==3 && tab[3]==4 && tab[4]==5 ) {score=15;}
					return score;}//method
//Large Straight					
				public int categorieLargeStraight(int[] tab) {
					int score=0;
					if(tab[0]==2 && tab[1]==3 && tab[2]==4 && tab[3]==5 && tab[4]==6 ) {score=20;}
				return score;}//method
				public int categorieTwoPaire(int[] tab) {
			      int score=0;	
			      int score1=0;
			      int [] tab1=new int[5];
				if(categorieFourOfkind(tab)!=0 ) {score=0;}
				else {//else1
					if(categoriePair(tab)==0) {score=0; }//pas de paire 
					else {//else2
						score1=categoriePair(tab);
						for(int i=0;i<5;i++) {//for
						if(tab[i]==categoriePair(tab)/2) {
							tab1[i]=0;
						}
						else {tab1[i]=tab[i];}
						}//for
					if(categoriePair(tab1)==0) {score=0;}
					else {score=score1+categoriePair(tab1);}
				}//else2
				}//else1
			 return score;}//method
			//Foula
				public int categorieFoule(int[] tab) {
				      int score=0;	
				      int score1=0;
				      int [] tab1=new int[5];
					  if(categorieFourOfkind(tab)!=0 ) {score=0;}
					  else {//else1
					 if(categorieThreeOfkind(tab)==0) {score=0; }//pas de triple
					 else {//else2
					score1=categorieThreeOfkind(tab);
					for(int i=0;i<5;i++) {//for
					if(tab[i]==categorieThreeOfkind(tab)/3) {
					tab1[i]=0;
							}
					else {tab1[i]=tab[i];}
							}//for
					if(categoriePair(tab1)==0) {score=0;}
					else {score=score1+categoriePair(tab1);}
						}//else2
					}//else1
				  return score;}//method	
				
}//class
			
			