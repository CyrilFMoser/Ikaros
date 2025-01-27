package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: T_B, c: T_B) extends T_A[T_A[T_B]]
case class CC_B(a: Int) extends T_A[T_A[T_B]]
case class CC_C(a: T_A[T_A[T_B]]) extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(_), CC_C(_)) => 0 
  case CC_B(12) => 1 
  case CC_B(_) => 2 
}
}