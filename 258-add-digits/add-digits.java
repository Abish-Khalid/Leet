class Solution {
    public int addDigits(int num) {
        int temp=0;
        int m=num;
        int m2=0;
        int num2=0;
        int count=0;
        int count2=0;
        if(num<10){
            return num;
        }
        for(int i=0;i<100;i++){
            num=num/10;
            count2++;
            if(num==0){
                break;
            }
        }
        

        while(m!=0){
            temp=m%10;
            m=m/10;
            num2=num2+temp;
            temp=0;
            count++;
            if(count==count2){
                if(num2<10){
                    return num2;
                }
                else{
                    m=num2;
                    m2=m;
                    count =0;
                    count2=0;
                    for(int j=0;j<100;j++){
                        m2=m2/10;
                        count2++;
                        if(m2==0){
                            break;
                        }
                     }
                     num2=0;
                }
            }
        }
        return num2;
    }
}