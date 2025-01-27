package Program_31 

package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Byte) extends T_A[T_A[Int, Char], T_A[(Int,Byte), Char]]

val v_a: T_A[T_A[Int, Char], T_A[(Int,Byte), Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
  case CC_A(_, _) => 1 
}
}
// This is not matched: (CC_A Boolean
//      Wildcard
//      Wildcard
//      (T_A (T_A Int Char) (T_A (Tuple Int Byte) Char)))
// This is not matched: (CC_D Char Wildcard Wildcard Wildcard (T_B Char (Tuple Byte Int)))