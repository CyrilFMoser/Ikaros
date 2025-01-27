package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (T_A[Byte, Byte],(Int,(Char,Byte))), b: Boolean) extends T_A[T_A[T_B[Byte, (Byte,Byte)], T_A[Char, (Int,Boolean)]], E]
case class CC_B() extends T_A[T_A[T_B[Byte, (Byte,Byte)], T_A[Char, (Int,Boolean)]], CC_A[T_A[Byte, Boolean]]]
case class CC_C[F, G](a: T_A[G, F], b: F, c: Byte) extends T_B[F, G]

val v_a: T_A[T_A[T_B[Byte, (Byte,Byte)], T_A[Char, (Int,Boolean)]], CC_A[T_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A((_,(_,_)), true) => 0 
  case CC_A((_,(_,_)), false) => 1 
  case CC_B() => 2 
}
}