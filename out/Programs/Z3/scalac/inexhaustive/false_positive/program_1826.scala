package Program_31 

package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Byte, Boolean], b: T_A[Char, Byte]) extends T_A[Int, T_A[Byte, Char]]
case class CC_B(a: T_A[CC_A, (Char,Boolean)], b: CC_A) extends T_A[Int, T_A[Byte, Char]]
case class CC_C[D, C, E](a: (CC_B,CC_B), b: T_A[CC_B, E]) extends T_A[C, D]

val v_a: T_A[Int, T_A[Byte, Char]] = null
val v_b: Int = v_a match{
  case CC_B(CC_C(_, _), _) => 0 
  case CC_B(_, _) => 1 
  case CC_B(CC_C(_, _), CC_A(_, _)) => 2 
  case CC_C(_, _) => 3 
  case CC_A(CC_C(_, _), _) => 4 
}
}
// This is not matched: (CC_A (CC_C Boolean Byte Boolean Wildcard Wildcard (T_A Byte Boolean))
//      Wildcard
//      (T_A Int (T_A Byte Char)))
// This is not matched: (CC_A Wildcard Wildcard (T_A Int (T_A Byte Char)))