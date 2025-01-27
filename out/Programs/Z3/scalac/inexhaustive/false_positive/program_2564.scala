package Program_30 

package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Boolean,Int), b: T_A[Byte, C]) extends T_A[Byte, C]
case class CC_B(a: T_A[Int, Int]) extends T_A[Byte, (Boolean,Int)]
case class CC_C[D, E](a: Char) extends T_A[Byte, D]

val v_a: T_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_A(_, _) => 1 
}
}
// This is not matched: (CC_C Byte Boolean Wildcard (T_A Byte Byte))
// This is not matched: (CC_E Char Wildcard (T_B Char (T_A Byte Char)))