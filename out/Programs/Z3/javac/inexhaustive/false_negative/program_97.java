package Program_0; 

class TestClass {sealed interface I_A{}
sealed interface I_B<A>{}
record R_A() implements I_A{}
record R_B<B>() implements I_B<B>{}
record R_C<C>(I_B<C> a) implements I_B<C>{}
public static void main(String args[]) {

I_B<R_A> v_a = null;
Integer v_b = switch (v_a){
  case R_B() -> 0; 
  case R_C(R_C(var a)) -> 1; 
};
}

};
