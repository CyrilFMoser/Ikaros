package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[T_A[Char, Boolean], T_A[Int, Boolean]]]
case class CC_B[D](a: D) extends T_A[D, T_A[T_A[Char, Boolean], T_A[Int, Boolean]]]
case class CC_C() extends T_A[(Byte,CC_A[Char]), T_A[T_A[Char, Boolean], T_A[Int, Boolean]]]

val v_a: T_A[Byte, T_A[T_A[Char, Boolean], T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}