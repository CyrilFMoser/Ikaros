package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Char) extends T_A[(T_A[Byte],Boolean)]
case class CC_B(a: Boolean, b: T_A[T_A[CC_A]]) extends T_A[(T_A[Byte],Boolean)]
case class CC_C[C](a: T_A[C], b: CC_A) extends T_B[C]
case class CC_D[D]() extends T_B[D]
case class CC_E[E](a: T_B[E], b: T_A[E]) extends T_B[E]

val v_a: T_A[(T_A[Byte],Boolean)] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}