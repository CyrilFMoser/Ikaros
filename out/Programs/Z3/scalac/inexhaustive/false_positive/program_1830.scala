package Program_30 

package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, Int]
case class CC_B[F](a: F) extends T_B[F, CC_A[Boolean]]
case class CC_C[H, G, I](a: T_A[G, G]) extends T_B[G, H]

val v_a: T_B[Int, CC_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
  case CC_B(_) => 1 
  case CC_C(_) => 2 
}
}
// This is not matched: (CC_C (CC_A Boolean (T_A Boolean Boolean))
//      Int
//      Boolean
//      Wildcard
//      (T_B Int (CC_A Boolean (T_A Boolean Boolean))))
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_B)