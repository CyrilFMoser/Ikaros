package Program_50 

package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: T_B[D]) extends T_A[D]
case class CC_C(a: Boolean, b: T_A[Char], c: CC_A[Byte]) extends T_A[T_B[Char]]
case class CC_D[E](a: Int) extends T_B[E]
case class CC_E[F, G](a: T_A[F], b: T_B[F]) extends T_B[F]
case class CC_F(a: CC_B[CC_C]) extends T_B[T_A[CC_C]]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(CC_B(CC_D(_)), CC_D(_)) => 1 
  case CC_E(CC_B(_), _) => 2 
  case CC_E(CC_B(_), CC_E(_, _)) => 3 
  case CC_E(_, CC_D(_)) => 4 
  case CC_E(CC_A(), _) => 5 
}
}
// This is not matched: (CC_E Boolean Boolean (CC_A Boolean (T_A Boolean)) Wildcard (T_B Boolean))
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_D(_)
// }
//
// This is not matched: (CC_E Boolean Boolean (CC_A Boolean (T_A Boolean)) Wildcard (T_B Boolean))
// Mutation information: 
// Expanded _ at position 3 into: 
// {
//  CC_A()
// }
//