package Program_30 

package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_A, T_A]) extends T_A
case class CC_B[C](a: T_B[C, C], b: T_B[C, C]) extends T_A
case class CC_C[E, D]() extends T_B[D, E]
case class CC_D[F](a: T_A, b: CC_C[F, F]) extends T_B[CC_A, F]

val v_a: CC_D[T_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _), _) => 0 
  case CC_D(CC_B(_, _), CC_C()) => 1 
}
}
// This is not matched: (CC_D T_A
//      (CC_B T_A Wildcard Wildcard T_A)
//      Wildcard
//      (T_B (CC_A T_A T_A T_A) T_A))
// This is not matched: (CC_A Wildcard (T_A (T_A (Tuple Int Char))))