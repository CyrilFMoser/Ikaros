package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: (T_A[Boolean],T_A[Byte]), b: T_A[E], c: T_A[E]) extends T_A[E]
case class CC_C[F](a: (CC_A[Boolean],T_A[Byte])) extends T_A[F]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C((CC_A(),CC_A())) => 2 
  case CC_C((CC_A(),CC_B(_, _, _))) => 3 
  case CC_C((CC_A(),CC_C(_))) => 4 
}
}