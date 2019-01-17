package paquete1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio3 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
// Create a TreeSet of Integer
		TreeSet<Integer> conjuntoOrdenado = new TreeSet<Integer>();
		
		conjuntoOrdenado.addAll(Arrays.asList(a,b,c));
/// {Enter your code here
		for (Integer elto : conjuntoOrdenado) {
			
			}
		Iterator<Integer> it = conjuntoOrdenado.iterator();
		System.out.println(" Sorted numbers:");
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}