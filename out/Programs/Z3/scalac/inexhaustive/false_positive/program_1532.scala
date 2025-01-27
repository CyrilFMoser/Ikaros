package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (Byte,Char)) extends T_A[C, T_A[Byte, Boolean]]

val v_a: T_A[Char, T_A[Byte, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,'x')) => 0 
}
}
// This is not matched: Pattern match is empty without constants