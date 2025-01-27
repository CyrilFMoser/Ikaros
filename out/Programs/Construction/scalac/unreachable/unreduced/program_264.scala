package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_A[E, E]) extends T_A[D, E]
case class CC_B[F](a: T_A[F, F], b: T_A[Byte, F]) extends T_A[Byte, F]
case class CC_C[G](a: T_B[G], b: G) extends T_A[Byte, G]
case class CC_D(a: T_B[T_A[Byte, Byte]], b: T_A[T_A[Int, Char], Byte]) extends T_B[T_B[T_A[Byte, Boolean]]]

val v_a: T_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, _)) => 1 
  case CC_A(CC_C(_, _)) => 2 
  case CC_B(CC_A(_), _) => 3 
  case CC_B(CC_B(_, _), _) => 4 
  case CC_B(CC_C(_, _), _) => 5 
}
}
// This is not matched: CC_C(_, _)