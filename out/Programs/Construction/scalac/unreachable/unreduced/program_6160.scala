package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: T_B[E, E]) extends T_A[E]
case class CC_C[F](a: T_A[T_A[F]]) extends T_B[F, CC_B[F]]
case class CC_D(a: T_A[T_B[Int, Boolean]], b: Byte, c: T_B[Int, CC_B[Int]]) extends T_B[Int, CC_B[Int]]

val v_a: T_B[Int, CC_B[Int]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A()) => 0 
  case CC_C(CC_B(_)) => 1 
  case CC_D(CC_A(), _, CC_C(CC_A())) => 2 
  case CC_D(CC_A(), _, CC_C(CC_B(_))) => 3 
  case CC_D(CC_A(), _, CC_D(_, _, _)) => 4 
  case CC_D(CC_B(_), _, CC_C(CC_A())) => 5 
  case CC_D(CC_B(_), _, CC_C(CC_B(_))) => 6 
  case CC_D(CC_B(_), _, CC_D(_, _, _)) => 7 
}
}