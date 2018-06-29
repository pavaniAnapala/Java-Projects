

package CodeChallenge;

import java.util.*;
class Node{
    public String id;
    public String name;
    public List<Node> children =new ArrayList<>();
    public Node parent;
    
    Node(Node parent){
        this.parent = parent;
     }
    public String getId() {
        return id;
     }
    public void setId(String id) {
    this.id = id;
     }
    public List<Node> getChildren() {
         return children;
     }  
    public Node getParent() {
        return parent;
     }
    private static Node addChild(Node parent, String id) { 
        Node node = new Node(parent);
        node.setId(id);
        parent.getChildren().add(node);
        return node;
    }
    private static void printTree(Node node, String appender) {
        System.out.println(appender + node.getId());
        for (Node each : node.getChildren()) {
        printTree(each, appender + appender);
   }
}
}

public class TreeService {
       
    public static void main(String[] args){
       Node root = new Node(null);
      root.setId("root");
      Node childNode= addChild(root, "Level-1 Node-0"); //Adding child to Root Node
      addChild(childNode, "Node-0 -SubNode-1");
      addChild(childNode, "Node-0 -SubNode-2");
      
      Node child2 = addChild(root, "Level-1 Node-1"); //Adding another child to root Node
      addChild(child2, "Node-1 -SubNode-2");
      addChild(child2, "Node-1 -SubNode-2");
      
      printTree(root, " ");
    }
    
    private static void printTree(Node node, String appender) {
      System.out.println(appender + node.getId());
      for (Node each : node.getChildren()) {
      printTree(each, appender + appender);
  }
    }
    private static Node addChild(Node parent, String id) {
        Node node = new Node(parent);
        node.setId(id);
        parent.getChildren().add(node);
        return node;
    }       
}
