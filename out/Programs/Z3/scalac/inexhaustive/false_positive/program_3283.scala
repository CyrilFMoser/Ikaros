package Program_15 

object Test {
sealed trait T_A[A]
case class CC_B(a: (Boolean,Byte)) extends T_A[(Boolean,Char)]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B((_,0)) => 0 
}
}
// This is not matched: (CC_A T_A)