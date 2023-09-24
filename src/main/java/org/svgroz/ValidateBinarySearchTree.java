package org.svgroz;

import org.svgroz.algs.InorderTreeTraversal;
import org.svgroz.structs.TreeNode;

import java.util.function.Consumer;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        InorderTreeTraversal inorderTreeTraversal = new InorderTreeTraversal();
        inorderTreeTraversal.travers(root, new Consumer<>() {
            Integer previous = null;
            @Override
            public void accept(TreeNode treeNode) {
                if (previous != null && treeNode.val <=previous) {
                    throw new RuntimeException();
                }

                previous = treeNode.val;
            }
        });

        return true;
    }
}
