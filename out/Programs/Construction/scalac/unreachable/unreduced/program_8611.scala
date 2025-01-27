package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: D, c: (T_B[Byte],T_B[Int])) extends T_A[D, T_A[D, T_A[D, D]]]
case class CC_B[E]() extends T_A[E, T_A[E, T_A[E, E]]]
case class CC_C[F](a: T_A[F, F], b: CC_A[F]) extends T_A[T_A[T_B[Int], CC_A[Char]], T_A[T_A[T_B[Int], CC_A[Char]], T_A[T_A[T_B[Int], CC_A[Char]], T_A[T_B[Int], CC_A[Char]]]]]
case class CC_D(a: Int, b: CC_C[T_B[Boolean]], c: Char) extends T_B[CC_C[(Char,Boolean)]]
case class CC_E(a: T_A[CC_B[CC_D], T_B[CC_D]], b: CC_C[T_B[CC_D]]) extends T_B[CC_C[(Char,Boolean)]]
case class CC_F[G](a: G) extends T_B[G]

val v_a: T_A[T_A[T_B[Int], CC_A[Char]], T_A[T_A[T_B[Int], CC_A[Char]], T_A[T_A[T_B[Int], CC_A[Char]], T_A[T_B[Int], CC_A[Char]]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (CC_F(_),CC_F(_))) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}