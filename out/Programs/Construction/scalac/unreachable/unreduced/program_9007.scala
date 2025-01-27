package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[(T_B,T_A[(Char,Byte)])]
case class CC_B(a: CC_A, b: (T_B,T_B), c: T_B) extends T_B
case class CC_C() extends T_B
case class CC_D(a: CC_B, b: T_A[(CC_C,Char)]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_D(CC_B(_, _, CC_B(_, _, _)), _) => 1 
  case CC_D(CC_B(_, _, CC_C()), _) => 2 
  case CC_D(CC_B(_, _, CC_D(_, _)), _) => 3 
}
}
// This is not matched: CC_C()