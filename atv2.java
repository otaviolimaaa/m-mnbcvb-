package Matrizes;

public class atv2 {
	public static void main(String[] args) {
		char A [][] = {
				{'*','*','*','*'},
				{'*','*','*'},
				{'*','*'},
				{'*'}
		};
		for(char[]letra: A) {
			for(char coluna : letra) {
				System.out.print(coluna + "\t");
				System.out.println();
			}}
		char matriz[][] = {
				{' ',' ','*',' ',' '},
				{' ',' ','*',' '},
				{'*','*','*','*','*',},
				{' ',' ','*',' ',' '},
				{' ',' ','*',' ',' '}
		};
		for (char []letra:matriz) {
			for (char colu:letra) {
				System.out.print(colu + "\t");
			}
			System.out.println();
		}
	}}