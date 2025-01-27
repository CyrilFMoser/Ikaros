package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: E) extends T_A[E]
case class CC_C[F]() extends T_B[F, CC_A[Int]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, 0) => 1 
}
}
// This is not matched: (CC_A Int
//      Boolean
//      Wildcard
//      (CC_A Int Int Int (CC_B Int Int Wildcard (T_A Int Int)) (T_A Int Int))
//      (T_A Int Boolean))