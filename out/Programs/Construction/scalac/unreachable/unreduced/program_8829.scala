package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[T_A[C, C], C]
case class CC_B(a: T_A[T_A[T_B, T_B], CC_A[T_B]], b: Int, c: Int) extends T_A[T_A[T_A[T_A[(Byte,T_B), (Byte,T_B)], (Byte,T_B)], T_A[T_A[(Byte,T_B), (Byte,T_B)], (Byte,T_B)]], T_A[T_A[(Byte,T_B), (Byte,T_B)], (Byte,T_B)]]
case class CC_C[D]() extends T_A[T_A[D, D], D]
case class CC_D(a: CC_B) extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_, 12, _)) => 0 
  case CC_E() => 1 
}
}
// This is not matched: CC_D(CC_B(_, _, _))