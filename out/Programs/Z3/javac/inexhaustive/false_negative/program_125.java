package Program_0; 

class TestClass {sealed interface I_A<A>{}
record R_A() implements I_A<Byte>{}
record R_B<B>(I_A<B> a, I_A<Byte> b) implements I_A<B>{}
public static void main(String args[]) {

I_A<Byte> v_a = null;
Integer v_b = switch (v_a){
  case R_A() -> 0; 
  case R_B(var a, R_A()) -> 1; 
};
}

};
