package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B[E](a: E) extends T_A[CC_A[Int]]
case class CC_C[F](a: T_B[F, F], b: T_B[Boolean, F]) extends T_B[Boolean, F]
case class CC_D[G](a: T_B[Boolean, G]) extends T_B[Boolean, G]
case class CC_E[H]() extends T_B[Boolean, H]

val v_a: CC_D[Byte] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(_, _)) => 0 
  case CC_D(CC_D(CC_C(_, _))) => 1 
  case CC_D(CC_D(CC_D(_))) => 2 
  case CC_D(CC_D(CC_E())) => 3 
  case CC_D(CC_E()) => 4 
}
}