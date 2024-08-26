package view;
import controller.ControllerOrdenaVetor;
public class Principal {
	public static void main (String [] args) {
		
		ControllerOrdenaVetor oCont = new ControllerOrdenaVetor();
		
		int[] vet1Bs = {74,20,74,87,81,16,25,99,44,58};
		int[] vet1Ms = {74,20,74,87,81,16,25,99,44,58};
		
		int[] novoVet1Bs = oCont.OrdenacaoBubbleSort(vet1Bs);
		int[] novoVet1Ms = oCont.OrdenacaoMergeSort(vet1Ms);
		
		System.out.println("-----------------VETOR 1-----------------");
		System.out.println("BUBBLE SORT:");
		System.out.println("=========================================");
		for (int valor11 : novoVet1Bs) {
			System.out.print(valor11 +" ");
		}
		System.out.println("");
		System.out.println("========================================\n");
		
		System.out.println("MERGE SORT:");
		System.out.println("========================================");
		for (int valor12 : novoVet1Ms) {
			System.out.print(valor12 +" ");
		}
		System.out.println("");
		System.out.println("========================================\n");
		
		
		int[] vet2Bs = {44,43,42,41,40,39,38};
		int[] vet2Ms = {44,43,42,41,40,39,38};
		
		int[] novoVet2Bs = oCont.OrdenacaoBubbleSort(vet2Bs);
		int[] novoVet2Ms = oCont.OrdenacaoMergeSort(vet2Ms);
		
		System.out.println("\n-----------------VETOR 2-----------------");
		System.out.println("BUBBLE SORT:");
		System.out.println("=========================================");
		for (int valor21 : novoVet2Bs) {
			System.out.print(valor21 +" ");
		}
		System.out.println("");
		System.out.println("========================================\n");
		
		System.out.println("MERGE SORT:");
		System.out.println("========================================");
		for (int valor22 : novoVet2Ms) {
			System.out.print(valor22 +" ");
		}
		System.out.println("");
		System.out.println("========================================\n");
		
		
		int[] vet3Bs = {101,102,103,125,124,123,104,105,106,122};
		int[] vet3Ms = {101,102,103,125,124,123,104,105,106,122};
		
		int[] novoVet3Bs = oCont.OrdenacaoBubbleSort(vet3Bs);
		int[] novoVet3Ms = oCont.OrdenacaoMergeSort(vet3Ms);
		
		System.out.println("\n-----------------VETOR 3-----------------");
		System.out.println("BUBBLE SORT:");
		System.out.println("========================================");
		for (int valor31 : novoVet3Bs) {
			System.out.print(valor31 +" ");
		}
		System.out.println("");
		System.out.println("========================================\n");
		
		//System.out.println("");
		System.out.println("MERGE SORT:");
		System.out.println("========================================");
		for (int valor32 : novoVet3Ms) {
			System.out.print(valor32 +" ");
		}
		System.out.println("");
		System.out.println("========================================");
	}



	}
	
	


