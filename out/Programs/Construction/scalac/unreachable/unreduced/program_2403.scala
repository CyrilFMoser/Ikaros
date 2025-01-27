package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[E, F], b: T_A[F, F]) extends T_A[F, E]
case class CC_B[G](a: T_B[G, G]) extends T_A[G, Boolean]
case class CC_C[H, I]() extends T_B[H, CC_B[CC_A[Int, Boolean]]]

val v_a: CC_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(CC_A(_, _), CC_A(_, _))) => 0 
  case CC_A(CC_A(_, CC_B(_)), CC_A(CC_A(_, _), CC_A(_, _))) => 1 
}
}