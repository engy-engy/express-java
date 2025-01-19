package org.example.lesson_4.homework.task_8;

/**
 * Корневой узел дерева и методы для работы с деревом.
 */
public class BinarySearchTree {
//    Дерево:
//          10
//        /    \
//       5     15
//      / \
//     3   7
//          \
//           8

    private TreeNode root;

    // Вставка элементов
    public void insert(int val) {
        root = insertRecursive(root, val);
    }

    private TreeNode insertRecursive(TreeNode node, int val) {
        // Если узел пустой, то создать новый узел дерева с значением val
        if (node == null) { return new TreeNode(val); }

        // Если новое значение меньше, то идем в левое поддерево
        if (val < node.getVal()) {
            node.setLeft(insertRecursive(node.getLeft(), val));
        }
        // Если новое значение меньше, то идем в правое поддерево
        if ( val > node.getVal()) {
            node.setRight(insertRecursive(node.getRight(), val));
        }
        return node;
    }

    // Поиск элемента
    public boolean search(int value) {
        return searchRecursive(root, value);
    }

    private boolean searchRecursive(TreeNode node, int val) {
        // Если узел = null, то узел не найден false
        if (node == null) { return false; }
        // Если текущий узел = val, то узел найден true
        if (node.getVal() == val) { return true; }
        // Если текущий узел < val, то идем искать в левое поддерево
        // Иначе идем искать в правое поддерево
        return val < node.getVal()
                ? searchRecursive(node.getLeft(), val)
                : searchRecursive(node.getRight(), val);
    }

    // Удаление элемента
    public void delete(int val) {
        root = deleteRecursive(root, val);
    }

    private TreeNode deleteRecursive(TreeNode node, int val) {
        // Удалять нечего
        if (node == null) { return null; }
        // Если val < текущего значения узла, то идем искать в левое поддерево
        if (val < node.getVal()) {
            node.setLeft(deleteRecursive(node.getLeft(), val));
        }
        // Если val > текущего значения узла, то идем искать в правое поддерево
        else if ( val > node.getVal()) {
            node.setRight(deleteRecursive(node.getRight(), val));
        }
        // Если узел найден, то это узел который нужно удалить
        else {
            // Случай 1: У узла нет потомков —> Удаляем узел
            if (node.getLeft() == null && node.getRight() == null) {
                return null;
            }
            // Случай 2: У узла один потомок —> Заменяем его этим потомком
            if (node.getLeft() == null) {return node.getRight();}
            if (node.getRight() == null) {return node.getLeft();}

            // Случай 3: У узла два потомка —> Записываем в найденный узел null (потомок двигается выше по дереву)
            // Найти минимальное значение в правом поддереве
            int minVal = findMinVal(node.getRight());
            // Замена значения текущего узла на найденное минимальное
            node.setVal(minVal);
            // Удалить узел с минимальным значением в правом поддереве
            node.setRight(deleteRecursive(node.getRight(), minVal));
        }
        return node;
    }

    private int findMinVal(TreeNode node) {
        // Минимальное значение в поддереве — это значение самого левого узла
        int minVal = node.getVal();
        // Если в левом узле не null, то присваивается новое минимальное значение.
        while(node.getLeft() != null) {
            minVal = node.getLeft().getVal();
            node = node.getLeft();
        }
        return minVal;
    }

    // Обход in-order (лево -> корень -> право)
    public void inorderTraversal() {
        inorderRecursive(root);
    }

    private void inorderRecursive(TreeNode node) {
//        Обход дерева “in-order” предполагает:
//        1.	Сначала обходим левое поддерево узла.
//        2.	Затем обрабатываем (печатаем или выполняем действие с) значение текущего узла.
//        3.	После этого обходим правое поддерево.

        if (node != null) {
            inorderRecursive(node.getLeft());
            System.out.print(node.getVal() + " ");
            inorderRecursive(node.getRight());
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Вставка элементов
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(3);
        bst.insert(7);

        // Обход in-order
        System.out.print("In-order Traversal: ");
        bst.inorderTraversal(); // Должно вывести: 3 5 7 10 15
        System.out.println();

        // Поиск элементов
        System.out.println("Поиск 7: " + bst.search(7)); // true
        System.out.println("Поиск 20: " + bst.search(20)); // false

        // Удаление элемента
        bst.delete(10);
        System.out.print("После удаления 10: ");
        bst.inorderTraversal(); // Должно вывести: 3 5 7 15
    }

}
