package Program_0; 

class TestClass {sealed interface I_A<A>{}
record R_A<B>(I_A<Boolean> a) implements I_A<B>{}
record R_B<C>() implements I_A<C>{}
public static void main(String args[]) {

I_A<Boolean> v_a = null;
Integer v_b = switch (v_a){
  case R_B() -> 0; 
  case R_A(R_B()) -> 1; 
};
}

};
