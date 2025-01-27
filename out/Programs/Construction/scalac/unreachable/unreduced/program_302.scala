package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, Char], b: T_B[D], c: D) extends T_A[D, Char]
case class CC_B[E](a: E, b: E) extends T_A[E, Char]
case class CC_C(a: T_A[Char, Char]) extends T_B[T_A[T_A[Char, Char], Char]]

val v_a: T_A[CC_C, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, CC_C(_)) => 0 
  case CC_A(CC_B(_, _), _, CC_C(_)) => 1 
  case CC_B(_, _) => 2 
}
}