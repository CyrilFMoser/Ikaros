package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B[D](a: T_A[D, D], b: (Byte,Char)) extends T_A[D, T_A[Int, Char]]

val v_a: T_A[Byte, T_A[Int, Char]] = null
val v_b: Int = v_a match{
  case CC_B(_, (_,'x')) => 0 
}
}
// This is not matched: Pattern match is empty without constants