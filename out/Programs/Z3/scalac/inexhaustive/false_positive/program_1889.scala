package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B[D](a: T_A[D, D], b: D) extends T_A[D, (Char,Byte)]

val v_a: T_A[Byte, (Char,Byte)] = null
val v_b: Int = v_a match{
  case CC_B(_, 0) => 0 
}
}
// This is not matched: (CC_A Char Wildcard Wildcard (T_A Char))