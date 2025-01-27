package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, Boolean]) extends T_A[Byte, C]
case class CC_B[D](a: D, b: CC_A[D]) extends T_A[Byte, D]

val v_a: T_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_A(_, _)) => 0 
  case CC_A(CC_A(_, _), CC_B(_, _)) => 1 
  case CC_A(CC_B(_, _), CC_A(_, _)) => 2 
  case CC_B(_, CC_A(_, _)) => 3 
}
}
// This is not matched: CC_A(CC_B(_, _), CC_B(_, _))