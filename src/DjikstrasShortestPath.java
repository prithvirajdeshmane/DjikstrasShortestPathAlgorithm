import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class DjikstrasShortestPath {
	
	public void computePath(Vertex sourceVertex) {
		
		sourceVertex.setDistance(0); //Setting distance to itself as zero
		
		PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(sourceVertex);
		
		while(!priorityQueue.isEmpty()) {
			
			Vertex actualVertex = priorityQueue.poll();
			
			for (Edge edge : actualVertex.getAdjacencyEdgeList()) {
				
				Vertex v = edge.getEndVertex();
				double newDistance = actualVertex.getDistance() + edge.getWeight();
				if (newDistance < v.getDistance()) {
					priorityQueue.remove(v);
					v.setDistance(newDistance);
					v.setPredecessor(actualVertex);
					priorityQueue.add(v);
				}
			}
			
		}
	}
	
	public List<Vertex> getShortestPathTo(Vertex targetVertex) {
		List<Vertex> shortestPathToVertex = new ArrayList<Vertex>();
		
		for(Vertex vertex = targetVertex; vertex !=null; vertex = vertex.getPredecessor()) {
			shortestPathToVertex.add(vertex);
		}
		
		Collections.reverse(shortestPathToVertex);
		
		return shortestPathToVertex;
	}
	
}
