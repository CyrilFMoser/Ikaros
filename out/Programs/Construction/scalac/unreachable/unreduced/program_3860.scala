package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_A[Byte, T_A[Char, Byte]], T_A[(Char,(Int,Char)), (Int,Boolean)]]
case class CC_B(a: T_A[T_B[CC_A, CC_A], T_A[CC_A, CC_A]], b: T_A[T_B[CC_A, CC_A], (CC_A,CC_A)]) extends T_A[T_A[Byte, T_A[Char, Byte]], T_A[(Char,(Int,Char)), (Int,Boolean)]]
case class CC_C() extends T_A[T_A[Byte, T_A[Char, Byte]], T_A[(Char,(Int,Char)), (Int,Boolean)]]
case class CC_D[E](a: CC_C, b: T_A[E, E], c: E) extends T_B[Byte, E]

val v_a: T_A[T_A[Byte, T_A[Char, Byte]], T_A[(Char,(Int,Char)), (Int,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A()