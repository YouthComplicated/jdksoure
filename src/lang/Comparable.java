package lang;

import java.util.*;

/**
 * 1、This interface imposes a total ordering on the objects of each class that
 * implements it
 * 支持对类进行排序
 * 2、Lists (and arrays) of objects that implement this interface can be sorted
 * automatically by {@link Collections#sort(List) Collections.sort} (and
 * {@link Arrays#sort(java.lang.Object[]) Arrays.sort}).  Objects that implement this
 * interface can be used as keys in a {@linkplain SortedMap sorted map} or as
 * elements in a {@linkplain SortedSet sorted set}, without the need to
 * specify a {@linkplain Comparator comparator}.<p>
 * 实现这个接口的对象集合或数组可以通过Collections.sort和Arrays.sort排序
 * 实现该接口的对象可以用作键sorted map或作为sorted set元素,而不需要指定一个comparator。 ???
 *
 * Created by Tom on 2018/9/2.
 */
public interface Comparable<T> {
    /**
     *  Returns a negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     *
     * does not permit null arguements
     * @param o
     * @return
     */
     int compareTo(T o);
}
