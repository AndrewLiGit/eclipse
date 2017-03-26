
public class Charu_paixu {
	public static void main(String[] args) {
		int[] a = {4,7,1,9,5,2};
		System.out.println("排序之前：");
		for(int i:a){
			System.out.print(i+"\t");
		}
		System.out.println();
		//遍历集合
		for(int i=0;i<a.length;i++){
			//拿一个数把当前遍历的元素记录下来
			int insertVal = a[i];
			int insertPos = i-1;			
			//进行循环比较和位移
			while(insertPos>=0&&insertVal<a[insertPos]){
				a[insertPos+1] = a[insertPos];
				//将指向要比较的数字的位置向前推一位
				insertPos--;
			}
			//完成比较和位移，进行插入操作(插入的位置是当前要比较的数字的位置的后一位)
			a[insertPos+1]=insertVal;
		}
		System.out.println("排序之后：");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
	}	
}
