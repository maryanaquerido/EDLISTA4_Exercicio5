package controller;
import br.edu.fateczl.bubble.OrdenaBubble;
import br.edu.fateczl.merge.OrdenaMerge;

public class ControllerOrdenaVetor {
	public ControllerOrdenaVetor() {
		super();
		}
	
	public int[] OrdenacaoBubbleSort (int[]vet) {
		OrdenaBubble bbsort = new OrdenaBubble();
		return bbsort.BubbleSort(vet);
		
	}
	
	public int[] OrdenacaoMergeSort (int[]vet) {
		OrdenaMerge mgsort = new OrdenaMerge();
		return mgsort.MergeSort(vet, 0, vet.length - 1);
		
	}

}
