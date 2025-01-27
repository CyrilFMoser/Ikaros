package Program_0; 

class TestClass {sealed interface I_A<A>{}
record R_A<B>() implements I_A<B>{}
record R_B<C>(I_A<Integer> a, I_A<C> b, I_A<C> c) implements I_A<C>{}
record R_C<D>() implements I_A<D>{}
public static void main(String args[]) {

R_B<Integer> v_a = null;
Integer v_b = switch (v_a){
  case R_B(R_B(var a, var b, var c), var d, var e) -> 0; 
  case R_B(R_A(), R_C(), var a) -> 1; 
  case R_B(var a, R_B(var b, var c, var d), var e) -> 2; 
  case R_B(var a, R_A(), var b) -> 3; 
  case R_B(R_C(), var a, var b) -> 4; 
};
}

};
