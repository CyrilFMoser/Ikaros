package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[D, T_B[D]]
case class CC_B[E](a: Byte, b: T_A[E, T_B[E]], c: T_B[E]) extends T_A[E, T_B[E]]
case class CC_C[F, G]() extends T_B[F]

val v_a: T_A[Char, T_B[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_B(_, _, _), CC_C()) => 1 
}
}
// This is not matched: CC_B(_, CC_A(_), CC_C())