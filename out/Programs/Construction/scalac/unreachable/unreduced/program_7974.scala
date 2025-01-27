package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[F, E], b: T_B[E, E], c: Int) extends T_A[F, E]
case class CC_B[G]() extends T_A[Char, G]
case class CC_C[H](a: T_A[H, H]) extends T_A[Char, H]
case class CC_D(a: CC_A[T_A[Boolean, Boolean], CC_A[Int, Byte]], b: CC_C[Char]) extends T_B[Int, CC_B[T_B[Char, Boolean]]]
case class CC_E(a: T_A[CC_B[CC_D], T_A[CC_D, CC_D]]) extends T_B[Int, CC_B[T_B[Char, Boolean]]]

val v_a: T_A[Char, CC_E] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_B(), _, _) => 1 
  case CC_A(CC_C(CC_A(_, _, _)), _, _) => 2 
  case CC_B() => 3 
  case CC_C(CC_A(CC_A(_, _, _), _, 12)) => 4 
  case CC_C(CC_A(CC_A(_, _, _), _, _)) => 5 
}
}