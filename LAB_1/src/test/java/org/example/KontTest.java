package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KontTest<T> extends Kont {
    KontTest<Integer> cont;

    @BeforeEach
    public void init() {
        cont = new KontTest<>();
    }

    @Test
    public void addToListCheck(){
        cont.addToList(9);
        cont.addToList(20);
        cont.addToList(51);
        assertEquals(51, cont.next.next.data);
        assertEquals(9, cont.data);
    }

    @Test
    public void getDataCheck(){
        cont.addToList(9);
        cont.addToList(20);
        cont.addToList(51);
        assertEquals(51, cont.getData());
    }

    @Test
    public void deleteData(){
        cont.addToList(9);
        cont.addToList(20);
        cont.addToList(51);
        assertTrue(cont.delELem(51));
    }

    @Test
    public void deleteWhenNoData(){
        cont.addToList(9);
        cont.addToList(20);
        cont.addToList(51);
        assertFalse(cont.delELem(1));
    }

}