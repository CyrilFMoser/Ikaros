package Program_31 

package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Byte, b: (Boolean,Boolean)) extends T_A[T_A[Boolean]]
case class CC_B[D, E](a: T_A[E]) extends T_A[D]
case class CC_C(a: Char, b: CC_B[CC_A, CC_A]) extends T_A[T_A[Boolean]]

val v_a: CC_B[T_A[T_A[Boolean]], Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
}
}
// This is not matched: (CC_B (T_A (T_A Boolean))
//      Char
//      (CC_B Char
//            (T_A Boolean)
//            (CC_C Wildcard Wildcard (T_A (T_A Boolean)))
//            (T_A Char))
//      (T_A (T_A (T_A Boolean))))
// This is not matched: (CC_C (Tuple (CC_C Wildcard Wildcard Wildcard T_A) Wildcard)
//      Wildcard
//      Wildcard
//      T_A)