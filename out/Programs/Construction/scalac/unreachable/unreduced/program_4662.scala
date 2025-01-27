package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: T_B[CC_A, CC_A], b: CC_A, c: (T_A,T_B[CC_A, T_A])) extends T_A
case class CC_C(a: Byte) extends T_B[Byte, CC_A]
case class CC_D(a: CC_B, b: CC_B, c: Boolean) extends T_B[Byte, CC_A]
case class CC_E() extends T_B[Byte, CC_A]

val v_a: T_B[Byte, CC_A] = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
  case CC_C(_) => 1 
  case CC_D(CC_B(_, _, _), _, true) => 2 
  case CC_D(CC_B(_, _, _), _, false) => 3 
}
}
// This is not matched: CC_E()