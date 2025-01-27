package Program_31 

package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: T_B[B], b: B, c: B) extends T_A
case class CC_B(a: T_A, b: Int, c: CC_A[Byte]) extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_C (CC_B Wildcard T_A)
//      (CC_A Wildcard
//            (CC_B (Tuple Wildcard Wildcard) T_A)
//            (Tuple Wildcard Wildcard)
//            T_A)
//      T_A)