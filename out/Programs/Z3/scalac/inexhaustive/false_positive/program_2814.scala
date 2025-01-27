package Program_31 

package Program_8 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B[A](a: (CC_A,T_A), b: CC_A) extends T_A
case class CC_C(a: CC_B[T_A]) extends T_A

val v_a: CC_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B((CC_A(),CC_B(_, _)), CC_A()) => 0 
  case CC_B((CC_A(),CC_C(_)), _) => 1 
  case CC_B((CC_A(),CC_A()), CC_A()) => 2 
}
}
// This is not matched: (CC_B (CC_A (CC_A T_A))
//      (Tuple Wildcard (CC_B T_A Wildcard (CC_A T_A) T_A))
//      Wildcard
//      T_A)
// This is not matched: Pattern match is empty without constants