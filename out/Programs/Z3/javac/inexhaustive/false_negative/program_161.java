package Program_0; 

class TestClass {sealed interface I_A<A, B>{}
sealed interface I_B{}
record R_A<C>(I_A<C, C> a) implements I_A<I_B, C>{}
record R_B<D>() implements I_A<I_B, D>{}
record R_D() implements I_B{}
public static void main(String args[]) {

R_A<I_B> v_a = null;
Integer v_b = switch (v_a){
  case R_A(R_A(var a)) -> 0; 
};
}

};
