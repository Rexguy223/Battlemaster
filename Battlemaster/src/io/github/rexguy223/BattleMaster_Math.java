package io.github.rexguy223;
import java.math.*;
public class BattleMaster_Math {
	boolean y = false;
/*  ________________________________
 * /         Battle Master          \
 * |       Battle Simulation        |
 * |                                |
 * |                                |
 * |   Math Equations by:           |
 * |    - Kickguy223                |
 * |                                |
 * |                                |
 * |                                |
 * |                                |
 * |         V0.1 Alpha             |
 * |                                |
 * |                                |
 * |                                |
 * |                                |
 * |                                |
 * |                                |
 * |                                |
 * \________________________________/
 */
//
// Code begins
//
/*
 * 
 * the following is self input
 * 
 * 
 * 
 * 
 */
	double Team1_Troops = 100000;
	double Team2_Troops = 200000;
	
	double Team1_Power = 500;
	double Team2_Power = 500;
	
	double Team1_Surv_Skills = 0;
	double Team2_Surv_Skills = 0;
	
	double Team1_Battle_Skills = 0;
	double Team2_Battle_Skills = 0;
	
	// Self input ends here
	
	
	/*
	 * 
	 * Do not touch this these are Conditional modifiers. Constantly changing, if changed, Unexpected results may be Out-putted.
	 * 
	 */
	
	
	boolean Team1_Troop_Advantage = false;
	boolean Team2_Troop_Advantage = false;
	
	boolean Team1_Power_Advantage = false;
	boolean Team2_Power_Advantage = false;

	double Team1_BS = 50;
	double Team2_BS = 50;
	
	/*
	 * 
	 *   These are Min-Max values, these can be changed, but the change back values are needed to be changed, unless you know how to
	 *   
	 */
	
	byte Max_Limit_val = 100;
	byte Min_Limit_val = 0;
	
	// Is_terrain_Harsh is self input
	boolean Is_terrain_Harsh = false;
	
	
	public void battle(){
		/*
		 * 
		 * Determines which team has Troop advantage and assigns a boolean to the team with the Most troops
		 * 
		 * 
		 * ToDo: Make it so that there is a deadzone where there is a little bit of leeway for the null advantage,
		 * fe. Team one has 100 troops and Team two has 105 troops, none has advantage.
		 * this would unclog the Advantage output for closly matched teams
		 */
		
		if (Team1_Troops > Team2_Troops) {
			Team1_Troop_Advantage = true;
			System.out.println("Team One has Troop advantage");
		} else if (Team1_Troops < Team2_Troops) {
			Team2_Troop_Advantage = true;
			System.out.println("Team two has Troop advantage");
		} else if (Team1_Troops == Team2_Troops) {
			Team1_Troop_Advantage = false;
			Team2_Troop_Advantage = false;
			System.out.println("Teams are equal in troops");
		}
		
		/*
		 * 
		 * This Take troop advantage and assigns  the bonus to the Respective Teams Battle Strength
		 * 
		 * if team Battle strength is larger then Max value, it resets back to max value, The Else if statements hold the change back sub function 
		 * 
		 */
		if (Team1_Troop_Advantage = true) {
		Team1_BS = Team1_BS + 5;
		} else if (Team1_BS > Max_Limit_val) {
			Team1_BS = 100;
		}
		
		if (Team2_Troop_Advantage = true) {
			Team2_BS = Team2_BS + 5;
			} else if (Team2_BS > Max_Limit_val) {
				Team2_BS = 100;
			}
		
		
		/*
		 * 
		 * Determines Which teams has the Power advantage
		 * 
		 */
		
		
		if (Team1_Power > Team2_Power) {
			Team1_Power_Advantage = true;
		}else if (Team1_Power < Team2_Power) {
			Team2_Power_Advantage = true;
		}else if (Team1_Power == Team2_Power){
			Team1_Power_Advantage = false;
			Team2_Power_Advantage = false;
		}
		
		
		/*
		 * 
		 * Grabs Which team has Power Advantage and adds to there Strength
		 * 
		 */
		if(Team1_Power_Advantage = true) {
			Team1_BS = Team1_BS + 5;
		} else if (Team1_BS > Max_Limit_val){
			Team1_BS = 100;
		}
		
		if (Team2_Power_Advantage = true) {
			Team2_BS = Team2_BS + 5;
		} else if (Team2_BS > Max_Limit_val) {
			Team2_BS = 100;
		}
		
		
		
		/*
		 * 
		 * Adds Battle Strength for troop amounts, at low for balance
		 * 
		 */
		
		
		if(Team1_Troops > 50) {
			Team1_BS = Team1_BS + 5;
			if(Team1_Troops > 100){
				Team1_BS = Team1_BS + 10;
				if(Team1_Troops > 500){
					Team1_BS = Team1_BS + 15;
					if(Team1_Troops > 1000){
						Team1_BS = Team1_BS + 20;
					}
				}
			}
		}
		
		
		if(Team2_Troops > 50){
			Team2_BS = Team2_BS + 5;
			if(Team2_Troops > 100){
				Team2_BS = Team2_BS + 10;
				if(Team2_Troops > 500){
					Team2_BS = Team2_BS + 15;
					if(Team2_Troops > 1000){
						Team2_BS = Team2_BS + 20;
					}
				}
			}
		}
		
		/*
		 * 
		 * Beginning simulation
		 * 
		 */
		
	//	double i = 0;
		

		
		do{
			System.out.println("team1:" + Team1_Troops);
			System.out.println("team2:" + Team2_Troops);
			double p = Math.random();
		double x = Math.random();
			if(Team1_BS > 50){
				if(x > .20){
				 Team2_Troops = Team2_Troops - 1;
				}
				if(Team1_BS < 50){
					if(x > .50){
						Team2_Troops = Team2_Troops - 1;
					}
					
				//if (Team2_BS > 50) {
					if (p > .10){
						Team1_Troops = Team1_Troops - 1;
					}
				//	if(Team2_BS < 50) {
					//	if (p > .50){
						//	Team1_Troops = Team1_Troops - 1;
						//}
					//}
				//}
			
			if(Team1_Troops == Min_Limit_val){
			 y = true;
			 System.out.println("Team 1 has no more troops, Team 2 Wins");
				//break;
			}
			if(Team2_Troops == Min_Limit_val){
				y = true;
				System.out.println("Team 2 has no more Troops, Team 1 wins");
			//	break;
			}
		} 
		
			}
		}while(y != true );
	}
}


