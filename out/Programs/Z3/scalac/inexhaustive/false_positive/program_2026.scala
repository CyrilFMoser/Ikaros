package Program_31 

package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: T_B, b: T_A[D, C]) extends T_A[T_B, C]
case class CC_B[E]() extends T_A[E, T_A[E, E]]
case class CC_C[F]() extends T_B
case class CC_D(a: Boolean, b: T_A[T_B, Boolean]) extends T_B

val v_a: T_A[T_B, CC_D] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(CC_D(_, _), _) => 1 
  case CC_A(_, _) => 2 
}
}
// This is not matched: (CC_A (CC_D T_B (T_A T_B T_B) T_B)
//      T_B
//      (CC_C T_B T_B)
//      Wildcard
//      (T_A T_B (CC_D T_B (T_A T_B T_B) T_B)))
// This is not matched: (CC_A Wildcard T_A)