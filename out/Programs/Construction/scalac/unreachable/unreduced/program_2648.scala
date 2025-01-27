package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[T_B[Boolean, Char]]]
case class CC_B[D](a: CC_A, b: T_B[CC_A, D], c: D) extends T_A[T_A[T_B[Boolean, Char]]]
case class CC_C[E, F](a: CC_A) extends T_B[F, E]
case class CC_D[G, H](a: T_B[G, H]) extends T_B[G, H]
case class CC_E[I, J](a: T_A[I], b: I) extends T_B[I, J]

val v_a: T_B[T_A[T_A[T_B[Boolean, Char]]], Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_A()) => 0 
  case CC_D(CC_C(CC_A())) => 1 
  case CC_D(CC_D(CC_C(_))) => 2 
  case CC_D(CC_D(CC_D(_))) => 3 
  case CC_D(CC_D(CC_E(_, _))) => 4 
  case CC_D(CC_E(_, _)) => 5 
  case CC_E(_, CC_A()) => 6 
  case CC_E(_, CC_B(CC_A(), _, _)) => 7 
}
}