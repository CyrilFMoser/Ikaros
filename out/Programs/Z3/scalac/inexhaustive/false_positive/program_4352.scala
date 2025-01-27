package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C]() extends T_A[D, C]
case class CC_B[E, F](a: T_A[F, Boolean]) extends T_A[E, F]

val v_a: CC_B[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
}
}
// This is not matched: (CC_B (CC_C Wildcard
//            Wildcard
//            (CC_B (CC_C Wildcard Wildcard Wildcard T_B) Wildcard T_B)
//            T_B)
//      Wildcard
//      T_B)