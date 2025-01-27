package Program_0; 

class TestClass {sealed interface I_A{}
sealed interface I_B<A, B>{}
record R_A() implements I_A{}
record R_B() implements I_A{}
record R_C<D, C>(D a, I_A b) implements I_B<C, D>{}
public static void main(String args[]) {

R_C<I_A, Boolean> v_a = null;
Integer v_b = switch (v_a){
  case R_C(var a, R_A()) -> 0; 
  case R_C(R_B(), var a) -> 1; 
  case R_C(R_A(), R_B()) -> 2; 
};
}

};
