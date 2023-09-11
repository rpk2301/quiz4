package rocks.zipcode.io.quiz4.generics;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @author leon on 18/12/2018.
 */
public class Group<_> extends List  {
    ArrayList<_> newList;

    public Group() {
        this.newList = new ArrayList<_>();
    }

    public Integer count() {
        return newList.size();
    }

    public void insert(_ value) {
    newList.add(value);
    }

    public Boolean has(_ value) {
        return newList.contains(value);
    }

    public _ fetch(int indexOfValue) {
       return newList.get(indexOfValue);
    }

    public void delete(_ value) {
    newList.remove(value);
    }

    public void clear() {
        newList.removeAll(newList);
    }


    public Iterator<_> iterator() {
        return newList.iterator();
    }

    @Override
    public String toString()
    {
    StringBuilder sb = new StringBuilder();
    sb.append("[");
    newList.forEach(word -> sb.append(word + ", "));
    sb.append("]");
    sb.replace(sb.length()-3,sb.length(),"");
    sb.append("]");
    return sb.toString();
    }
}
