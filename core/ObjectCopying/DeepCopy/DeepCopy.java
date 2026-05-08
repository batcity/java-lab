import java.util.*;

class DeepCopy {

    static class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    static HashMap<Integer, Node> visitedNodesByValue = new HashMap<>();

    public Node cloneGraph(Node node) {
        return copyNode(node);
    }

    private static Node copyNode(Node node) {

        if(node==null) return node;

        if(visitedNodesByValue.containsKey(node.val)) return visitedNodesByValue.get(node.val);
        
        ArrayList<Node> neighbors = new ArrayList<>();
        Node copiedNode = new Node(node.val, neighbors);
        visitedNodesByValue.put(copiedNode.val, copiedNode);

        for(Node neighbor: node.neighbors) {
            neighbors.add(copyNode(neighbor));
        }

        return copiedNode;
    }

    public static void main(String args[]) {
        Node originalNode = new Node(0);
        Node copiedNode = copyNode(originalNode);
    }
}