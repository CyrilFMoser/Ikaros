package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: C, c: T_B) extends T_A[T_A[T_B, T_B], C]
case class CC_B[D]() extends T_A[T_A[T_B, T_B], D]
case class CC_C() extends T_B

val v_a: T_A[T_A[T_B, T_B], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_C()) => 0 
  case CC_B() => 1 
}
}