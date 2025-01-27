package Program_0; 

class TestClass {sealed interface I_A<A>{}
sealed interface I_B<B, C>{}
record R_A(I_A<Character> a, I_A<Character> b, I_A<Character> c) implements I_A<Character>{}
record R_B() implements I_A<Character>{}
record R_C() implements I_A<Character>{}
record R_D<D>() implements I_B<Integer, D>{}
public static void main(String args[]) {

I_A<Character> v_a = null;
Integer v_b = switch (v_a){
  case R_B() -> 0; 
  case R_C() -> 1; 
  case R_A(var a, R_B(), R_A(var b, var c, var d)) -> 2; 
  case R_A(var a, R_A(var b, var c, var d), var e) -> 3; 
  case R_A(var a, R_C(), var b) -> 4; 
  case R_A(var a, var b, R_B()) -> 5; 
  case R_A(var a, var b, R_C()) -> 6; 
};
}

};
