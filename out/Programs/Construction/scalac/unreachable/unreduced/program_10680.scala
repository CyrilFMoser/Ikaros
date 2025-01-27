package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: (T_B[Byte],((Char,Int),Byte))) extends T_A[(T_B[Char],(Byte,Char)), D]
case class CC_B[E](a: T_A[E, E], b: CC_A[E], c: E) extends T_A[(T_B[Char],(Byte,Char)), E]
case class CC_C[F](a: T_A[F, F]) extends T_A[(T_B[Char],(Byte,Char)), F]

val v_a: T_A[(T_B[Char],(Byte,Char)), Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B(_, _, _)