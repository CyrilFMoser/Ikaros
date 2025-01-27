package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Boolean, Byte]]) extends T_A[Boolean]
case class CC_B[D](a: D) extends T_B[CC_A, D]
case class CC_C[E](a: E) extends T_B[CC_A, E]
case class CC_D(a: Boolean, b: CC_A, c: CC_C[T_B[CC_A, CC_A]]) extends T_B[CC_A, CC_A]

val v_a: T_B[CC_A, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_)) => 0 
  case CC_C(CC_A(_)) => 1 
  case CC_D(_, _, _) => 2 
}
}