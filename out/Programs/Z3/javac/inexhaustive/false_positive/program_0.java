package Program_1; 

class TestClass {sealed interface I_A{}
sealed interface I_B<A>{}
record R_A(I_A a) implements I_A{}
record R_B(I_B<R_A> a, Character b) implements I_A{}
record R_C(R_B a, R_A b) implements I_A{}
record R_D<B>() implements I_B<B>{}
record R_E<C>(I_B<Boolean> a) implements I_B<C>{}
public static void main(String args[]) {

I_B<Character> v_a = null;
Integer v_b = switch (v_a){
  case R_E<Character>(var a) -> 0; 
};
}

};
// This is not matched: (R_D Char (I_B Char))
