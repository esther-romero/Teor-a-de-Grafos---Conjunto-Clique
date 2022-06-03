public class Main {
    public static void main(String [] args) {
        Clique clique = new Clique(8);
        
        clique.addEdge(0,1);
        clique.addEdge(1,2);
        clique.addEdge(1,7);
        clique.addEdge(1,6);
        clique.addEdge(2,3);
        clique.addEdge(2,5);
        clique.addEdge(3,4);
        clique.addEdge(4,5);
        clique.addEdge(5,7);
        clique.addEdge(5,6);
        clique.addEdge(6,7);

        clique.run();
    }
}