package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[E](a: T_A[E, E], b: (Int,Boolean)) extends T_A[E, T_A[Byte, Boolean]]

val v_a: T_A[Char, T_A[Byte, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, (12,_)) => 0 
}
}
// This is not matched: (CC_A Char Byte Boolean Wildcard (T_A Byte Char))