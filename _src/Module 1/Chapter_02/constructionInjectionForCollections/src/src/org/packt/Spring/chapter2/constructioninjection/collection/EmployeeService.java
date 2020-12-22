package src.org.packt.Spring.chapter2.constructioninjection.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeeService {

	private List<Object> lists;
	private Set<Object> sets;
	private Map<Object, Object> maps;

	public EmployeeService(List<Object> lists, Set<Object> sets,
			Map<Object, Object> maps) {
		this.lists = lists;
		this.sets = sets;
		this.maps = maps;
	}

	public List<Object> getLists() {
		return lists;
	}

	public void setLists(List<Object> lists) {
		this.lists = lists;
	}

	public Set<Object> getSets() {
		return sets;
	}

	public void setSets(Set<Object> sets) {
		this.sets = sets;
	}

	public Map<Object, Object> getMaps() {
		return maps;
	}

	public void setMaps(Map<Object, Object> maps) {
		this.maps = maps;
	}

}
