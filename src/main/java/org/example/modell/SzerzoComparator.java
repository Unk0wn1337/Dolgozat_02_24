package org.example.modell;

import java.text.Collator;
import java.util.Comparator;

public  class SzerzoComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Collator c = Collator.getInstance();
        return c.compare(o1,o2);
    }
}
