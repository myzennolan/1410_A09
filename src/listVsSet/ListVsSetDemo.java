package listVsSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListVsSetDemo {
	List<ColoredSquare> list = new ArrayList<ColoredSquare>();
	Set<ColoredSquare> set = new HashSet<ColoredSquare>();
	
	ListVsSetDemo(ColoredSquare ...elements){
		for(ColoredSquare c : elements) {
			if(c == null) {
			
			}
			else {
			list.add(c);
			set.add(c);
			}
		}
	}
	
	public String getListElements(){
		StringBuilder returnString = new StringBuilder();
		
		for(ColoredSquare c : list) {
			returnString.append(c.toString()+"\n");
		}
		
		return returnString.toString();
	}
	
	public String getSetElements() {
		StringBuilder returnString = new StringBuilder();
		
		for(ColoredSquare c : set) {
			returnString.append(c.toString()+"\n");
		}
		
		return returnString.toString();
	}
	
	public void addElement(ColoredSquare el) {
		list.add(el);
		set.add(el);
	}
	
}
