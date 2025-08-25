package collectionProject;

import java.util.ArrayList;
import java.util.List;

public class Teams {

	public static void main(String[] args) {

		List<Player> TeamRCB = new ArrayList<>();

		TeamRCB.add(new Player("Virat Kohli", 18, "RCB", 4500, 16));
		TeamRCB.add(new Player("Faf du Plessis", 13, "RCB", 3200, 5));
		TeamRCB.add(new Player("Glenn Maxwell", 32, "RCB", 2100, 12));
		TeamRCB.add(new Player("Dinesh Karthik", 19, "RCB", 2100, 0));
		TeamRCB.add(new Player("Rajat Patidar", 24, "RCB", 800, 0));
		TeamRCB.add(new Player("Anuj Rawat", 33, "RCB", 500, 0));
		TeamRCB.add(new Player("Mahipal Lomror", 25, "RCB", 450, 3));
		TeamRCB.add(new Player("Mohammed Siraj", 73, "RCB", 120, 85));
		TeamRCB.add(new Player("Harshal Patel", 9, "RCB", 250, 98));
		TeamRCB.add(new Player("Wanindu Hasaranga", 49, "RCB", 200, 68));
		TeamRCB.add(new Player("Josh Hazlewood", 38, "RCB", 50, 65));

		System.out.println("---------------------Players of team RCB---------------------");
		System.out.println();
//		System.out.println();

		System.out.printf("%-20s %-10s %-10s %-10s %-10s%n", "Name", "Jersey No", "Team", "Runs", "Wickets");
		System.out.println("-------------------------------------------------------------");

		for (Player p : TeamRCB)
			System.out.printf("%-20s %-10d %-10s %-10d %-10d%n", p.getName(), p.getJnumber(), p.getTname(), p.getRuns(),
					p.getWickets());

		System.out.println();

		for (Player p : TeamRCB) {
			if (p.getRuns() > 2000) {
				System.out.println("Batsman of team RCB : " + p.getName());
			}
		}
		System.out.println();

		for (Player p : TeamRCB) {
			if (p.getRuns() < 500) {
				System.out.println("Baller of team RCB : " + p.getName());
			}
		}
		System.out.println();

		for (Player p : TeamRCB) {
			if (p.getRuns() >= 500 && p.getRuns() <= 2000) {
				System.out.println("All Rounder of team RCB : " + p.getName());
			}
		}
		System.out.println();

		for (Player p : TeamRCB) {
			if (p.getWickets() > 50) {
				System.out.println("Top Wicket Taker: " + p.getName());
			}

		}
		System.out.println();
		for (Player p : TeamRCB) {
			if (p.getName().startsWith("R") || p.getName().startsWith("V")) {
				System.out.println("Player name starts with R or V: " + p.getName());
			}

		}
		System.out.println();

		List<Player> TeamCSK = new ArrayList<>();

		TeamCSK.add(new Player("MS Dhoni", 7, "CSK", 5000, 0));
		TeamCSK.add(new Player("Ruturaj Gaikwad", 31, "CSK", 1800, 0));
		TeamCSK.add(new Player("Moeen Ali", 18, "CSK", 1500, 30));
		TeamCSK.add(new Player("Ravindra Jadeja", 8, "CSK", 2500, 150));
		TeamCSK.add(new Player("Shivam Dube", 70, "CSK", 1200, 5));
		TeamCSK.add(new Player("Devon Conway", 88, "CSK", 800, 0));
		TeamCSK.add(new Player("Ambati Rayudu", 9, "CSK", 4000, 0));
		TeamCSK.add(new Player("Deepak Chahar", 90, "CSK", 300, 70));
		TeamCSK.add(new Player("Matheesha Pathirana", 99, "CSK", 50, 35));
		TeamCSK.add(new Player("Ben Stokes", 55, "CSK", 1200, 50));
		TeamCSK.add(new Player("Simarjeet Singh", 23, "CSK", 100, 15));

		System.out.println("---------------------Players of team CSK---------------------\n");
		System.out.printf("%-20s %-10s %-10s %-10s %-10s%n", "Name", "Jersey No", "Team", "Runs", "Wickets");
		System.out.println("-------------------------------------------------------------");

		for (Player p : TeamCSK) {
			System.out.printf("%-20s %-10d %-10s %-10d %-10d%n", p.getName(), p.getJnumber(), p.getTname(), p.getRuns(),
					p.getWickets());
		}

		System.out.println();

		// Batsmen
		for (Player p : TeamCSK) {
			if (p.getRuns() > 2000) {
				System.out.println("Batsman of team CSK : " + p.getName());
			}
		}

		System.out.println();

		// Bowlers
		for (Player p : TeamCSK) {
			if (p.getRuns() < 500) {
				System.out.println("Bowler of team CSK : " + p.getName());
			}
		}

		System.out.println();

		// All-Rounders
		for (Player p : TeamCSK) {
			if (p.getRuns() >= 500 && p.getRuns() <= 2000) {
				System.out.println("All Rounder of team CSK : " + p.getName());
			}
		}
		System.out.println();

		for (Player p : TeamCSK) {
			if (p.getWickets() > 50) {
				System.out.println("Top Wicket Taker: " + p.getName());
			}

		}
		System.out.println();

		for (Player p : TeamCSK) {
			if (p.getName().startsWith("R") || p.getName().startsWith("V")) {
				System.out.println("Player name starts with R or V: " + p.getName());
			}

		}
		System.out.println();
		// Mumbai Indians
		List<Player> TeamMI = new ArrayList<>();

		TeamMI.add(new Player("Rohit Sharma", 45, "MI", 5000, 0));
		TeamMI.add(new Player("Ishan Kishan", 23, "MI", 2200, 0));
		TeamMI.add(new Player("Suryakumar Yadav", 63, "MI", 3500, 0));
		TeamMI.add(new Player("Tilak Varma", 9, "MI", 1200, 0));
		TeamMI.add(new Player("Hardik Pandya", 33, "MI", 1800, 50));
		TeamMI.add(new Player("Tim David", 21, "MI", 900, 0));
		TeamMI.add(new Player("Nehal Wadhera", 14, "MI", 400, 0));
		TeamMI.add(new Player("Jasprit Bumrah", 93, "MI", 150, 120));
		TeamMI.add(new Player("Piyush Chawla", 11, "MI", 250, 150));
		TeamMI.add(new Player("Gerald Coetzee", 12, "MI", 80, 35));
		TeamMI.add(new Player("Romario Shepherd", 4, "MI", 300, 20));

		System.out.println("---------------------Players of team MI---------------------");
		System.out.println();
		System.out.printf("%-20s %-10s %-10s %-10s %-10s%n", "Name", "Jersey No", "Team", "Runs", "Wickets");
		System.out.println("-------------------------------------------------------------");

		for (Player p : TeamMI)
			System.out.printf("%-20s %-10d %-10s %-10d %-10d%n", p.getName(), p.getJnumber(), p.getTname(), p.getRuns(),
					p.getWickets());

		System.out.println();

		for (Player p : TeamMI) {
			if (p.getRuns() > 2000) {
				System.out.println("Batsman of team MI : " + p.getName());
			}
		}
		System.out.println();

		for (Player p : TeamMI) {
			if (p.getRuns() < 500) {
				System.out.println("Baller of team MI : " + p.getName());
			}
		}
		System.out.println();

		for (Player p : TeamMI) {
			if (p.getRuns() >= 500 && p.getRuns() <= 2000) {
				System.out.println("All Rounder of team MI : " + p.getName());
			}
		}
		System.out.println();

		for (Player p : TeamMI) {
			if (p.getWickets() > 50) {
				System.out.println("Top Wicket Taker: " + p.getName());
			}

		}

		for (Player p : TeamMI) {
			if (p.getName().startsWith("R") || p.getName().startsWith("V")) {
				System.out.println("Player name starts with R or V: " + p.getName());
			}
		}

		System.out.println();

		// Punjab Kings
		List<Player> TeamPBKS = new ArrayList<>();

		TeamPBKS.add(new Player("Shikhar Dhawan", 42, "PBKS", 6500, 0));
		TeamPBKS.add(new Player("Prabhsimran Singh", 84, "PBKS", 1200, 0));
		TeamPBKS.add(new Player("Jonny Bairstow", 51, "PBKS", 1800, 0));
		TeamPBKS.add(new Player("Liam Livingstone", 7, "PBKS", 1500, 25));
		TeamPBKS.add(new Player("Rilee Rossouw", 30, "PBKS", 900, 0));
		TeamPBKS.add(new Player("Sam Curran", 58, "PBKS", 1400, 70));
		TeamPBKS.add(new Player("Harpreet Brar", 95, "PBKS", 300, 35));
		TeamPBKS.add(new Player("Arshdeep Singh", 2, "PBKS", 100, 85));
		TeamPBKS.add(new Player("Rahul Chahar", 28, "PBKS", 150, 75));
		TeamPBKS.add(new Player("Kagiso Rabada", 25, "PBKS", 200, 110));
		TeamPBKS.add(new Player("Nathan Ellis", 86, "PBKS", 80, 40));

		System.out.println("---------------------Players of team PBKS---------------------");
		System.out.println();
		System.out.printf("%-20s %-10s %-10s %-10s %-10s%n", "Name", "Jersey No", "Team", "Runs", "Wickets");
		System.out.println("--------------------------------------------------------------");

		for (Player p : TeamPBKS)
			System.out.printf("%-20s %-10d %-10s %-10d %-10d%n", p.getName(), p.getJnumber(), p.getTname(), p.getRuns(),
					p.getWickets());

		System.out.println();

		for (Player p : TeamPBKS) {
			if (p.getRuns() > 2000) {
				System.out.println("Batsman of team PBKS : " + p.getName());
			}
		}
		System.out.println();

		for (Player p : TeamPBKS) {
			if (p.getRuns() < 500) {
				System.out.println("Baller of team PBKS : " + p.getName());
			}
		}
		System.out.println();

		for (Player p : TeamPBKS) {
			if (p.getRuns() >= 500 && p.getRuns() <= 2000) {
				System.out.println("All Rounder of team PBKS : " + p.getName());
			}
		}
		System.out.println();

		for (Player p : TeamPBKS) {
			if (p.getWickets() > 50) {
				System.out.println("Top Wicket Taker: " + p.getName());
			}

		}
		System.out.println();

		for (Player p : TeamPBKS) {
			if (p.getName().startsWith("R") || p.getName().startsWith("V")) {
				System.out.println("Player name starts with R or V: " + p.getName());
			}
		}

	}

}
