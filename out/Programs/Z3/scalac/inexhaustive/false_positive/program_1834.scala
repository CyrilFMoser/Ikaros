package Program_31 

package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_A[C, C], C]
case class CC_B(a: T_A[T_B, T_B], b: T_A[T_B, T_B]) extends T_A[T_A[CC_A[T_B], CC_A[T_B]], CC_A[T_B]]
case class CC_C[D, E, F](a: Boolean) extends T_A[D, E]
case class CC_D() extends T_B

val v_a: T_A[Char, T_A[T_A[CC_A[T_B], CC_A[T_B]], CC_A[T_B]]] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
}
}
// This is not matched: (CC_C Char
//      (T_A (T_A (CC_A T_B T_B) (CC_A T_B T_B)) (CC_A T_B (T_A T_B T_B)))
//      T_B
//      Wildcard
//      (T_A Char
//           (T_A (T_A (CC_A T_B T_B) (CC_A T_B T_B)) (CC_A T_B (T_A T_B T_B)))))
// This is not matched: (CC_B Wildcard Wildcard (CC_C T_A) T_A)