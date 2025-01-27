package Program_0; 

class TestClass {sealed interface I_A<A, B>{}
record R_A<C>(I_A<C, C> a, I_A<C, Integer> b, I_A<C, C> c) implements I_A<C, Integer>{}
record R_B<D>() implements I_A<D, Integer>{}
record R_C<F, E>() implements I_A<F, E>{}
public static void main(String args[]) {

R_A<Integer> v_a = null;
Integer v_b = switch (v_a){
  case R_A(R_C(), var a, var b) -> 0; 
  case R_A(R_B(), var a, R_C()) -> 1; 
  case R_A(R_A(var a, var b, var c), var d, var e) -> 2; 
  case R_A(var a, var b, R_A(var c, var d, var e)) -> 3; 
  case R_A(var a, var b, R_B()) -> 4; 
};
}

};
