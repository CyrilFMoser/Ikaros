package Program_31 

package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[C, T_A[(Int,Int), Boolean]]
case class CC_B[E, F, G](a: CC_A[E, G], b: E) extends T_A[E, F]
case class CC_C[H](a: CC_B[H, H, H], b: T_A[H, H]) extends T_A[H, T_A[(Int,Int), Boolean]]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B(_, _)) => 0 
}
}
// This is not matched: (CC_C Char
//      Wildcard
//      (CC_B Char Char Boolean Wildcard Wildcard (T_A Char Char))
//      (T_A Char (T_A (Tuple Int Int) Boolean)))
// This is not matched: (CC_A Wildcard T_A)