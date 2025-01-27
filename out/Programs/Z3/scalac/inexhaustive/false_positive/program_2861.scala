package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (Int,Int)) extends T_A[Char, T_A[Byte, Boolean]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((12,_)) => 0 
}
}
// This is not matched: (CC_A T_A)