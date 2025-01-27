package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Boolean, b: T_B[T_B[T_A]]) extends T_A
case class CC_B(a: Boolean) extends T_A
case class CC_C(a: T_B[T_B[(Char,Byte)]], b: Char, c: T_A) extends T_A
case class CC_D(a: CC_A, b: (CC_A,CC_C)) extends T_B[(CC_C,Char)]
case class CC_E(a: CC_B) extends T_B[(CC_C,Char)]
case class CC_F() extends T_B[(CC_C,Char)]

val v_a: T_B[(CC_C,Char)] = null
val v_b: Int = v_a match{
  case CC_D(_, (CC_A(_, _),CC_C(_, _, _))) => 0 
  case CC_E(_) => 1 
  case CC_F() => 2 
}
}