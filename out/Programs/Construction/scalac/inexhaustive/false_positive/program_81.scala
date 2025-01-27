package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_C[F]() extends T_B[T_B[F, Byte], F]
case class CC_D[G](a: T_B[G, G], b: T_B[T_B[CC_A[CC_C[Boolean]], Byte], CC_A[CC_C[Boolean]]]) extends T_B[T_B[G, Byte], G]

val v_a: T_B[T_B[Boolean, Byte], Boolean] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, CC_D(_, _)) => 1 
}
}
// This is not matched: CC_A(CC_D(CC_C(_), CC_A(_, _)), CC_A(CC_D(_, _), CC_C(_)))