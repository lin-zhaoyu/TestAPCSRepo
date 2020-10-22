public class Demo{
  public static void main(String[] args){
    if(args.length==0){
      printLoop(5);
    }else{
      int a = Integer.valueOf(args[0]);
      printLoop(a);
    }
    int[]array1 = {1,2,3};
    int[]array2 = {4,5,6,16};
    int[]array3 = {7,8,9,17,20};
    int[]array4 = {10,11,12,18,21};
    int[]array5 = {13,14,15,19,22,23};
    int[][]w = {{},array1,array3,{},array5,array4};
    System.out.println(arrayDeepToString(w).replace("}, ","}, \n "));
    System.out.println();
    System.out.println(arrayDeepToString(create2DArray(6,2,3)).replace("}, ","}, \n "));

}
  public static void printLoop(int n){
    for(int i = 1;i<= n; i ++){
      for(int j = n;j >= i; j--){
        System.out.print(i);
      }
      System.out.println();
    }

  }
  public static String arrToString(int[]arr){
    if (arr.length==0) return "{}";
    String result=Integer.toString(arr[0]);
    for (int i=1; i<arr.length; i++){
      result = result + "," + " "+Integer.toString(arr[i]);
    }
    return "{" + result + "}";
  }

  public static String arrayDeepToString(int[][]arr){
    String result = "";
    for(int i = 0; i < arr.length; i ++){
      result += "{";
      for(int j =0; j < arr[i].length; j ++){
        result += arr[i][j];
        if(j != arr[i].length-1){
          result += ",";
        }
      }
      if(i == arr.length-1){
        result += "}";
      }else{
      result += "}, ";
    }
    }
    return "{" + result + "}";
  }

  public static int[][] create2DArray(int rows, int cols,int maxValue){
    int[][]arr  = new int[rows][cols];
    int value = 0;
    for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                arr[i][j] = (int) (Math.random()* (maxValue+1));
                value++;
                if(value == maxValue+1){
                  j = cols;
                  value = 0;
                }
            }
  }
  return arr;
  }

}
