package Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Easy.Commons.TreeNode;

public class AverageLevelsBinaryTree {

    public static List<Double> averageOfLevels(TreeNode root) {
        Map<Integer, List<Integer>> rootValuesPerLevel = new HashMap<>();
        populateMap(rootValuesPerLevel, root, 1);

        List<Double> averages = new ArrayList<>();
        for (Map.Entry<Integer, List<Integer>> entry : rootValuesPerLevel.entrySet()) {
            double average = entry.getValue().stream().mapToInt(Integer::intValue).average().orElse(0) ;
            averages.add(average);

            System.out.print("Level " + entry.getKey() + " - ");
            for (Integer val : entry.getValue()) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        return averages;
    }

    private static void populateMap(Map<Integer, List<Integer>> rootValuesPerLevel, TreeNode root, int level) {
        if (root == null) {
            return;
        }

        rootValuesPerLevel.computeIfAbsent(level, k -> new ArrayList<>());
        rootValuesPerLevel.get(level).add(root.val);

        if (root.left != null) {
            populateMap(rootValuesPerLevel, root.left, level+1);
        }
        if (root.right != null) {
            populateMap(rootValuesPerLevel, root.right, level+1);
        }
    }
}
