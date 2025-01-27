package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_B(a: (Char,(Int,Byte))) extends T_A[T_A[Byte, (Boolean,Boolean)], T_A[(Char,Int), Boolean]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(('x',_)) => 0 
}
}
// This is not matched: (CC_A (CC_D T_B) (CC_C Wildcard Wildcard Wildcard T_A) T_A)