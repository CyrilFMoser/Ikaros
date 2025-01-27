package Program_0; 

class TestClass {sealed interface I_A<A>{}
record R_A<B>(I_A<B> a, I_A<B> b, I_A<B> c) implements I_A<B>{}
record R_B() implements I_A<I_A<Character>>{}
record R_C() implements I_A<I_A<Character>>{}
public static void main(String args[]) {

I_A<I_A<Character>> v_a = null;
Integer v_b = switch (v_a){
  case R_B() -> 0; 
  case R_C() -> 1; 
  case R_A(var a, R_A(var b, var c, var d), var e) -> 2; 
  case R_A(R_A(var a, var b, var c), var d, var e) -> 3; 
  case R_A(R_C(), R_C(), var a) -> 4; 
  case R_A(var a, R_B(), var b) -> 5; 
  case R_A(R_B(), var a, var b) -> 6; 
};
}

};
