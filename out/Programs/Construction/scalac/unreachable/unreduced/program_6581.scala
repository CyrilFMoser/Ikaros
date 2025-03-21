package Program_22 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean], b: T_A[Boolean], c: Byte) extends T_A[Boolean]
case class CC_B(a: T_A[(CC_A,Byte)], b: Char, c: Byte) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, _) => 0 
  case CC_A(CC_B(_, _, _), _, _) => 1 
  case CC_B(_, _, _) => 2 
}
}
// This is not matched: CC_A(CC_A(CC_B(_, _, _), _, _), _, _)