package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_C[E]() extends T_A[E]
case class CC_D[F](a: T_A[F]) extends T_B[F]

val v_a: CC_D[Char] = null
val v_b: Int = v_a match{
  case CC_D(CC_A()) => 0 
}
}
// This is not matched: (CC_B (CC_C (CC_A Byte (T_A Byte))
//            (CC_D (CC_A T_B (T_A T_B)) Wildcard Wildcard T_B)
//            Wildcard
//            T_B)
//      Wildcard
//      Wildcard
//      T_B)