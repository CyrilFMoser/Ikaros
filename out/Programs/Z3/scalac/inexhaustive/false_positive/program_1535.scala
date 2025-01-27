package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Int,Int)) extends T_A[C, T_A[Boolean, Char]]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A((_,12)) => 0 
}
}
// This is not matched: (CC_A Byte Wildcard (CC_A Byte Wildcard Wildcard (T_A Byte)) (T_A Byte))