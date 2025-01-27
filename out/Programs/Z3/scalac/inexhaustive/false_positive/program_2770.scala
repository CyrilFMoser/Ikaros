package Program_31 

package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: E, b: F, c: T_B[E, F]) extends T_A[Char, E]
case class CC_B[H, G](a: G, b: CC_A[H, H]) extends T_A[H, G]
case class CC_C(a: T_A[Int, Boolean], b: CC_A[Char, Int]) extends T_A[Char, CC_B[Byte, (Int,Char)]]

val v_a: T_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_A('x', _, _) => 1 
  case CC_B('x', _) => 2 
  case CC_B(_, _) => 3 
}
}
// This is not matched: (CC_A Char Boolean Wildcard Boolean Wildcard (T_A Char Char))
// This is not matched: (CC_F Wildcard T_B)