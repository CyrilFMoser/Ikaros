package Program_0; 

class TestClass {sealed interface I_A<A, B>{}
record R_A<C>() implements I_A<Byte, C>{}
record R_B<D>(I_A<Byte, D> a) implements I_A<Byte, D>{}
public static void main(String args[]) {

R_B<Boolean> v_a = null;
Integer v_b = switch (v_a){
  case R_B(R_B(var a)) -> 0; 
};
}

};
