package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: D, c: T_A[D, T_B[D]]) extends T_A[D, T_B[D]]
case class CC_B[E](a: T_A[E, T_B[E]], b: Int) extends T_A[E, T_B[E]]
case class CC_C[F](a: Byte, b: T_B[F]) extends T_A[F, T_B[F]]
case class CC_D() extends T_B[Boolean]
case class CC_E(a: T_A[T_B[Boolean], T_B[T_B[Boolean]]]) extends T_B[Boolean]

val v_a: T_A[Int, T_B[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(12, _, _), _) => 1 
  case CC_B(CC_A(_, _, _), _) => 2 
  case CC_B(CC_C(_, _), _) => 3 
  case CC_C(_, _) => 4 
}
}
// This is not matched: CC_B(CC_B(_, _), _)