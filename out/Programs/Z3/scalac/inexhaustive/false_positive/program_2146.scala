package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Char) extends T_A[T_A[Char, Int], C]
case class CC_B() extends T_A[T_A[Char, Int], (Byte,Char)]

val v_a: T_A[T_A[Char, Int], T_A[CC_B, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
}
}
// This is not matched: (CC_C Char Byte Wildcard Wildcard (T_A Char Byte))