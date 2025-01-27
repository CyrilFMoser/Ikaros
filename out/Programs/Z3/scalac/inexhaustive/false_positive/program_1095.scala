package Program_31 

package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Boolean, b: T_B[Char]) extends T_A[(Boolean,Boolean)]
case class CC_B(a: CC_A, b: CC_A, c: T_B[Byte]) extends T_A[(Boolean,Boolean)]
case class CC_C[C](a: T_A[C], b: CC_B, c: CC_B) extends T_A[C]
case class CC_D[D, E](a: D) extends T_B[D]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _, CC_D(_)) => 0 
}
}
// This is not matched: (CC_B Wildcard
//      (CC_A Wildcard
//            (CC_D Char Boolean Char (T_B Char))
//            (T_A (Tuple Boolean Boolean)))
//      (CC_D Byte Boolean Byte (T_B Byte))
//      (T_A (Tuple Boolean Boolean)))
// This is not matched: (CC_B Boolean Int Wildcard (T_A Boolean))