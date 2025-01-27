package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[Byte, T_A[E, E]], b: T_B[E, T_A[E, E]]) extends T_A[E, T_A[E, E]]
case class CC_B[F](a: CC_A[F]) extends T_A[F, T_A[F, F]]
case class CC_C[H, G](a: T_A[Char, H]) extends T_A[H, G]
case class CC_D() extends T_B[CC_C[CC_C[Boolean, Boolean], Boolean], T_A[T_A[(Int,Char), Char], Char]]
case class CC_E(a: T_A[T_A[CC_D, Int], CC_D], b: CC_B[T_B[(Char,Char), CC_D]], c: CC_A[CC_D]) extends T_B[CC_C[CC_C[Boolean, Boolean], Boolean], T_A[T_A[(Int,Char), Char], Char]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_C(CC_C(_))) => 2 
}
}