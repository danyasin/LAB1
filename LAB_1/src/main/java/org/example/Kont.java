package org.example;

/**
 * Класс Container служит для хранения данных
 * @param <type> - тип данных
 * @author Синицин Данила
 */
public class Kont<type> {
    protected type data = null;
    protected Kont<type> next = null, point;

    /**
     * addToList - вставка элемента в список
     * @param data данные типа type
     */
    public void addToList(type data) {
        if (data == null) return;
        if (this.data == null)
            this.data = data;
        else {
            point = this;
            while (point.next != null)
                point = point.next;
            point.next = new Kont<>();
            point.next.data = data;
        }
    }

    /**
     * getToHead - извлечение первого элемента из списка
     * @return первый элемент
     */
    protected type getFromHead() {
        type data = this.data;
        if (this.next != null) {
            this.data = this.next.data;
            this.next = this.next.next;
        }
        else this.data = null;
        return data;
    }

    /**
     * delElem - удаление элемента из списка
     * @return true, если элемент удалился, иначе false
     */
    public boolean delELem(type data) {
        if (data == null) return false;
        boolean f = false;
        if (this.data == data) {
            f = true;
            getFromHead();
        }
        else {
            point = this;
            Kont<type> prev = point;
            while (!f && point.next != null) {
                f = point.next.data == data;
                prev = point;
                point = point.next;
            }
            if (f) {
                prev.next = point.next;
                point = new Kont<>();
                point = null;
            }
        }
        return f;
    }

    /**
     * getData - последний элемент из списка
     * @return последний элемент
     */
    public type getData() {
        if (this.next == null)
            return getFromHead();
        else {
            point = this;
            while (point.next.next != null)
                point = point.next;
            type data = point.next.data;
            point.next = new Kont<>();
            point.next = null;
            return data;
        }
    }

    /**
     * output - вывод элементов списка
     */
    public void Output() {
        point = this;
        for (int i = 0; point != null; i++) {
            if (point.data != null)
                System.out.println(point.data);
            point = point.next;
        }
    }
}

