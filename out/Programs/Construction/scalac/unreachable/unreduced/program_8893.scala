package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: Byte, c: T_B[D]) extends T_A[T_A[D, D], D]
case class CC_B[E](a: CC_A[E], b: T_B[E], c: (T_B[Int],T_B[Boolean])) extends T_B[E]
case class CC_C[F](a: CC_B[F]) extends T_B[F]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), CC_B(CC_A(_, _, _), CC_B(_, _, _), _), _) => 0 
  case CC_B(CC_A(_, _, _), CC_B(CC_A(_, _, _), CC_C(_), _), _) => 1 
  case CC_B(CC_A(_, _, _), CC_C(_), _) => 2 
  case CC_C(CC_B(_, _, _)) => 3 
}
}