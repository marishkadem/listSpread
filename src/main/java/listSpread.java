public class listSpread {
    //Метод разворота списка
    public void reverse() {
        if (!isEmpty() && head.next != null) { // Если не пусто и голова не равна нулю
            tail = head;
            ListItem<T> current = head.next;
            head.next = null;
            while (current != null) {
                ListItem<T> next = current.next;
                current.next = head;
                head = current;
                current = next;
            }
        }
    }
}
