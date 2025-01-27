package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[D, D], b: E) extends T_A[D, E]
case class CC_B[F](a: F, b: Byte) extends T_A[T_B[T_A[Int, Char]], F]
case class CC_C(a: CC_B[T_B[Char]]) extends T_B[T_A[T_B[Char], T_B[Int]]]

val v_a: T_A[T_B[T_A[Int, Char]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(_, _), _), _) => 1 
  case CC_A(CC_B(_, _), _) => 2 
  case CC_B(_, _) => 3 
}
}