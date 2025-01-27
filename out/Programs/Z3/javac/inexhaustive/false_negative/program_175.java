package Program_0; 

class TestClass {sealed interface I_A{}
record R_A() implements I_A{}
record R_B(I_A a, I_A b) implements I_A{}
record R_C() implements I_A{}
public static void main(String args[]) {

I_A v_a = null;
Integer v_b = switch (v_a){
  case R_B(var a, R_A()) -> 0; 
  case R_B(R_C(), var a) -> 1; 
  case R_B(R_B(var a, var b), R_C()) -> 2; 
  case R_B(R_A(), var a) -> 3; 
  case R_B(var a, R_B(var b, var c)) -> 4; 
  case R_C() -> 5; 
  case R_A() -> 6; 
};
}

};
