package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Int]], b: T_B[T_A[Boolean], T_B[Char, Byte]], c: T_A[T_B[Char, Char]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B() extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: CC_A, b: Byte, c: CC_B) extends T_A[T_A[T_A[Boolean]]]
case class CC_D[E, D](a: E, b: (T_A[CC_B],T_A[CC_B])) extends T_B[D, E]
case class CC_E[G, F](a: T_A[G]) extends T_B[F, G]
case class CC_F[H]() extends T_B[H, Int]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(_, _), _) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_, _, _), _, CC_B()) => 2 
}
}
// This is not matched: CC_A(_, CC_E(_), _)