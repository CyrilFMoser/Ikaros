package Program_15 

package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C](a: T_B[C, C]) extends T_B[C, CC_A]
case class CC_C[D, E, F](a: Int, b: T_B[D, D], c: CC_A) extends T_B[D, E]
case class CC_D[G]() extends T_B[G, CC_A]

val v_a: CC_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_C(_, _, _)) => 0 
}
}
// This is not matched: (CC_B (CC_A (T_B T_A T_A))
//      (CC_B (CC_A T_A) Wildcard (T_B (CC_A T_A) (CC_A T_A)))
//      (T_B (CC_A (T_B T_A T_A)) (CC_A T_A)))
// This is not matched: (CC_A Wildcard Wildcard Wildcard T_A)