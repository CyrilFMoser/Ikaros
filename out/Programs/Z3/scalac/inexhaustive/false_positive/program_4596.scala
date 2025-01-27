package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[C, T_A[C, C]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
}
}
// This is not matched: (CC_C (CC_B Wildcard Wildcard (T_A T_B))
//      Wildcard
//      (T_A (T_A (CC_A (T_A (T_A T_B)) (T_A T_B)))))