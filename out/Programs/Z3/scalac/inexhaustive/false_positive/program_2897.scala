package Program_14 

package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_A,T_A)) extends T_A
case class CC_B[B](a: B, b: B) extends T_A
case class CC_C[C](a: C, b: CC_B[C]) extends T_B[C]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_),CC_A(_))) => 0 
}
}
// This is not matched: (CC_A (Tuple (CC_B Boolean Wildcard Boolean T_A)
//             (CC_B T_A Wildcard Wildcard T_A))
//      T_A)
// This is not matched: (CC_A (CC_A (CC_A Wildcard T_A) T_A) T_A)