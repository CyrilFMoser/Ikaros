package Program_31 

package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_B[T_A, T_A], b: Boolean) extends T_A
case class CC_D[C, D](a: CC_B, b: T_B[C, D]) extends T_B[T_A, C]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_D(_, _), _) => 0 
}
}
// This is not matched: (CC_C (CC_D T_A T_A Wildcard Wildcard (T_B T_A T_A)) Wildcard T_A)
// This is not matched: (CC_C Wildcard
//      (CC_F (CC_B Wildcard) (CC_B (T_A (T_B Boolean))) (T_B (CC_B Wildcard)))
//      Wildcard
//      (T_A (T_B Boolean)))