package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: C) extends T_A[C, T_B]
case class CC_B(a: Int, b: T_B, c: CC_A[Int]) extends T_B
case class CC_C(a: T_A[Byte, T_B], b: T_A[T_B, CC_B], c: Byte) extends T_B
case class CC_D[D](a: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_D(CC_C(CC_A(_, _), _, _))