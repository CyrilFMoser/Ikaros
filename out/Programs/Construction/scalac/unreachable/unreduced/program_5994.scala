package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: Boolean) extends T_A[T_A[T_A[Boolean, (Char,Boolean)], Byte], C]
case class CC_B[D](a: T_A[D, T_A[D, D]], b: CC_A[D]) extends T_A[T_A[T_A[Boolean, (Char,Boolean)], Byte], D]
case class CC_C[E, F]() extends T_A[T_A[T_A[Boolean, (Char,Boolean)], Byte], E]

val v_a: T_A[T_A[T_A[Boolean, (Char,Boolean)], Byte], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C()