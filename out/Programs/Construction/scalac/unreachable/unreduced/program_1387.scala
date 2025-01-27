package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B() extends T_A[T_A[(Byte,T_A[Byte, Char]), (Byte,T_A[Byte, Char])], (Byte,T_A[Byte, Char])]
case class CC_C[D](a: D, b: CC_B) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[(Byte,T_A[Byte, Char]), (Byte,T_A[Byte, Char])], (Byte,T_A[Byte, Char])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_, CC_B()) => 2 
}
}