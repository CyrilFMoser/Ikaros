package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (T_A[Byte, Boolean],T_A[Boolean, Byte]), c: T_A[C, C]) extends T_A[C, T_A[T_A[Char, Int], (Byte,Boolean)]]
case class CC_B[D](a: D) extends T_A[D, T_A[T_A[Char, Int], (Byte,Boolean)]]
case class CC_C[E]() extends T_A[E, T_A[T_A[Char, Int], (Byte,Boolean)]]

val v_a: T_A[Boolean, T_A[T_A[Char, Int], (Byte,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_)