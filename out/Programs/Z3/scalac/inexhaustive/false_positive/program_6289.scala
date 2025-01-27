package Program_14 

package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: Boolean, b: T_A[D], c: T_A[E]) extends T_A[D]
case class CC_B[F]() extends T_A[F]
case class CC_C(a: T_B[Boolean, Int], b: T_B[Boolean, Byte]) extends T_A[T_A[Byte]]
case class CC_D[G](a: CC_B[Int]) extends T_B[T_A[CC_C], G]
case class CC_E[H](a: Byte, b: T_B[H, H], c: Byte) extends T_B[T_A[CC_C], H]

val v_a: CC_A[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_A Boolean
//      Boolean
//      Wildcard
//      Wildcard
//      (CC_B Boolean (T_A Boolean))
//      (T_A Boolean))
// This is not matched: (CC_A Boolean
//      Boolean
//      Wildcard
//      Wildcard
//      (CC_B Boolean (T_A Boolean))
//      (T_A Boolean))