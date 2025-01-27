package Program_13 

object Test {
sealed trait T_A[A]
case class CC_C(a: (Int,Boolean)) extends T_A[Char]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C((12,_)) => 0 
}
}
// This is not matched: (CC_B (T_A T_B (T_A (Tuple Byte Byte) T_B)))