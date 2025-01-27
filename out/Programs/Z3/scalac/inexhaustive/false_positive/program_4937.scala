package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_D(a: Byte) extends T_B[T_A[(Int,Char)]]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(0) => 0 
}
}
// This is not matched: (CC_C Byte (Tuple Char Int) (T_A Byte (Tuple Char Int)))