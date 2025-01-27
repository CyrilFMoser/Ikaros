package Program_0; 

class TestClass {sealed interface I_A{}
record R_A() implements I_A{}
record R_B() implements I_A{}
record R_C(I_A a, I_A b) implements I_A{}
public static void main(String args[]) {

R_C v_a = null;
Integer v_b = switch (v_a){
  case R_C(var a, R_A()) -> 0; 
  case R_C(R_C(var a, var b), var c) -> 1; 
  case R_C(var a, R_C(var b, var c)) -> 2; 
  case R_C(R_B(), R_B()) -> 3; 
  case R_C(R_A(), var a) -> 4; 
};
}

};
