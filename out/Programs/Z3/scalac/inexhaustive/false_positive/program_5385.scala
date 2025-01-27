package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[D](a: (Char,Byte)) extends T_A[D]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(('x',_)) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard Wildcard (T_A (T_A (Tuple Char Boolean))))