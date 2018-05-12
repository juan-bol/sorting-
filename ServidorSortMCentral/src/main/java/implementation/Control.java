package implementation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.osoa.sca.annotations.Reference;

import interfaces.IDistribute;
import interfaces.IMerge;
import interfaces.ISort;

public class Control implements ISort {
	
	// Cantidad de nodos de procesamiento disponibles para hacer el sort
	public final static int CANT_NPS = 3;
	
	@Reference(name="iDistribute1")
	private IDistribute distribute1;
	
	@Reference(name="iDistribute2")
	private IDistribute distribute2;
	
	@Reference(name="iDistribute3")
	private IDistribute distribute3;	
	
	@Reference(name="iMerge")
	private IMerge merge;

	@Override
	public ArrayList<Character> sort(ArrayList<Character> lista) {
		
		List<ArrayList<Character>> arreglos = divide(lista);
		
		
		return lista;
	}
	
	public List<ArrayList<Character>> divide (ArrayList<Character> lista) {
		
		List<ArrayList<Character>> arreglos = new LinkedList<ArrayList<Character>>();

		int n = lista.size()/CANT_NPS;
		int m1=n-1, m2=(n*2)-1;		
		
		arreglos.add(distribute1.distribute(lista, 0, m1));
		arreglos.add(distribute2.distribute(lista, m1+1, m2));
		arreglos.add(distribute3.distribute(lista, m2+1, lista.size()));
		
		return arreglos;
	}
	

}
