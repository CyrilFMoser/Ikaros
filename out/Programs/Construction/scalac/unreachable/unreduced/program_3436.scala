package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, T_A[E, E]], b: T_A[E, E]) extends T_A[E, T_A[E, E]]
case class CC_B[F]() extends T_A[F, T_A[F, F]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_A(CC_B(), _)