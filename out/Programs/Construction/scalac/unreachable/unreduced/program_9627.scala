package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte, b: Int, c: Int) extends T_A
case class CC_B(a: T_A, b: T_B[CC_A, CC_A], c: Char) extends T_A
case class CC_C[C](a: T_B[C, C], b: C) extends T_B[C, Byte]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), _, _) => 1 
  case CC_B(CC_B(CC_A(_, _, _), _, _), _, _) => 2 
}
}
// This is not matched: CC_B(CC_B(CC_B(_, _, _), _, _), _, _)