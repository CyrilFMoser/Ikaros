package Program_0; 

class TestClass {sealed interface I_A<A, B>{}
sealed interface I_B{}
record R_A<C, D>() implements I_A<C, D>{}
record R_B<E, F>() implements I_A<E, F>{}
record R_C(I_A<I_B, I_B> a, I_B b) implements I_B{}
record R_D() implements I_B{}
public static void main(String args[]) {

R_C v_a = null;
Integer v_b = switch (v_a){
  case R_C(R_B(), R_D()) -> 0; 
  case R_C(var a, R_C(var b, var c)) -> 1; 
  case R_C(R_A(), var a) -> 2; 
};
}

};
