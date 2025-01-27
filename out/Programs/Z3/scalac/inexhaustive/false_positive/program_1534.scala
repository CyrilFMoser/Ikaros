package Program_30 

object Test {
sealed trait T_A[A]
case class CC_B[C](a: (Byte,Byte)) extends T_A[C]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B((0,_)) => 0 
}
}
// This is not matched: (CC_B T_A Wildcard (CC_A T_A Wildcard T_A) Wildcard (T_B T_A))