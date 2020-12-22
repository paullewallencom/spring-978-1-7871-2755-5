package src.org.packt.Spring.chapter2.setterinjection.empty;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeeService {

	private List<Object> lists;
	private Set<Object> sets;
	private Map<Object, Object> maps;

	public void setLists(List<Object> lists) {
		this.lists = lists;
	}

	public void setSets(Set<Object> sets) {
		this.sets = sets;
	}

	public void setMaps(Map<Object, Object> maps) {
		this.maps = maps;
	}

}