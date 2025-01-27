package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, Char], b: T_B) extends T_A[C, T_B]
case class CC_B[D](a: T_B, b: T_A[D, T_B], c: D) extends T_A[D, T_B]
case class CC_C(a: Int, b: T_A[T_A[Char, T_B], Boolean], c: CC_B[T_A[T_B, T_B]]) extends T_B
case class CC_D[E](a: T_A[E, T_B], b: E, c: T_A[E, T_B]) extends T_B

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_C(_, _, _), CC_A(_, _), _) => 0 
  case CC_B(CC_D(_, _, _), CC_A(_, _), _) => 1 
  case CC_B(CC_C(_, _, _), CC_B(_, _, _), _) => 2 
  case CC_B(CC_D(_, _, _), CC_B(_, _, _), _) => 3 
}
}