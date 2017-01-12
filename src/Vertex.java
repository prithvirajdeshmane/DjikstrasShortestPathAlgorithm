import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex> {
	
	private String data;
	private Vertex predecessor;
	private boolean visited;
	private double distance;
	private List<Edge> adjacencyEdgeList;
	
	public Vertex(String data) {
		this.data = data;
		this.adjacencyEdgeList = new ArrayList<Edge>();
		this.visited = false;
		this.predecessor = null;
		this.distance = Double.MAX_VALUE;
	}
	
	public void addNeighbor(Edge edge) {
		this.adjacencyEdgeList.add(edge);
	}
	
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Vertex getPredecessor() {
		return predecessor;
	}

	public void setPredecessor(Vertex predecessor) {
		this.predecessor = predecessor;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public List<Edge> getAdjacencyEdgeList() {
		return adjacencyEdgeList;
	}

	public void setAdjacencyEdgeList(List<Edge> adjacencyEdgeList) {
		this.adjacencyEdgeList = adjacencyEdgeList;
	}

	@Override
	public String toString() {
		return this.data;
	}

	@Override
	public int compareTo(Vertex otherVertex) {
		return Double.compare(this.getDistance(), otherVertex.getDistance());
	}
}
