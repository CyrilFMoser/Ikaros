package Program_31 

object Test {
sealed trait T_A[B]
case class CC_A[D](a: D, b: T_A[D]) extends T_A[T_A[D]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
}
}
// This is not matched: (CC_B Wildcard (T_A (CC_A Boolean Boolean Boolean)))