package Program_0; 

class TestClass {sealed interface I_A{}
record R_A(I_A a, I_A b, I_A c) implements I_A{}
record R_B() implements I_A{}
public static void main(String args[]) {

I_A v_a = null;
Integer v_b = switch (v_a){
  case R_B() -> 0; 
  case R_A(R_A(var a, var b, var c), var d, var e) -> 1; 
  case R_A(R_B(), R_A(var a, var b, var c), var d) -> 2; 
  case R_A(var a, R_B(), var b) -> 3; 
};
}

};
