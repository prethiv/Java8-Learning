package CompetitiveProgramming.PrethivRoughWork;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BstConstruct {

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        else{
            inorder(root.left);
            System.out.println(root.key+" ");
            inorder(root.right);
        }
    }

    public static Node insertIntoTree(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            if(data<= root.key){
                root.left=insertIntoTree(root.left,data);
            }
            else{
                root.right=insertIntoTree(root.right,data);
            }
            return root;
        }
    }

    public static void lvlorder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        System.out.println();
        while(!q.isEmpty()){

            Node temp = q.poll();
            System.out.println(temp.key+" ");
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }


        }
        System.out.println();
    }

    public static int heightOfTheTree(Node root){
        if(root==null){
            return 0;
        }
        else{
            int left = heightOfTheTree(root.left);
            int right = heightOfTheTree(root.right);
            if(left>right){
                return left+1;
            }
            else{
                return right+1;
            }
        }
    }

    public static void main(String[] args) {

        Node root =new Node(1);
//        root.root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        inorder(root);

        Node root1= null;
        Scanner scanner = new Scanner(System.in);
        int noOfnodes = scanner.nextInt();
        for(int i=0;i<noOfnodes;i++){
            int temp =scanner.nextInt();
            root1=insertIntoTree(root1,temp);
        }
        inorder(root1);
        lvlorder(root1);
        System.out.println("The height of the given tree is "+heightOfTheTree(root1));


    }


}
