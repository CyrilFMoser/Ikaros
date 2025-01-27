package Program_31 

package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean, b: Byte, c: Int) extends T_A[C, T_A[C, Int]]
case class CC_B[D, E](a: D) extends T_A[D, T_A[D, Int]]
case class CC_C[G, F](a: T_A[G, F], b: CC_B[G, F]) extends T_A[G, F]

val v_a: T_A[Char, T_A[Char, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, 0, _) => 0 
  case CC_A(_, 0, 12) => 1 
  case CC_A(_, _, _) => 2 
  case CC_A(_, _, 12) => 3 
  case CC_B(_) => 4 
  case CC_C(_, CC_B(_)) => 5 
  case CC_C(_, _) => 6 
  case CC_C(CC_B(_), CC_B(_)) => 7 
}
}
// This is not matched: (CC_B Char Boolean Char (T_A Char (T_A Char Int)))
// This is not matched: Pattern match is empty without constants