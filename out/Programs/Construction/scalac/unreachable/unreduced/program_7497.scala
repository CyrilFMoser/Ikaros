package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Boolean, b: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B(a: CC_A[CC_A[Int]]) extends T_B
case class CC_C(a: CC_B) extends T_B
case class CC_D(a: CC_C, b: CC_A[CC_A[T_B]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_B(CC_A(_, _))) => 0 
  case CC_D(_, _) => 1 
}
}
// This is not matched: CC_B(CC_A(_, _))