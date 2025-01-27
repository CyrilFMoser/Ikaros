package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: C, c: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: D, b: Char) extends T_A[(CC_A[Byte],CC_A[T_B]), D]
case class CC_C[E](a: (T_A[T_B, T_B],Char)) extends T_A[(CC_A[Byte],CC_A[T_B]), E]
case class CC_D(a: CC_A[CC_C[T_B]], b: (CC_A[T_B],Char), c: Byte) extends T_B
case class CC_E() extends T_B
case class CC_F(a: CC_A[T_A[CC_E, CC_D]], b: CC_E) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _, _), _, 0) => 0 
  case CC_D(CC_A(_, _, _), _, _) => 1 
  case CC_E() => 2 
  case CC_F(CC_A(_, _, _), CC_E()) => 3 
}
}