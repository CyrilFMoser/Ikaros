package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: (Int,Char)) extends T_A[C, D]

val v_a: CC_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A((12,_)) => 0 
}
}
// This is not matched: (CC_D T_B)