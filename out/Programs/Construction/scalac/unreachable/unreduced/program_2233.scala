package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_A[D], c: D) extends T_A[D]
case class CC_B[E](a: CC_A[E], b: T_B[E, E]) extends T_A[E]
case class CC_C(a: CC_A[T_B[Char, Byte]], b: (T_A[Int],T_A[Boolean])) extends T_A[T_A[T_A[Char]]]
case class CC_D[F]() extends T_B[Boolean, F]
case class CC_E[G](a: Int, b: Char, c: G) extends T_B[Boolean, G]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, CC_A(_, _, _), _), _) => 1 
}
}
// This is not matched: CC_B(CC_A(_, CC_B(_, _), _), _)