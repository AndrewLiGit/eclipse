
public class Charu_paixu {
	public static void main(String[] args) {
		int[] a = {4,7,1,9,5,2};
		System.out.println("����֮ǰ��");
		for(int i:a){
			System.out.print(i+"\t");
		}
		System.out.println();
		//��������
		for(int i=0;i<a.length;i++){
			//��һ�����ѵ�ǰ������Ԫ�ؼ�¼����
			int insertVal = a[i];
			int insertPos = i-1;			
			//����ѭ���ȽϺ�λ��
			while(insertPos>=0&&insertVal<a[insertPos]){
				a[insertPos+1] = a[insertPos];
				//��ָ��Ҫ�Ƚϵ����ֵ�λ����ǰ��һλ
				insertPos--;
			}
			//��ɱȽϺ�λ�ƣ����в������(�����λ���ǵ�ǰҪ�Ƚϵ����ֵ�λ�õĺ�һλ)
			a[insertPos+1]=insertVal;
		}
		System.out.println("����֮��");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
	}	
}
