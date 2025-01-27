package Program_15 

package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E]() extends T_A[D, C]
case class CC_B[F](a: F, b: T_A[F, F], c: CC_A[F, F, F]) extends T_A[F, T_A[F, F]]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(), CC_A()) => 0 
  case CC_B(_, CC_A(), _) => 1 
}
}
// This is not matched: (CC_B Int
//      Wildcard
//      (CC_A Int Int Boolean (T_A Int Int))
//      Wildcard
//      (T_A Int (T_A Int Int)))
// This is not matched: (CC_B Int
//      Wildcard
//      (CC_A Int Int Boolean (T_A Int Int))
//      Wildcard
//      (T_A Int (T_A Int Int)))