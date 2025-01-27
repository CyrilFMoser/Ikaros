package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[Int]]) extends T_A[T_B]
case class CC_B(a: T_B, b: Byte, c: T_A[T_B]) extends T_A[T_B]

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A(_)) => 0 
  case CC_B(_, _, CC_B(_, _, _)) => 1 
}
}
// This is not matched: CC_A(_)