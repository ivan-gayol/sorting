/**
 * 
 */
package baldur.sorting.example.algs;

/**
 * 
 *
 */
public abstract class ExecutableSort {
	
	protected  int [] arr;
	
	public void setArr(int[] arr) {
		this.arr = arr;
	}
	
	protected abstract Long sort ();
	
	public abstract String algType();

	public int arrayLength (){
		return this.arr.length;
	}	
	
	public Long execute (){
		return this.sort();
	}

}
