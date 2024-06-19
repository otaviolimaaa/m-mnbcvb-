package Matrizes;

public class Matriz {
	public static void main(String[] args) {
	char A [][] = {
			{'A','B','C','D'},
			{'E','F','G','H'},
			{'I','J','K','L'},
			{'M','N','O','P'}
	};

	for(char[]letra: A) {
		for(char coluna : letra) {
			System.out.println(coluna + "\t");
		}
		System.out.println();
	}
}}