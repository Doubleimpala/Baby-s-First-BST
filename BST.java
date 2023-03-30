public class BST <T>
{
    BSTNode root;
    BSTNode curr = root;
    Boolean orderChecker = true;
    /**
     * Put BST code here, you can use the Node
     * defined below since it is a NESTED CLASS
     * 
     * I've modified the BSTNode and put some example
     * code in the insert method to show how to use
     * compareTo instead of < or >
     */
    
    public void insert(T insertMe) {
        BSTNode insertNode = new BSTNode(insertMe);
        if(root == null){
          root = insertNode;
          return;
        } else if (insertNode.compareTo(curr) < 0) {
          if(curr.getLeft() == null){
            curr.setLeft(insertNode);
            return;
          } else{
            curr = curr.getLeft();
            return;
          }
        } else if(insertNode.compareTo(curr) > 0){
           if(curr.getRight() == null){
             curr.setRight(insertNode);
             return;
           } else{
             curr = curr.getRight();
             return;
           }
        } else{
          System.out.println("your code is bad");
        }
    }

      public boolean exists(T checkFor) {
        BSTNode existNode = new BSTNode(checkFor);
        if(existNode.compareTo(curr) == 0){
          return true;
        } else if (existNode.compareTo(curr) < 0) {
          if(curr.getLeft() == null){
            curr.setLeft(existNode);
            return false;
          } else{
            curr = curr.getLeft();
          }
        } else if(existNode.compareTo(curr) > 0){
           if(curr.getRight() == null){
            curr.setRight(existNode);
            return false;
          } else{
            curr = curr.getRight();
          }
        } else{
          System.out.println("your code is bad");
        }
        //if all else fails I need this to stop error because it has to return something 
        return false;
      }
      public void inOrderPrint(){
        inOrderCodeRight();
      }
      public void inOrderCodeRight(){
        orderChecker = inOrderCode();
        if(orderChecker == false){
          if(curr.getRight() == null){
            System.out.println(curr.get());
          } else{
            System.out.println(curr.get());
            curr = curr.getRight();
          }
        } else if(curr.getRight() == null)
      }
      public boolean inOrderCode(){
        if(curr.getLeft() == null){
          System.out.println(curr.get());
          return false;
        } else{
          curr = curr.getLeft();
        }

        
        
      }
       
  
    
    public class BSTNode implements Comparable
    {
        T value;
        BSTNode left;
        BSTNode right;

        public BSTNode(T val) {
            value = val;
        }

        public T get() {
            return value;
        }

        public void set(T val) {
            value = val;
        }

        public BSTNode getLeft() {
            return left;
        }

        public void setLeft(BSTNode n) {
            left = n;
        }

        public BSTNode getRight() {
            return right;
        }

        public void setRight(BSTNode n) {
            right = n;
        }
        
        public int compareTo(Object o) {
            BSTNode n = (BSTNode) o;
            return ((Comparable)value).compareTo((Comparable) n.get());
        }
    }
}
