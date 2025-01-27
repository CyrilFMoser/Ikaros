package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: T_B[Int, (CC_A,Boolean)]) extends T_A[T_A[T_A[Boolean]]]
case class CC_C[D, E](a: CC_B) extends T_B[D, E]
case class CC_D[F, G](a: T_B[G, F], b: T_A[G]) extends T_B[F, G]

val v_a: T_B[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_)) => 0 
  case CC_D(CC_D(_, _), _) => 1 
}
}
// This is not matched: CC_D(CC_C(_), _)