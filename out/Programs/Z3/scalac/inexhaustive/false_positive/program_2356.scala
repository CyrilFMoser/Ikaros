package Program_31 

object Test {
sealed trait T_B[C, D]
case class CC_D[K](a: K, b: T_B[K, K]) extends T_B[K, (Byte,Byte)]

val v_a: T_B[Byte, (Byte,Byte)] = null
val v_b: Int = v_a match{
  case CC_D(0, _) => 0 
}
}
// This is not matched: (CC_C T_A)