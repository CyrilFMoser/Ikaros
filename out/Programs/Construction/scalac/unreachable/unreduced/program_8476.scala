package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: T_B[C]) extends T_A[C]
case class CC_B[E](a: E) extends T_A[E]
case class CC_C(a: CC_B[T_A[Boolean]]) extends T_B[T_B[T_B[Byte]]]

val v_a: T_B[T_B[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(CC_A(_))) => 0 
  case CC_C(CC_B(CC_B(_))) => 1 
}
}