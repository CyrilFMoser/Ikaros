package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C]() extends T_A[C, D]
case class CC_B[G, F](a: T_A[F, F], b: T_A[F, F]) extends T_A[F, G]

val v_a: CC_B[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), _) => 0 
}
}
// This is not matched: (CC_B Int
//      Wildcard
//      (CC_A Int Int Boolean (T_A Int Int))
//      Wildcard
//      (T_A Int (T_A Int Int)))