package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: T_B[D], c: T_A[D, D]) extends T_A[T_B[Boolean], D]
case class CC_B[E](a: CC_A[T_B[E]]) extends T_B[E]
case class CC_C[F](a: T_B[CC_B[F]], b: T_A[T_B[Boolean], F]) extends T_B[F]
case class CC_D[G](a: T_B[Int], b: T_B[(Char,Byte)]) extends T_B[G]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _)) => 0 
  case CC_C(_, _) => 1 
  case CC_D(CC_B(CC_A(_, _, _)), _) => 2 
  case CC_D(CC_C(_, _), _) => 3 
  case CC_D(CC_D(CC_B(_), _), _) => 4 
  case CC_D(CC_D(CC_C(_, _), _), _) => 5 
  case CC_D(CC_D(CC_D(_, _), _), _) => 6 
}
}