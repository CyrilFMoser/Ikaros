package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[Char], b: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]
case class CC_B[E, D](a: Int) extends T_B[D, E]
case class CC_C[F, G](a: T_B[F, F], b: F, c: G) extends T_B[F, G]

val v_a: T_B[Boolean, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_B(_), _, CC_A(_, _)) => 2 
  case CC_C(CC_C(_, _, _), _, CC_A(_, _)) => 3 
}
}