package interfaces;

import java.util.ArrayList;

import org.osoa.sca.annotations.Service;

@Service
public interface IDistribute {
	
	public ArrayList<Character> distribute(ArrayList<Character> arreglo, int i, int r);
	
}
