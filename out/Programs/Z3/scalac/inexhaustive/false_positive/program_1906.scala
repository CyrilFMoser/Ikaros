package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: (Byte,Int)) extends T_A[D, C]

val v_a: CC_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A((0,_)) => 0 
}
}
// This is not matched: (CC_A Char (T_A (Tuple Byte Boolean) Char))