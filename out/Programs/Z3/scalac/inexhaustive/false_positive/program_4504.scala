package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: (Char,Int)) extends T_A[C, D]

val v_a: CC_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(('x',_)) => 0 
}
}
// This is not matched: (CC_B Byte Byte (T_A Byte Byte))