package Program_0; 

class TestClass {sealed interface I_A{}
sealed interface I_B{}
record R_A(I_A a) implements I_A{}
record R_C() implements I_A{}
record R_D() implements I_B{}
public static void main(String args[]) {

I_A v_a = null;
Integer v_b = switch (v_a){
  case R_C() -> 0; 
  case R_A(R_C()) -> 1; 
};
}

};
