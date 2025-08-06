package org.example;

public class GridSignalAnalyzer{

	// Mission Data: The Scrambled Communications Grid
	char[][] scrambledGrid = {
	    {'C', 'H', 'A', 'R', 'L', 'I', 'E'},
	    {'A', 'L', 'P', 'H', 'A'},
	    {'T', 'A', 'N', 'G', 'O', '7'},
	    {'B', 'R', 'A', 'V', 'O'}
	};

	public void analyzeWithForLoop(){
		for(int row = 0; row < scrambledGrid.length; row++){
			for(int col = 0; col < scrambledGrid[row].length; col++){
				System.out.print(scrambledGrid[row][col] + " ");
			}
			System.out.println();
		}
	}

	public void analyzeWithForEachLoop(){
		for(char[] row : scrambledGrid){
			System.out.println("Processing Row with Hash: " + row);
			for(char col : row){
				System.out.println("-> " + col);
			}
		}
	}

	public void analyzeWithHybridLoop(){
		for (char[] row : scrambledGrid){
			for(int i = 0; i < row.length; i++){
				System.out.print(row[i] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args){

	GridSignalAnalyzer analyzer = new GridSignalAnalyzer();

	System.out.println("--- PHASE 2: STANDARD FOR-LOOP MANEUVER ---");
    analyzer.analyzeWithForLoop();

    System.out.println("\n--- PHASE 3: ADVANCED FOR-EACH SWEEP ---");
    analyzer.analyzeWithForEachLoop();

    System.out.println("\n--- PHASE 4: HYBRID LOOP APPROACH ---");
    analyzer.analyzeWithHybridLoop();


	}
	
}