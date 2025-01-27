package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Char, b: T_A[T_A[Char]]) extends T_A[T_A[T_B[Boolean]]]
case class CC_B[C](a: T_B[C]) extends T_A[T_A[T_B[Boolean]]]
case class CC_C[D](a: Byte) extends T_A[T_A[T_B[Boolean]]]
case class CC_D[E]() extends T_B[E]
case class CC_E[F]() extends T_B[F]

val v_a: T_A[T_A[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
  case CC_A(_, _) => 1 
  case CC_B(_) => 2 
  case CC_C(0) => 3 
  case CC_C(_) => 4 
}
}