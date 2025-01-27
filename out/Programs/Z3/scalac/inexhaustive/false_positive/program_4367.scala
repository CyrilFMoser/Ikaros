package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_B(a: (Char,(Char,Byte))) extends T_A[T_B[Byte]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(('x',_)) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard (T_A (T_A Char)))