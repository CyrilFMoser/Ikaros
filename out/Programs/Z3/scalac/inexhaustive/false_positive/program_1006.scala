package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Char,Char), b: T_A[C, C]) extends T_A[C, T_A[C, C]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A((_,'x'), _) => 0 
}
}
// This is not matched: (CC_B T_B (T_A T_B T_B) Wildcard (T_A (T_A T_B T_B) T_B))