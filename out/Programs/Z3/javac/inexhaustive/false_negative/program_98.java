package Program_0; 

class TestClass {sealed interface I_A{}
sealed interface I_B<A>{}
record R_A() implements I_A{}
record R_C<B>() implements I_B<B>{}
record R_D<C>(I_B<C> a, I_B<C> b) implements I_B<C>{}
public static void main(String args[]) {

R_D<R_A> v_a = null;
Integer v_b = switch (v_a){
  case R_D(var a, R_C()) -> 0; 
  case R_D(R_D(var a, var b), var c) -> 1; 
  case R_D(R_C(), R_D(var a, var b)) -> 2; 
};
}

};
