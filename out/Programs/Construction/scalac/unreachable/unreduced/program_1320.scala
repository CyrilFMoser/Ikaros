package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int, b: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: D, b: D) extends T_A[T_A[D, D], D]
case class CC_C[E]() extends T_A[T_A[CC_B[T_A[Char, Boolean]], CC_B[T_A[Char, Boolean]]], CC_B[T_A[Char, Boolean]]]

val v_a: T_A[T_A[CC_B[T_A[Char, Boolean]], CC_B[T_A[Char, Boolean]]], CC_B[T_A[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_B(_, _)) => 1 
  case CC_C() => 2 
}
}