import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;


public class ArrayListTest {

	public static void main(String[] args) {
		 List<String> cityList = new ArrayList<>();
		  cityList.add("Delhi");
		  cityList.add("Mumbai");
		  cityList.add("Bangalore");
		  cityList.add("Chennai");
		  cityList.add("Kolkata");
		  cityList.add("Mumbai");

		  //cityList = cityList.stream().distinct().collect(Collectors.toList());
		  cityList = cityList.stream().distinct().collect(Collectors.toList());
		  System.out.println("After Removed List== "+cityList);
		  
		ArrayList<String> lst = new ArrayList<String>();
	    lst.add("ABC");
	    lst.add("ABC");
	    lst.add("ABCD");
	    lst.add("ABCD");
	    lst.add("ABCE");
	    ArrayList<String> lst1 = new ArrayList<String>(new HashSet(lst));
	    System.out.println("Duplicates List== "+lst);
	    System.out.println("Duplicates List== "+lst);
	   // System.out.println("Duplicates Removed List "+lst.stream().distinct().collect(Collectors.toList()));

	    /*Object[] st = lst.toArray();
	      for (Object s : st) {
	        if (lst.indexOf(s) != lst.lastIndexOf(s)) {
	            lst.remove(lst.lastIndexOf(s));
	         }
	      }*/
	    for(int i=0;i<lst.size();i++){
	        for(int j=i+1;j<lst.size();j++){
	            if(lst.get(i).equals(lst.get(j))){
	            	lst.remove(j);
	                j--;
	            }
	        }
	    }

	    System.out.println("Distinct List "+lst);
	    
	    ArrayList<Integer> alInt = new ArrayList<Integer>();
	    alInt.add(3);
	    alInt.add(1);
	    alInt.add(2);
	    alInt.add(6);
	    alInt.add(8);
	    alInt.add(3);
	    alInt.add(1);
	    alInt.add(2);
	    System.out.println("Duplicat Integers:=="+alInt);
	  //  System.out.println("Duplicat Removed Integers:=="+alInt.stream().distinct().collect(Collectors.toList()));
	    Object[] intArry=alInt.toArray();
	    //System.out.println("Duplicat Removed Integers:=="+intArry);
	   /* for(Object o:intArry){
	    	if(alInt.indexOf(o)!=alInt.lastIndexOf(o)){
	    		alInt.remove(0);
	    	}
	    }*/
	    for(int i=0;i<alInt.size();i++){
	        for(int j=i+1;j<alInt.size();j++){
	            if(alInt.get(i).equals(alInt.get(j))){
	            	alInt.remove(j);
	                j--;
	            }
	        }
	    }
	    System.out.println("Duplicat Removed Integers:=="+alInt);
	    
	    ArrayList<Object> al = new ArrayList<Object>();
	    al.add("abc");
	    al.add('a');
	    al.add('b');
	    al.add('a');
	    al.add("abc");
	    al.add(10.3);
	    al.add('c');
	    al.add(10);
	    al.add("abc");
	    al.add(10);
	    System.out.println("Before Duplicate Remove:"+al);
	    for(int i=0;i<al.size();i++){
	        for(int j=i+1;j<al.size();j++){
	            if(al.get(i).equals(al.get(j))){
	                al.remove(j);
	                j--;
	            }
	        }
	    }
	   /* Object[] objarr=al.toArray();
	    for(Object o:objarr){
	    	if(al.indexOf(o)!=al.lastIndexOf(o)){
	    		al.remove(0);
	    	}
	    }*/
	    System.out.println("After Removing duplicate:"+al);
	    
	}

}
