package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B(a: T_A[T_A[Byte]]) extends T_A[Boolean]
case class CC_C(a: T_B[T_A[CC_B], (Int,CC_B)]) extends T_A[Boolean]
case class CC_D[E]() extends T_B[CC_C, E]
case class CC_E[F]() extends T_B[CC_C, F]
case class CC_F[G](a: (CC_B,(Byte,(Int,Int))), b: G, c: T_B[G, G]) extends T_B[CC_C, G]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B(CC_A())