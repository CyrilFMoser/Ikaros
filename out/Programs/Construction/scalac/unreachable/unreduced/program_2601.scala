package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[(T_A[Boolean, Boolean],T_B[Boolean, Int]), T_B[Char, T_A[Byte, Char]]]
case class CC_B(a: Char, b: CC_A) extends T_A[(T_A[Boolean, Boolean],T_B[Boolean, Int]), T_B[Char, T_A[Byte, Char]]]
case class CC_C[E](a: T_B[E, E], b: T_B[E, E], c: E) extends T_B[CC_B, E]
case class CC_D[F](a: F) extends T_B[CC_B, F]

val v_a: T_B[CC_B, Int] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(_) => 1 
}
}