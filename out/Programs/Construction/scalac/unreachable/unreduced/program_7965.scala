package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_B) extends T_A[C, T_A[C, C]]
case class CC_B(a: T_A[T_B, T_A[T_B, T_B]], b: T_A[T_A[T_B, T_B], T_A[Int, T_B]], c: Int) extends T_B
case class CC_C(a: CC_A[CC_A[CC_B]]) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_D()