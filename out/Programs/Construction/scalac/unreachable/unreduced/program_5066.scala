package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[((Int,Char),(Char,Byte)), E]
case class CC_B[F](a: CC_A[F]) extends T_A[((Int,Char),(Char,Byte)), F]
case class CC_C[G](a: (T_A[Byte, Byte],Byte), b: CC_B[G]) extends T_A[((Int,Char),(Char,Byte)), G]

val v_a: T_A[((Int,Char),(Char,Byte)), Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C((_,_), _) => 2 
}
}