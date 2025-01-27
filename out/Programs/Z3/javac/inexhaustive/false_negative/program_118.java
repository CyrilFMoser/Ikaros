package Program_0; 

class TestClass {sealed interface I_A{}
record R_A(I_A a) implements I_A{}
record R_B() implements I_A{}
public static void main(String args[]) {

I_A v_a = null;
Integer v_b = switch (v_a){
  case R_A(R_A(var a)) -> 0; 
  case R_B() -> 1; 
};
}

};
