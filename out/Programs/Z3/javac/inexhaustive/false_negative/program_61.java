package Program_0; 

class TestClass {sealed interface I_A{}
sealed interface I_B<A>{}
record R_A() implements I_A{}
record R_B(I_B<Character> a, I_B<Character> b) implements I_B<Character>{}
record R_C() implements I_B<Character>{}
public static void main(String args[]) {

I_B<Character> v_a = null;
Integer v_b = switch (v_a){
  case R_C() -> 0; 
  case R_B(R_C(), var a) -> 1; 
  case R_B(R_B(var a, R_C()), var b) -> 2; 
};
}

};
