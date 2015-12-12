/*
Inputs:
    a, b: Factores
Outputs:
    ans: Producto de a*b
 */
public static int mul_fast(int a, int b){
        int ans = 0;
        String x;
        while(b>0){
            x = Integer.toBinaryString(b);
            if(x.charAt(x.length()-1) == '1') ans+=a;  
            a <<= 1;
            b >>= 1;
        }
        return ans;
    }
}