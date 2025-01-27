package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[((Int,Int),Boolean), T_B[(Int,Boolean), T_A]]) extends T_A
case class CC_B(a: T_A, b: CC_A, c: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: T_A, b: (T_B[CC_B, Char],T_A), c: T_A) extends T_B[C, Char]
case class CC_E[D](a: D, b: T_A, c: T_B[D, Char]) extends T_B[D, Char]
case class CC_F[E](a: E, b: Int, c: T_B[E, Char]) extends T_B[E, Char]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_, _, _)