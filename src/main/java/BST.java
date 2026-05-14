// Rohan Nicollo M. Teope
// Sean Gabriel DR. Bolalin
// Course: ICS 2605
// Section: 1CSD
// Lab Exercise 4

public class BST<T extends Comparable<? super T>> extends BT<T>
{

    public void insert(T k)
    {

        if (root == null)
        {

            BTNode<T> newNode = new BTNode<>(k);
            newNode.level = 0;
            setRoot(newNode);

            return;

        }

        BTNode<T> current = root;

        while (true)
        {

            int comparison = k.compareTo(current.info);

            if (comparison < 0)
            {

                if (current.left == null)
                {

                    int newLevel = current.level + 1;
                    BTNode<T> newNode = new BTNode<>(k);
                    newNode.level = newLevel;
                    current.left = newNode;

                    if (newLevel > height)
                    {

                        height = newLevel;

                    }

                    return;

                }

                current = current.left;

            }
            else if (comparison > 0)
            {

                if (current.right == null)
                {

                    int newLevel = current.level + 1;
                    BTNode<T> newNode = new BTNode<>(k);
                    newNode.level = newLevel;
                    current.right = newNode;

                    if (newLevel > height)
                    {

                        height = newLevel;

                    }

                    return;

                }

                current = current.right;

            }
            else
            {

                return;

            }

        }

    }

    public BTNode<T> search(T k)
    {

        BTNode<T> current = root;

        while (current != null)
        {

            int comparison = k.compareTo(current.info);

            if (comparison == 0)
            {

                return current;

            }

            if (comparison < 0)
            {

                current = current.left;

            }
            else
            {

                current = current.right;

            }

        }

        return null;

    }

}
