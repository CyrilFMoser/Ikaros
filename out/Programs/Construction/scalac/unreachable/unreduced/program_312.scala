package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, T_A[D, D]], b: Int) extends T_A[D, T_A[D, D]]
case class CC_C[E]() extends T_A[E, (CC_B[T_B],CC_B[T_B])]
case class CC_D[F](a: CC_A[F], b: F, c: F) extends T_B
case class CC_E(a: CC_C[T_B], b: T_A[Char, CC_C[T_B]]) extends T_B

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}