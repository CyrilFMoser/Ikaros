package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Int, b: T_B[T_A]) extends T_A
case class CC_C[C]() extends T_B[T_B[C]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
}
}
// This is not matched: (CC_B (Tuple (CC_C (CC_B (Tuple Wildcard Wildcard) Wildcard T_B) T_B)
//             (CC_C (CC_B Wildcard Wildcard T_B) T_B))
//      Wildcard
//      T_B)