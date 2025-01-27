package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_C[F](a: T_B[Char, F], b: T_A[F]) extends T_A[F]
case class CC_D[G]() extends T_B[G, T_A[Boolean]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, CC_C(_, _)) => 1 
}
}
// This is not matched: (CC_C Boolean Wildcard Boolean Char (T_A Boolean Boolean))