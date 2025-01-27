package Program_0; 

class TestClass {sealed interface I_A<A>{}
sealed interface I_B{}
record R_A<B>() implements I_A<B>{}
record R_B<C>(I_A<C> a, I_A<C> b) implements I_A<C>{}
record R_C<D>() implements I_A<D>{}
record R_D() implements I_B{}
public static void main(String args[]) {

I_A<Boolean> v_a = null;
Integer v_b = switch (v_a){
  case R_A() -> 0; 
  case R_C() -> 1; 
  case R_B(var a, R_B(var b, var c)) -> 2; 
  case R_B(var a, R_C()) -> 3; 
  case R_B(R_C(), var a) -> 4; 
  case R_B(R_A(), var a) -> 5; 
  case R_B(R_B(var a, var b), R_A()) -> 6; 
};
}

};
