public class Sample {
                   static int i = 5;
                   static {//��һ����̬�����
                          System.out.println("First Static code i="+i++);
                   }
                   static {//�ڶ�����̬�����
                          System.out.println("Second Static code i="+i++);
                   }
                   public static void main(String[] args) {
                          Sample s1 = new Sample();
                          System.out.println("====");
                          Sample s2 = new Sample();
                          System.out.println("At last, i= "+i);
                   }
               }