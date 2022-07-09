package helloworld;
//collection means 3 diff concepts
//1.collection - concept
//2.Collection - interface
//3.Collections - class
//collection api has lot of classes and interfaces
//lets say we need collection of elements by normal we take array lets say array of 4 elements int a[] = new int[4]; but this array is fixed.we want something flexible.so we use collection instead of array.
//to make collection Collection values = new ArrayList(); - arraylist is a class which implements collection indirectly, by implementing list which is interface and list extends collection
//problem above syntax is Collection is interface and we cant make obj of it.so we search for implementation which implements collection.
//values.add(5);
//values.add(10);
//size is not fixed we can add and delete elements to our wish.
//based on requirement choose arr or collection. arr is fast.
//in collection syntax unlike arr syntax we are not specifying data type so by default it is obj.so it means we can add any datatype.
//but if we want only specific data type we need to use generics
//Collection<Integer> values = new ArrayLIst<Integer>(); -syntax
//in 1.2 v of java we got collection api and in 1.5 we got generics
//in 1.7v updated syntax is Collection<Integer> values = new ArrayList<>();
//values.add(19);
//lets say if we want insert num btwn 2 nums we cant use index coz collection dont have index 
//so we use list, List<Integer> values = new ArrayList<>();
//we can also use set(interface) instead of list , Set<Integer> nums = new HashSet<>();
//in set we cant have duplicate values and they are unique.
//In set unlike list which has index and order, the order we get elements is random.
//instead of HashSet we also have TreeSet the only diff is we get elements in sorted manner.
//we have Map(interface)- in map we have key value relations.
//Map<Integer,String>key,value ,m= new HashMap<>(); 
//we have 2 classes which implements map one is hashmap and hashtable.one is synchrnized and other is not.we can go for thread safe implementation or non safe one.
//

public class Collection_generics_49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
