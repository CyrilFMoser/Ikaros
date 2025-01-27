package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Boolean) extends T_A[T_B[Boolean]]
case class CC_B() extends T_A[T_B[Boolean]]
case class CC_C(a: CC_A[T_B[CC_B]], b: T_A[(CC_B,CC_B)], c: T_B[T_A[(Char,Byte)]]) extends T_A[T_B[Boolean]]
case class CC_D[D](a: Int, b: T_A[T_B[D]]) extends T_B[D]
case class CC_E[E]() extends T_B[E]

val v_a: T_A[T_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_A(_)