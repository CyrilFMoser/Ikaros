package Program_0; 

class TestClass {sealed interface I_A<A>{}
sealed interface I_B<B>{}
record R_A() implements I_A<Boolean>{}
record R_B(I_A<Boolean> a, I_A<Boolean> b) implements I_A<Boolean>{}
record R_C() implements I_A<Boolean>{}
record R_E<C>() implements I_B<C>{}
public static void main(String args[]) {

I_A<Boolean> v_a = null;
Integer v_b = switch (v_a){
  case R_C() -> 0; 
  case R_A() -> 1; 
  case R_B(R_C(), var a) -> 2; 
  case R_B(R_B(var a, var b), var c) -> 3; 
  case R_B(var a, R_B(var b, var c)) -> 4; 
  case R_B(R_A(), R_C()) -> 5; 
  case R_B(var a, R_A()) -> 6; 
};
}

};
