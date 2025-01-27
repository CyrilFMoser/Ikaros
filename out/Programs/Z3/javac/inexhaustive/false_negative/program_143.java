package Program_0; 

class TestClass {sealed interface I_A{}
sealed interface I_B<A>{}
record R_B() implements I_A{}
record R_C(I_A a) implements I_A{}
record R_D<B>() implements I_B<B>{}
public static void main(String args[]) {

I_A v_a = null;
Integer v_b = switch (v_a){
  case R_B() -> 0; 
  case R_C(R_C(var a)) -> 1; 
};
}

};
