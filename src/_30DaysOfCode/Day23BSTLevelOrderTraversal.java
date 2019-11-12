package _30DaysOfCode;

import java.util.*;


class Solution{

    static void levelOrder(Node root){
        //Write your code here
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(queue != null && queue.size() != 0){

            System.out.print(queue.element().data + " ");
            Node newRoot = queue.remove();

            if(newRoot.left != null){
                queue.add(newRoot.left);
            }

            if(newRoot.right != null){
                queue.add(newRoot.right);
            }

        }

    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}
/*Sample
13
25
39
12
19
9
23
55
31
60
35
41
70
90

25 12 39 9 19 31 55 23 35 41 60 70 90
* */