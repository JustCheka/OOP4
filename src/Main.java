import LinkedList.MyLinkedList;
import LinkedList.MyList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> strLink = new MyLinkedList<>();
        strLink.addLast("213");
        strLink.addLast("kek");
        strLink.addFirst("Sasha");
        System.out.println(strLink.size());
        System.out.println(strLink.get(1));
        System.out.println(strLink.get(0));
    }
}