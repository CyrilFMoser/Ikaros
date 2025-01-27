package Program_0; 

class TestClass {sealed interface I_A<A>{}
sealed interface I_B<B, C>{}
record R_A() implements I_A<I_A<Character>>{}
record R_B() implements I_A<I_A<Character>>{}
record R_C() implements I_A<I_A<Character>>{}
record R_D<D, E>(D a, D b) implements I_B<D, E>{}
public static void main(String args[]) {

I_B<I_A<I_A<Character>>, Character> v_a = null;
Integer v_b = switch (v_a){
  case R_D(R_B(), R_A()) -> 0; 
  case R_D(R_C(), var a) -> 1; 
  case R_D(var a, R_B()) -> 2; 
  case R_D(var a, R_C()) -> 3; 
  case R_D(R_A(), var a) -> 4; 
};
}

};
