package Program_15 

package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[(Char,Boolean), T_A], b: T_A, c: T_B[Int, T_A]) extends T_A
case class CC_B[C, D](a: T_B[T_A, D], b: C, c: CC_A) extends T_B[T_B[CC_A, CC_A], C]

val v_a: CC_B[Int, T_A] = null
val v_b: Int = v_a match{
  case CC_B(_, 12, CC_A(_, _, _)) => 0 
  case CC_B(_, 12, _) => 1 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: Pattern match is empty without constants