package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Int], b: T_B, c: T_A[T_A[T_B]]) extends T_A[T_A[T_B]]
case class CC_B() extends T_A[T_A[T_B]]
case class CC_C(a: CC_A) extends T_B
case class CC_D() extends T_B
case class CC_E(a: T_A[CC_D], b: T_A[T_A[T_B]], c: T_A[CC_A]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_C(CC_A(_, _, CC_B())) => 1 
  case CC_D() => 2 
}
}
// This is not matched: CC_E(_, _, _)