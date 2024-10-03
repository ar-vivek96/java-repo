package DataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class Graph {
	
	ArrayList<ArrayList<Integer>> adjlst=new ArrayList<>();
	
	Graph(int val)
	{
		for(int i=0;i<val;i++)
		{
			adjlst.add(new ArrayList<Integer>());
		}
	}
	
	public void addEdge(int u,int v)
	{
		adjlst.get(u).add(v);
		adjlst.get(v).add(u);
		
	}
	public void printAdjList()
	{
		for(int i=0;i<adjlst.size();i++)
		{
			System.out.println("Adj list of vertex "+i);
			for(int j=0;j<adjlst.get(i).size();j++)
			{
				System.out.println(" "+adjlst.get(i).get(j));
			}
		}
		
	}
	public void bfs(int v)
	{
		int V=adjlst.size();
		boolean[] visited=new boolean[V];
		
		visited[v]=true;
		Queue<Integer> q=new LinkedList<>();
		q.add(v);
		while(q.size()!=0)
		{
			int vertex=q.remove();
			System.out.print(vertex+" ");
			for(int i=0;i<adjlst.get(vertex).size();i++)
			{
				int av=adjlst.get(vertex).get(i);
				if(!visited[av])
				{
					q.add(av);
					visited[av]=true;
				}
			
			}
		}
		
	}
	
	public void dfs(int v)
	{
		int V=adjlst.size();
		boolean visited[]=new boolean[V];
		dfs2(v,visited);
		
		
	}
	public void dfs2(int v,boolean visited[])
	{
		visited[v]=true;
		System.out.print(v+" ");
		for(int i=0;i<adjlst.get(v).size();i++)
		{
			int av=adjlst.get(v).get(i);
			if(!visited[av])
				dfs2(av,visited);
		}
	}
	
}
