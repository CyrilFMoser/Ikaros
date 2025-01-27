package Program_0; 

class TestClass {sealed interface I_A{}
record R_A(I_A a, I_A b) implements I_A{}
record R_B() implements I_A{}
public static void main(String args[]) {

I_A v_a = null;
Integer v_b = switch (v_a){
  case R_A(R_B(), R_B()) -> 0; 
  case R_A(R_A(var a, var b), var c) -> 1; 
  case R_A(var a, R_A(var b, var c)) -> 2; 
  case R_B() -> 3; 
};
}

};
