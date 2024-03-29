import java.util.*;
public class Main
{
    public static class Edge{
        int src,nbr,wt;
        Edge(int src,int nbr,int wt){
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int vtces = scn.nextInt();
        ArrayList<Edge>[] graph = new ArrayList[vtces];

        // initialization
        for(int i = 0 ; i < vtces ; i++){
            graph[i] = new ArrayList<>();
        }

        int nedges = scn.nextInt();

        for(int i = 0 ; i < nedges ; i++){
            int v1 = scn.nextInt() , v2 = scn.nextInt() , wt = scn.nextInt();

            graph[v1].add(new Edge(v1,v2,wt));
            graph[v2].add(new Edge(v2,v1,wt));
        }


        for(ArrayList<Edge> edges : graph){
            for(Edge edge : edges){
                System.out.println(edge.src+"->"+edge.nbr+"@"+edge.wt);
            }
        }
}
}
