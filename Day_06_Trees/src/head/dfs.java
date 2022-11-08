/**
* @Developer : Sagar_Pokale
* 07-Nov-2022 3:17:05 PM
**/

package head;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class dfs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of vertices: ");
		int vCount = sc.nextInt();
		AdjMatrixGraph g = new AdjMatrixGraph(vCount);
		g.accept(sc);
		g.display();
		int start = 1;
		g.dfsTrav(start);
		 g.bfsTrav(start);
		 System.out.println("Is Connected: " + g.isConnected());
		 g.dfsSpanningTree(start);
		 g.bfsSpanningTree(start);
		// g.singleSourcePathLength(start);
		// System.out.println("Is BiPartite: " + g.isBipartite());
	}

}
/*
6
7
0 1
0 2
0 3
1 2
1 4
3 4
3 5
*/
class AdjMatrixGraph {
	private int vertCount, edgeCount;
	private boolean adjmat[][];

	public AdjMatrixGraph(int vCount) {
		vertCount = vCount;
		adjmat = new boolean[vertCount][vertCount];
	}
	
	public void accept(Scanner sc) {
		System.out.print("Enter number of edges: ");
		edgeCount = sc.nextInt();
		for(int i=0; i<edgeCount; i++) {
			System.out.println("Enter edge (src dest): ");
			int src = sc.nextInt();
			int dest = sc.nextInt();
			adjmat[src][dest] = true;
			adjmat[dest][src] = true; // skip this line if graph is directed graph
		}
	}
	
	public void display() {
		for (int s = 0; s < vertCount; s++) {
			for (int d = 0; d < vertCount; d++) {
				System.out.print((adjmat[s][d] ? "1" : "0") + "\t");
			}
			System.out.println();
		}
	}
	









	public void dfsTrav(int start) {
		System.out.print("DFS: ");
		boolean marked[] = new boolean[vertCount];
		// DFS needs stack of Vertices for traversal
		Stack<Integer> s = new Stack<>();
		// push start vertex on stack and mark it
		s.push(start);
		marked[start] = true;
		while(!s.isEmpty()) {
			// pop vertex from stack and print it
			Integer v = s.pop();
			System.out.print(v + ", ");
			
			// push all non-marked neighbors on stack and mark them
			for(int d=0; d<vertCount; d++) {
				// adjmat[v][d] = true means d is neighbor of v
				// marked[d] = false means d is non-marked
				if(adjmat[v][d] && !marked[d]) {
					s.push(d);
					marked[d] = true;
				}
			}
		} // repeat until stack is empty
		System.out.println();
	}












	public void bfsTrav(int start) {
		System.out.print("BFS: ");
		boolean marked[] = new boolean[vertCount];
		// BFS needs queue of Vertices for traversal
		Queue<Integer> s = new LinkedList<>();
		// push start vertex on queue and mark it
		s.offer(start);
		marked[start] = true;
		while(!s.isEmpty()) {
			// pop vertex from queue and print it
			Integer v = s.poll();
			System.out.print(v + ", ");
			
			// push all non-marked neighbors on queue and mark them
			for(int d=0; d<vertCount; d++) {
				// adjmat[v][d] = true means d is neighbor of v
				// marked[d] = false means d is non-marked
				if(adjmat[v][d] && !marked[d]) {
					s.offer(d);
					marked[d] = true;
				}
			}
		} // repeat until queue is empty
		System.out.println();
	}










	public boolean isConnected() {
		int vCount = 0;
		int start = 0;
		boolean marked[] = new boolean[vertCount];
		Stack<Integer> s = new Stack<>();
		s.push(start);
		marked[start] = true;
		while(!s.isEmpty()) {
			Integer v = s.pop();
			vCount++;			// Just here is small change to check the connected whole tree is or not 
			for(int d=0; d<vertCount; d++) {
				if(adjmat[v][d] && !marked[d]) {
					s.push(d);
					marked[d] = true;
				}
			}
		}
		return vCount == vertCount;
	}













	public void dfsSpanningTree(int start) {
		System.out.println("DFS Spanning Tree: ");
		boolean marked[] = new boolean[vertCount];
		Stack<Integer> s = new Stack<>();
		s.push(start);
		marked[start] = true;
		while(!s.isEmpty()) {
			Integer v = s.pop();
			for(int d=0; d<vertCount; d++) {
				if(adjmat[v][d] && !marked[d]) {
					s.push(d);
					marked[d] = true;
					System.out.println(v + " -> " + d);
				}
			}
		}
		System.out.println();
	}

	public void bfsSpanningTree(int start) {
		System.out.println("BFS Spanning Tree: ");
		boolean marked[] = new boolean[vertCount];
		Queue<Integer> s = new LinkedList<>();
		s.offer(start);
		marked[start] = true;
		while(!s.isEmpty()) {
			Integer v = s.poll();
			for(int d=0; d<vertCount; d++) {
				if(adjmat[v][d] && !marked[d]) {
					s.offer(d);
					marked[d] = true;
					System.out.println(v + " -> " + d);
				}
			}
		}
		System.out.println();
	}
	
	public void singleSourcePathLength(int start) {
		int dist[] = new int[vertCount];
		boolean marked[] = new boolean[vertCount];
		Queue<Integer> s = new LinkedList<>();
		s.offer(start);
		marked[start] = true;
		dist[start] = 0;
		while(!s.isEmpty()) {
			Integer v = s.poll();
			for(int d=0; d<vertCount; d++) {
				if(adjmat[v][d] && !marked[d]) {
					s.offer(d);
					marked[d] = true;
					dist[d] = dist[v] + 1;
				}
			}
		}
		System.out.println("Single Source Path Length from Vertex: " + start);
		for (int d = 0; d < vertCount; d++)
			System.out.println("to Vertex " + d + " = " + dist[d]);
		System.out.println();
	}
	






	public boolean isBipartite() {
		int start = 0;
		//0: No color, 1: color1, -1: color2
		int color[] = new int[vertCount];
		Queue<Integer> s = new LinkedList<>();
		s.offer(start);
		color[start] = 1; // color1
		while(!s.isEmpty()) {
			Integer v = s.poll();
			for(int d=0; d<vertCount; d++) {
				if(adjmat[v][d]) {
					if(color[d] == color[v])
						return false;
					if(color[d]==0) {
						s.offer(d);
						color[d] = color[v] * -1;
					}
				}
			}
		}
		return true;
	}
}
