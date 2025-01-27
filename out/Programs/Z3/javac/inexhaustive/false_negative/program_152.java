package Program_0; 

class TestClass {sealed interface I_A<A>{}
record R_A<B>(I_A<B> a) implements I_A<B>{}
record R_B<C>(I_A<C> a, I_A<Character> b, Boolean c) implements I_A<C>{}
public static void main(String args[]) {

I_A<Character> v_a = null;
Integer v_b = switch (v_a){
  case R_A(var a) -> 0; 
  case R_B(var a, R_A(var b), var c) -> 1; 
  case R_B(R_A(var a), R_B(var b, var c, var d), var e) -> 2; 
  case R_B(R_B(var a, var b, var c), var d, var e) -> 3; 
};
}

};
