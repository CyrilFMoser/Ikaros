package Program_31 

package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Boolean], b: T_A[C, C]) extends T_A[(Char,Byte), C]
case class CC_B[D, E](a: CC_A[D], b: E) extends T_A[(Char,Byte), D]
case class CC_C(a: Boolean, b: T_A[(Char,Byte), Char], c: Byte) extends T_A[(Char,Byte), CC_A[(Boolean,Int)]]

val v_a: T_A[(Char,Byte), CC_C] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: (CC_B (CC_C Boolean Boolean Boolean Boolean)
//      Byte
//      Wildcard
//      Byte
//      (T_A (Tuple Char Byte) (CC_C Boolean Boolean Boolean Boolean)))
// This is not matched: (CC_A Wildcard Byte T_A)