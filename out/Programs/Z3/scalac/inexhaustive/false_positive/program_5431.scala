package Program_15 

package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C, E](a: C) extends T_A[C, D]
case class CC_B(a: T_A[T_B, T_B]) extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_)) => 0 
}
}
// This is not matched: (CC_B (CC_A T_B
//            T_B
//            T_B
//            (CC_B (CC_A T_B T_B T_B Wildcard (T_A T_B T_B)) T_B)
//            (T_A T_B T_B))
//      T_B)
// This is not matched: (CC_D Boolean
//      Wildcard
//      (CC_D T_A
//            (CC_E T_A (T_B T_A))
//            (CC_D T_A Wildcard Wildcard (T_B T_A))
//            (T_B T_A))
//      (T_B Boolean))