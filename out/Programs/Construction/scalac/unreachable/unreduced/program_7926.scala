package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Boolean, Int]], b: T_A[T_A[Byte]]) extends T_A[T_A[Char]]
case class CC_B[D, E](a: CC_A) extends T_B[D, E]
case class CC_C[F](a: CC_B[F, F]) extends T_B[F, Byte]
case class CC_D[G](a: T_B[G, G], b: (CC_C[Boolean],Int)) extends T_B[G, Byte]

val v_a: T_B[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_D(CC_B(CC_A(_, _)), _) => 1 
}
}
// This is not matched: CC_C(CC_B(CC_A(_, _)))