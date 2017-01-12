import java.util.List;

public class App {

	public static void main(String[] args) {
		
		//Create vertices
		Vertex vertexA = new Vertex("a");
		Vertex vertexB = new Vertex("b");
		Vertex vertexC = new Vertex("c");
		Vertex vertexD = new Vertex("d");
		Vertex vertexE = new Vertex("e");
		Vertex vertexF = new Vertex("f");
		
		//Create edges and add to adjacency lists
 		vertexA.addNeighbor(new Edge(2, vertexA, vertexD));
		vertexA.addNeighbor(new Edge(7, vertexA, vertexB));
		vertexA.addNeighbor(new Edge(5, vertexA, vertexC));
		
		vertexB.addNeighbor(new Edge(7, vertexB, vertexA));
		vertexB.addNeighbor(new Edge(3, vertexB, vertexE));
		vertexB.addNeighbor(new Edge(8, vertexB, vertexF));
		
		vertexC.addNeighbor(new Edge(5, vertexC, vertexA));
		vertexC.addNeighbor(new Edge(10, vertexC, vertexD));
		vertexC.addNeighbor(new Edge(4, vertexC, vertexE));
		
		vertexD.addNeighbor(new Edge(2, vertexD, vertexA));
		vertexD.addNeighbor(new Edge(10, vertexD, vertexC));
		vertexD.addNeighbor(new Edge(2, vertexD, vertexF));
		
		vertexE.addNeighbor(new Edge(3, vertexE, vertexB));
		vertexE.addNeighbor(new Edge(4, vertexE, vertexC));
		vertexE.addNeighbor(new Edge(6, vertexE, vertexF));
		
		vertexF.addNeighbor(new Edge(8, vertexF, vertexB));
		vertexF.addNeighbor(new Edge(2, vertexF, vertexD));
		vertexF.addNeighbor(new Edge(6, vertexF, vertexE));
		
		
		//Run the shortest path algorithm
		DjikstrasShortestPath algo = new DjikstrasShortestPath();
		
		Vertex source = vertexA;
		Vertex target = vertexE;
		
		algo.computePath(source);
		List<Vertex> shortestPath = algo.getShortestPathTo(target);
		double shortestDistance = target.getDistance();
		
		//Print the shortest path and shortest distance
		System.out.println(shortestPath + " : " + shortestDistance);
		
	}

}
