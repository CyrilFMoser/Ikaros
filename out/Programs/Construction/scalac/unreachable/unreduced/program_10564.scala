package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: T_A[D, T_B[D]]) extends T_A[D, T_B[D]]
case class CC_B[E](a: T_A[E, E], b: E) extends T_A[E, T_B[E]]
case class CC_C[F](a: Int, b: CC_B[F], c: Char) extends T_B[F]
case class CC_D(a: T_B[CC_A[Byte]]) extends T_B[Int]

val v_a: T_A[Int, T_B[Int]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _, _), CC_A(CC_C(_, _, _), _)) => 0 
  case CC_A(CC_C(_, _, _), CC_B(_, _)) => 1 
  case CC_A(CC_D(CC_C(_, _, _)), CC_A(CC_C(_, _, _), _)) => 2 
  case CC_A(CC_D(CC_C(_, _, _)), CC_A(CC_D(_), _)) => 3 
  case CC_A(CC_D(CC_C(_, _, _)), CC_B(_, _)) => 4 
  case CC_B(_, _) => 5 
}
}
// This is not matched: CC_A(CC_C(_, _, _), CC_A(CC_D(_), _))