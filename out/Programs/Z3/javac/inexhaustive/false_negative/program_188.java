package Program_0; 

class TestClass {sealed interface I_A<A, B>{}
record R_A<C, D>(I_A<C, C> a) implements I_A<D, C>{}
record R_B<F, E>() implements I_A<F, E>{}
public static void main(String args[]) {

R_A<Boolean, Character> v_a = null;
Integer v_b = switch (v_a){
  case R_A(R_B()) -> 0; 
};
}

};
