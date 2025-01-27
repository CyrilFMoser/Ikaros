package Program_0; 

class TestClass {sealed interface I_A<A, B>{}
record R_A<C>(I_A<C, Character> a, I_A<C, Character> b) implements I_A<C, Character>{}
record R_C<D, E>() implements I_A<E, D>{}
public static void main(String args[]) {

R_A<Character> v_a = null;
Integer v_b = switch (v_a){
  case R_A(R_A(var a, var b), R_A(var c, var d)) -> 0; 
  case R_A(R_C(), var a) -> 1; 
  case R_A(var a, R_C()) -> 2; 
};
}

};
