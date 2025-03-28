public class Main
{
	public static void main(String[] args)
	{
		AlberoBinario albero = new AlberoBinario();
		//Consegna 1
//		Dato un albero binario T con radice di valore 15, disegna la struttura dell’albero
//		binario dopo aver inserito i seguenti valori nell’ordine: 10, 20, 8, 12, 17, 25.
//		Utilizza la regola che i valori minori vanno a sinistra e i valori maggiori vanno
//		a destra.

		int[] valori = {15,10, 20, 8, 12, 17, 25};

		for(int v:valori)
		{
			albero.aggiungi(v);
		}

		System.out.println("Inorder Traversal:");
		albero.inorder(albero.radice);
	}


}
