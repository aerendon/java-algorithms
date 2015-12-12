/*
Inputs:
	base: Base de la operación Potenciación
	exp: Exponente de la operación
Outputs:
	pow: base^exp
 */
public static int pow_fast(int base, int exp){
        int pow;
        
        if(exp == 0) return 1;
        pow = pow_fast(base, exp/2);
        pow = pow*pow;
        if(exp%2==1) pow*=base;
        return pow;
    }
}