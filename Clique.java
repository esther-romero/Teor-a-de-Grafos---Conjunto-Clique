import java.util.ArrayList;

public class Clique {
    private int nodo;
    private boolean[] vis;
    private int contCiclos;
    private int conjuntoCamarilla[];
    private ArrayList<Integer>[] adj;
    
    public Clique (int nodo){
        this.nodo = nodo;
        adj = new ArrayList[nodo];
        for (int i =0;i<nodo;i++) {
            adj[i] = new ArrayList<>();
        }

        contCiclos = 0;
        vis = new boolean[nodo];
        conjuntoCamarilla  = new int [nodo];
    }

    public void run() {
        for(int i=0;i<nodo;i++){
            if(contCiclos == 0) {
                conjuntoCamarilla[0] = i;
                recorrido(i,1);
            }
        }
        if(contCiclos==0) System.out.println("\n\nNo se encontro un conjunto Clique\n\n");
    }
    
    public void addEdge(int a,int b) {
        adj[a].add(b);
        adj[b].add(a);
    }
    
    public void recorrido(int v, int destino) {
        vis[v] = true;
        if(3==destino && esCiclo(v)) {
            System.out.print("Conjunto Clique: ");
            contCiclos+=1;
            int i;
            for(i=0;i<3;i++){
                System.out.print(conjuntoCamarilla[i] + " ");  
            }
            System.out.println("\nNumero Clique: " +i+"\n");

            vis[v] = false;
            return;
        }
        for (int u : adj[v]) {
            if(!vis[u]) {
                conjuntoCamarilla[destino] = u;
                recorrido(u,destino+1);
            }
        }
        vis[v] = false;
    }

    private boolean esCiclo (int v){
        boolean res = false;
        for(int i=0;i<adj[v].size();i++){
            int u = adj[v].get(i);
            if(conjuntoCamarilla[0]==u)
                res=true;
        }
        return res;
    }
}