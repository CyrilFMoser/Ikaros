package Program_0; 

class TestClass {sealed interface I_A<A, B>{}
record R_A<D, C>(I_A<C, D> a, I_A<D, D> b) implements I_A<C, D>{}
record R_B<F, E>() implements I_A<E, F>{}
public static void main(String args[]) {

I_A<Boolean, Integer> v_a = null;
Integer v_b = switch (v_a){
  case R_B() -> 0; 
  case R_A(R_B(), var a) -> 1; 
  case R_A(var a, R_A(var b, var c)) -> 2; 
  case R_A(R_A(var a, var b), R_B()) -> 3; 
};
}

};
