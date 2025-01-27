package Program_15 

package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (Char,Char)) extends T_A[T_A[Byte, Char], T_A[Byte, Boolean]]
case class CC_B[C](a: C) extends T_A[T_A[Byte, Char], T_A[Byte, Boolean]]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_A T_A)