public class Main {
    public static void main(String [] args) {
        Clique clique = new Clique(4);

        clique.addEdge(0,1);
        clique.addEdge(0,2);
        clique.addEdge(1,2);
        clique.addEdge(2,3);

        clique.run();
    }
}
