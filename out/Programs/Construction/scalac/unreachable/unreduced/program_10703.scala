package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_A[Boolean]) extends T_A[D]
case class CC_B[E](a: T_A[E]) extends T_A[E]
case class CC_C[F]() extends T_A[F]
case class CC_D[G](a: T_B[G, G]) extends T_B[G, CC_A[G]]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, CC_A(_, _))) => 0 
  case CC_B(CC_A(_, CC_B(_))) => 1 
  case CC_B(CC_A(_, CC_C())) => 2 
  case CC_B(CC_B(_)) => 3 
  case CC_B(CC_C()) => 4 
}
}