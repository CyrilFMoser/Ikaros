package Program_0; 

class TestClass {sealed interface I_A{}
sealed interface I_B<A>{}
record R_A(I_A a, I_A b) implements I_A{}
record R_B() implements I_A{}
record R_C() implements I_A{}
record R_E<C>() implements I_B<C>{}
public static void main(String args[]) {

I_A v_a = null;
Integer v_b = switch (v_a){
  case R_B() -> 0; 
  case R_A(R_C(), var a) -> 1; 
  case R_A(R_B(), R_A(var a, var b)) -> 2; 
  case R_A(var a, R_B()) -> 3; 
  case R_A(var a, R_C()) -> 4; 
  case R_A(R_A(var a, var b), var c) -> 5; 
  case R_C() -> 6; 
};
}

};
