package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]]) extends T_A[((Char,(Char,Char)),T_A[Byte, (Int,Boolean)]), C]
case class CC_B[D]() extends T_A[((Char,(Char,Char)),T_A[Byte, (Int,Boolean)]), D]
case class CC_C[E, F](a: CC_B[F]) extends T_A[((Char,(Char,Char)),T_A[Byte, (Int,Boolean)]), E]

val v_a: T_A[((Char,(Char,Char)),T_A[Byte, (Int,Boolean)]), Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}