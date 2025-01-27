package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int) extends T_A[Int, C]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_A (CC_B T_B (T_A (T_A T_B)) Wildcard Wildcard Wildcard (T_A T_B))
//      (CC_B T_B T_B Wildcard Wildcard Wildcard (T_A T_B))
//      Wildcard
//      (T_A T_B))