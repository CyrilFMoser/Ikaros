package Program_0; 

class TestClass {sealed interface I_A{}
record R_A() implements I_A{}
record R_B(I_A a) implements I_A{}
public static void main(String args[]) {

R_B v_a = null;
Integer v_b = switch (v_a){
  case R_B(R_A()) -> 0; 
};
}

};
