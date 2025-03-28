public class AlberoBinario
{
	Nodo radice;

	public AlberoBinario()
	{
		radice = null;
	}

	//passiamo un nodo dove aggiungere un valore
	private Nodo aggiungiRicorsivo(Nodo corrente,int valore)
	{
		if(corrente==null)
			return new Nodo(valore);

		if (valore< corrente.valore)
			corrente.sinistro= aggiungiRicorsivo(corrente.sinistro,valore);

		if (valore> corrente.valore)
			corrente.destro= aggiungiRicorsivo(corrente.destro,valore);

		return corrente;
	}

	//AGGIUNGE UN VALORE ALL'ALBERO
	public void aggiungi(int valore)
	{
		radice= aggiungiRicorsivo(radice, valore);
	}

	public void inorder(Nodo nodo)
	{
		if (nodo!=null)
		{
			inorder(nodo.sinistro);
			System.out.println(nodo.valore);
			inorder(nodo.destro);
		}
	}


}

//RICORSIONE
//public void multiply(int numeroInizio, int valoreRichiesto)
//{
//	while (numeroInizio<= valoreRichiesto)
//		numeroInizio*=2;
//
//}
//
//public void multiply2(int numeroInizio, int valoreRichiesto)
//{
//	if(numeroInizio!=valoreRichiesto)
//		multiply2(numeroInizio*2,valoreRichiesto);
//}


