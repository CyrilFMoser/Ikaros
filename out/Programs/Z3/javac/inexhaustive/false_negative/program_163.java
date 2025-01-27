package Program_0; 

class TestClass {sealed interface I_A<A>{}
record R_A(I_A<Boolean> a, I_A<Character> b) implements I_A<Boolean>{}
record R_B<B>() implements I_A<B>{}
record R_C<C>() implements I_A<C>{}
public static void main(String args[]) {

R_A v_a = null;
Integer v_b = switch (v_a){
  case R_A(R_C(), R_C()) -> 0; 
  case R_A(var a, R_B()) -> 1; 
  case R_A(R_B(), var a) -> 2; 
  case R_A(R_A(var a, var b), var c) -> 3; 
};
}

};
