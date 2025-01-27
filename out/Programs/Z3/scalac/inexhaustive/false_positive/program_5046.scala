package Program_14 

package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_A[B], b: Int) extends T_A[B]
case class CC_B[C](a: T_B, b: C) extends T_A[C]
case class CC_C[D](a: T_A[D], b: Char) extends T_A[D]
case class CC_D[E]() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
}
}
// This is not matched: (CC_D T_B T_B)
// This is not matched: (CC_B (CC_E Char (T_B Char))
//      (CC_D (CC_A Wildcard Wildcard Wildcard)
//            Wildcard
//            (T_B (CC_A Wildcard Wildcard Wildcard)))
//      (CC_B (CC_E Char (T_B Char)) Wildcard Wildcard T_A)
//      T_A)