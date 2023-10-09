public class HelloWorld {
  public static void main(String[] args) {
    // String myText = "Hello Jemal";
    // System.out.println(myText.toUpperCase());
    // System.out.println(myText.toLowerCase());
    // System.out.println(myText.indexOf("Je", 0));
    // System.out.println(myText.charAt(8));
    // String firstName = "John ";
    // String lastName = "Doe";
    // System.out.println(firstName.concat(lastName));
    // System.out.println(Math.max(50, 40));
    // System.out.println(Math.sqrt(64));
    // System.out.println((int) (Math.random() * 101));
    // boolean underAge=true;
    // System.out.println(underAge);
    // int time = 20;
    // String result = time < 18 ? "Good day." : "Good evening.";
    // System.out.println(result);

    // int i=0;
    // do {
    // System.out.println(i);
    // ++i;
    // }
    // while(i<5);

    // for (int i=0;i<5;i++){
    // System.out.println(i);
    // }
    // String [] cars={"bmw","corolla","vitz"};
    // for(String s:cars){
    // System.out.println(s);
    // }
    // int [][] multDem={{1,2,3},{4,5,6}};
    // for(int i=0;i<multDem.length;i++){
    // for(int j=0;j<multDem[i].length;j++){
    // System.out.println(multDem[i][j]);
    // }
    // }
    // int x=addRange(5, 10);
    // System.out.println(x);
   int [] a1={1, 2, 3, 4};
   System.out.println(differenceOddSumEvenSum(a1));
  }

  // static int addRange(int s, int e) {
  //   if (e > s) {
  //     System.out.print(e+",");
    
  //     return e + addRange(s, e - 1);
  //   } else {
  //           System.out.println(e);

  //     return e;
  //   }
  // }
  static int differenceOddSumEvenSum(int [] a){
    int x=0,y=0;
    for(int i=0;i<a.length;i++){
      if(a[i]%2==0){
        y+=a[i];
      }
      else{
        x+=a[i];
      }
    }
    return x-y;
  }
}
