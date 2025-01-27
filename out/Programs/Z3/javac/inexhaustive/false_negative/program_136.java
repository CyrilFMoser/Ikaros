package Program_0; 

class TestClass {sealed interface I_A<A>{}
record R_A<B>(I_A<B> a, I_A<B> b, I_A<B> c) implements I_A<B>{}
record R_B<C>() implements I_A<C>{}
public static void main(String args[]) {

R_A<Character> v_a = null;
Integer v_b = switch (v_a){
  case R_A(var a, R_B(), var b) -> 0; 
  case R_A(R_B(), R_A(var a, var b, var c), var d) -> 1; 
  case R_A(R_A(var a, var b, var c), var d, var e) -> 2; 
};
}

};
