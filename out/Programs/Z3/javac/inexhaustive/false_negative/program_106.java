package Program_0; 

class TestClass {sealed interface I_A<A, B>{}
record R_A<D, C>(I_A<C, C> a, I_A<D, C> b, I_A<D, D> c) implements I_A<D, C>{}
record R_C<F>() implements I_A<Byte, F>{}
public static void main(String args[]) {

I_A<Byte, Byte> v_a = null;
Integer v_b = switch (v_a){
  case R_C() -> 0; 
  case R_A(R_C(), var a, var b) -> 1; 
  case R_A(R_A(var a, var b, var c), R_C(), var d) -> 2; 
  case R_A(var a, R_A(var b, var c, var d), var e) -> 3; 
};
}

};
