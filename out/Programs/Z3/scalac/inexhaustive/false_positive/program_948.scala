package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[F, E]
case class CC_C[H](a: T_B[H, H], b: H) extends T_B[CC_A[Char, Boolean], H]

val v_a: T_B[CC_A[Char, Boolean], Int] = null
val v_b: Int = v_a match{
  case CC_C(_, 12) => 0 
}
}
// This is not matched: (CC_B Int
//      (CC_A Int Int (T_A Int Int))
//      Wildcard
//      (T_B (CC_A Char Boolean Boolean) Int))