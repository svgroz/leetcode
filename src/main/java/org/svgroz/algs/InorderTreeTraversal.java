package org.svgroz.algs;

import org.svgroz.structs.TreeNode;

import java.util.Stack;
import java.util.function.Consumer;

public class InorderTreeTraversal {
    public void travers(TreeNode root, Consumer<TreeNode> visitor) {
        Stack<TreeNode> stack = new Stack<>();

        while(!stack.isEmpty() || root != null) {

            while(root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();

            visitor.accept(root);

            root = root.right;
        }
    }
}
