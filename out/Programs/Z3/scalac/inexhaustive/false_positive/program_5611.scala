package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D]() extends T_A[E, D]
case class CC_B[G, F](a: T_A[F, F], b: T_B[F]) extends T_A[F, G]
case class CC_C() extends T_B[T_A[Int, Boolean]]

val v_a: CC_B[CC_C, Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _), _) => 0 
}
}
// This is not matched: (CC_B (CC_D (T_A Boolean) Boolean)
//      (CC_A Char (T_A Char))
//      (CC_B (CC_D Boolean Boolean)
//            (CC_A Char (T_A Char))
//            (CC_B (CC_D Boolean Boolean)
//                  (CC_A Char (T_A Char))
//                  Wildcard
//                  (T_A (CC_D Boolean Boolean)))
//            (T_A (CC_D Boolean Boolean)))
//      (T_A (CC_D (T_A Boolean) Boolean)))