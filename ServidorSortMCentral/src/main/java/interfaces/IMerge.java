package interfaces;

import java.util.ArrayList;
import java.util.List;

import org.osoa.sca.annotations.Service;

@Service
public interface IMerge {

	public ArrayList<Character> merge(List<ArrayList<Character>> arreglos);
}
