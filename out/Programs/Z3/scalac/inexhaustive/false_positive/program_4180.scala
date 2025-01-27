package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_C[F]() extends T_B[F]
case class CC_D[G]() extends T_B[G]
case class CC_E(a: T_B[Byte]) extends T_B[T_A[Boolean, (Boolean,Byte)]]

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(CC_C()) => 0 
}
}
// This is not matched: (CC_A T_B Wildcard Wildcard Wildcard (T_A T_B T_B))