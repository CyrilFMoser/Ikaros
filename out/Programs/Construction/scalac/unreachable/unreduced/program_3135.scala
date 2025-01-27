package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: T_A[C, C]) extends T_A[T_A[T_A[Char, Int], T_A[Char, Char]], C]
case class CC_B[D](a: T_A[D, D], b: D) extends T_A[T_A[CC_A[Int], ((Char,Byte),Char)], D]
case class CC_C[E]() extends T_A[T_A[T_A[Char, Int], T_A[Char, Char]], E]

val v_a: T_A[T_A[T_A[Char, Int], T_A[Char, Char]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}