package Program_14 

package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_A[B], b: B, c: B) extends T_A[B]
case class CC_B[C]() extends T_A[C]
case class CC_C[D](a: CC_B[D]) extends T_A[D]
case class CC_D() extends T_B
case class CC_E[E](a: CC_A[E]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_A(_, _, _)) => 1 
}
}
// This is not matched: (CC_E (Tuple Boolean Boolean)
//      (CC_A (Tuple Boolean Boolean)
//            (CC_B (Tuple Boolean Boolean) (T_A (Tuple Boolean Boolean)))
//            (Tuple Boolean Wildcard)
//            (Tuple Boolean Boolean)
//            (T_A (Tuple Boolean Boolean)))
//      T_B)
// This is not matched: (CC_E T_B Wildcard T_B)