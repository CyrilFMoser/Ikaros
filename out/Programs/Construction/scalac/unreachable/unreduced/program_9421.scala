package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: Int, c: Boolean) extends T_A[T_A[T_B]]
case class CC_B(a: T_B, b: Int, c: T_A[T_B]) extends T_B
case class CC_C(a: T_B, b: Byte) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _, _), _, _), _, _) => 0 
  case CC_B(CC_B(CC_C(_, _), _, _), _, _) => 1 
  case CC_B(CC_C(CC_C(_, _), _), _, _) => 2 
  case CC_C(_, _) => 3 
}
}
// This is not matched: CC_B(CC_C(CC_B(_, _, _), _), _, _)