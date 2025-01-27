package Program_31 

package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_A, Char]) extends T_A
case class CC_C[C](a: C) extends T_A
case class CC_D[D, E](a: CC_B, b: T_B[CC_B, D], c: Char) extends T_B[D, T_A]

val v_a: T_B[Int, T_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_), _, 'x') => 0 
  case CC_D(CC_B(_), _, _) => 1 
}
}
// This is not matched: (CC_D Int T_A Wildcard Wildcard Wildcard (T_B Int T_A))
// This is not matched: (CC_B Char Char (CC_A Char Boolean (T_A Char)) Wildcard (T_A Char))