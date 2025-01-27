package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_B(a: (Byte,Int)) extends T_A[T_A[Char, Boolean], Boolean]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B((0,_)) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard (T_A (Tuple Byte Char)))