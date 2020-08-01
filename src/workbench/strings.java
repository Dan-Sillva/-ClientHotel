package workbench;

import java.util.Locale;
import java.util.Scanner;

public class strings {

	public static void main(String[] args) {

		String original = ("abcde FGTIJ ABC abc DEFIG   ");
		String s01 = original.toLowerCase(); // caixa "baixa"
		String s02 = original.toUpperCase(); // CAIXA ALTA
		String s03 = original.trim(); // Tira os ultimos espaços
		String s04 = original.substring(3); // Pega os digitos de 'x' pra frente
		String s05 = original.substring(2, 7); // Pega os digitos de 'x' até 'y'
		String s06 = original.replace('a', 'x'); // Mesma cosia do de baixo
		String s07 = original.replace("abc", "xyxy"); // Substitui o primeiro pelo segundo(abc -> xyxy)
		int i = original.indexOf("bc"); // procuira a primeira ocorrencia
		int j = original.lastIndexOf("bc"); // procura a utima ocorrencia

		String s = "apple potato lemon";
		String[] vetor = s.split(" "); // Separa a String inteira por vetores, com separador declarado
		String word1 = vetor[0];

		System.out.println(s05);
	}
}
