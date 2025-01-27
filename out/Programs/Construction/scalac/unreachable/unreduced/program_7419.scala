package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E]) extends T_A[E, T_B[T_B[Boolean, Int], T_B[Boolean, Int]]]
case class CC_B[F]() extends T_B[CC_A[F], F]
case class CC_C[G](a: T_B[CC_A[G], G], b: Boolean, c: T_B[G, G]) extends T_B[CC_A[G], G]
case class CC_D[H](a: H) extends T_B[CC_A[H], H]

val v_a: T_B[CC_A[Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B(), _, _) => 1 
  case CC_C(CC_C(CC_B(), _, _), _, _) => 2 
  case CC_C(CC_C(CC_D(_), _, _), _, _) => 3 
  case CC_C(CC_D(_), _, _) => 4 
  case CC_D(_) => 5 
}
}
// This is not matched: CC_C(CC_C(CC_C(_, _, _), _, _), _, _)