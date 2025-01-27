package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Byte, Char]], b: T_B[T_B[Byte, Byte], T_A[Byte]], c: (T_B[(Boolean,Boolean), Byte],(Byte,Byte))) extends T_A[T_A[T_A[Char]]]
case class CC_B[D](a: Boolean, b: CC_A) extends T_A[T_A[T_A[Char]]]
case class CC_C[E](a: T_B[E, E], b: CC_A) extends T_B[(Char,(CC_A,Byte)), E]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(true, _) => 1 
  case CC_B(false, _) => 2 
}
}