
public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        // TODO: implement

            int []Queue = new int[m.length];
            int qStart, qEnd; //indexs position at queue  
            int []dists = new int[m.length]; //distances from the source.
            boolean []visited = new boolean[m.length];
            int x;
            for (int d = 0 ; d < dists.length ; d++){ dists[d] = -1; visited[i] = false; }
            qStart = qEnd = 0;
            Queue[qStart] = i; // add i to the queue
            dists[i] = 0;      // the distance of i from i is 0
            visited[i] = true;  
            while (qStart < m.length){  //while queue isn't empty
                x = Queue[qStart];  //x is the top of the queue
                qStart++; 
                for(int k = 0 ; k < m.length; k++ ){ // go over all the nodes 
                    if (m[x][k] == 1 && visited[k] == false){
                        // if k is a neigbour and it's not visited yet
                        qEnd++; 
                        Queue[qEnd] = k;   //we add k to the end of the queue
                        visited[k] = true;  
                        dists[k] = dists[x] + 1; // distance of k from i = 1 + distance of x from i  
                    }
                }
            }
            return dists[j]; // if there isn't path from i to j it returns '-1'
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}