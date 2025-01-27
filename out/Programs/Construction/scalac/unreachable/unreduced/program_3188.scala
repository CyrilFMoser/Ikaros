package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_B[T_A, T_A],T_B[T_A, Char]), b: Byte, c: T_B[T_B[T_A, T_A], (T_A,T_A)]) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C[C]() extends T_B[T_B[(T_A,CC_A), Byte], C]
case class CC_D[D](a: T_B[D, D], b: D) extends T_B[T_B[(T_A,CC_A), Byte], D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}