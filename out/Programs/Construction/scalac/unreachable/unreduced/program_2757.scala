package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C]) extends T_A[C, T_A[T_A[Int, Byte], T_A[Char, (Byte,Char)]]]
case class CC_B[D](a: T_A[D, T_A[D, D]], b: Int, c: D) extends T_A[D, T_A[T_A[Int, Byte], T_A[Char, (Byte,Char)]]]
case class CC_C[E]() extends T_A[E, T_A[T_A[Int, Byte], T_A[Char, (Byte,Char)]]]

val v_a: T_A[Char, T_A[T_A[Int, Byte], T_A[Char, (Byte,Char)]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_)