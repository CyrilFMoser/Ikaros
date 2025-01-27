package Program_23 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Char) extends T_A
case class CC_B(a: T_B[CC_A, T_A], b: Char, c: Byte) extends T_A
case class CC_C(a: CC_B, b: T_A) extends T_A
case class CC_D[C](a: C, b: Int, c: CC_B) extends T_B[Boolean, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C(CC_B(_, _, _), _)