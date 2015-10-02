package testGeneric;

public class TestGeneric {
	public static void main(String[] args) {
		GenericEx1<String> t = new GenericEx1<String>();
		String[] ss = {"가","나","다","라"};
		t.set(ss);
		t.print();
		GenericEx1<Integer> t2= new GenericEx1<Integer>();
		Integer[] a = {1,2,3,4,5};
		t2.set(a);
		t2.print();
 	}
}

class GenericEx1<T>{
	T[] v;
	
	public void set(T[] n){
		v = n;
	}
	
	public void print(){
		for (T t : v) {
			System.out.println(t);
		}
	}
}

