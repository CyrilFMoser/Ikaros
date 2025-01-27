package Program_15 

object Test {
sealed trait T_A[A]
case class CC_B(a: (Byte,Char)) extends T_A[T_A[(Boolean,Byte)]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B((0,_)) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard T_A)