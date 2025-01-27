package Program_0; 

class TestClass {sealed interface I_A<A>{}
record R_A<B>() implements I_A<B>{}
record R_B<C>(I_A<C> a, I_A<C> b, I_A<C> c) implements I_A<C>{}
public static void main(String args[]) {

I_A<Character> v_a = null;
Integer v_b = switch (v_a){
  case R_A() -> 0; 
  case R_B(var a, var b, R_B(var c, var d, var e)) -> 1; 
  case R_B(var a, R_A(), R_A()) -> 2; 
  case R_B(var a, R_B(var b, var c, var d), var e) -> 3; 
};
}

};
