package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, Int]
case class CC_B[D](a: T_A[D, Int]) extends T_A[D, Int]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
}
}
// This is not matched: (CC_B Wildcard (T_A T_B))