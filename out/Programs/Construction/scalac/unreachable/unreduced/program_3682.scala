package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[Char, D]
case class CC_B[E](a: T_A[E, E], b: E) extends T_A[Char, E]
case class CC_C[F]() extends T_A[Char, F]
case class CC_D(a: CC_B[Int], b: CC_A[CC_A[Char]], c: CC_B[Byte]) extends T_B[T_A[Char, Byte]]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_, _)