package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[F, F]) extends T_A[E, F]
case class CC_B[G]() extends T_B[G, (Char,CC_A[Int, Boolean])]
case class CC_C[H](a: T_B[H, H], b: T_A[H, H]) extends T_B[H, (Char,CC_A[Int, Boolean])]

val v_a: T_B[Int, (Char,CC_A[Int, Boolean])] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _) => 1 
}
}