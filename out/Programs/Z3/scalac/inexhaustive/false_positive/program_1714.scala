package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Int,Byte)) extends T_A[C, T_A[Byte, Char]]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A((_,0)) => 0 
}
}
// This is not matched: Pattern match is empty without constants