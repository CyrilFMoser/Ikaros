package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int) extends T_A[T_A[Int]]
case class CC_B(a: CC_A, b: T_A[CC_A]) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(12), _) => 1 
}
}
// This is not matched: (CC_A (CC_A Wildcard T_A) T_A)