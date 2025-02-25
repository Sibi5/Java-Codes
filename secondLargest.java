class Main {
    public static void main(String[] args) {
        int[]arr={1,2,100,99,20,10,100000};
        int res=largest2(arr);
        System.out.println(res);
    }
    
    public static int largest2(int[]arr){
        int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE;
        for(int num : arr){
            if(num>first){
                second=first;
                first=num;
            }
            else if(num>second && num!=first){
                second=num;
            }
        }
        return second;
    }
}
