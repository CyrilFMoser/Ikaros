package Program_0; 

class TestClass {sealed interface I_A{}
record R_A() implements I_A{}
record R_B(I_A a, I_A b) implements I_A{}
public static void main(String args[]) {

I_A v_a = null;
Integer v_b = switch (v_a){
  case R_B(var a, R_B(var b, var c)) -> 0; 
  case R_B(R_A(), R_A()) -> 1; 
  case R_B(R_B(var a, var b), var c) -> 2; 
  case R_A() -> 3; 
};
}

};
