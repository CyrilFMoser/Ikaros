package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[Boolean]
case class CC_B(a: T_B[T_A[Char], Boolean]) extends T_A[Boolean]
case class CC_C(a: T_B[T_A[CC_A], (Boolean,CC_B)], b: T_A[Boolean]) extends T_A[Boolean]
case class CC_D[D](a: CC_B) extends T_B[CC_A, D]
case class CC_E[E](a: Boolean, b: E) extends T_B[CC_A, E]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C(_, _)