package Program_0; 

class TestClass {sealed interface I_A<A>{}
record R_A<B>(I_A<Boolean> a, I_A<B> b, I_A<B> c) implements I_A<B>{}
record R_B<C>() implements I_A<C>{}
record R_C<D>() implements I_A<D>{}
public static void main(String args[]) {

I_A<Character> v_a = null;
Integer v_b = switch (v_a){
  case R_B() -> 0; 
  case R_C() -> 1; 
  case R_A(var a, R_C(), var b) -> 2; 
  case R_A(R_B(), var a, var b) -> 3; 
  case R_A(R_C(), R_B(), var a) -> 4; 
  case R_A(R_A(var a, var b, var c), var d, var e) -> 5; 
  case R_A(var a, R_A(var b, var c, var d), var e) -> 6; 
};
}

};
