package Program_30 

package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_A[Int]) extends T_A[T_A[Boolean]]
case class CC_B() extends T_A[T_A[Boolean]]
case class CC_C(a: CC_A[CC_B], b: T_B[CC_B, CC_B]) extends T_A[T_A[Boolean]]
case class CC_D[E, F](a: Char) extends T_B[E, F]
case class CC_E[H, G](a: CC_A[H], b: CC_B) extends T_B[G, H]
case class CC_F[I, J, K](a: CC_A[J], b: T_B[K, K]) extends T_B[J, I]

val v_a: T_B[CC_C, CC_B] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_D('x') => 1 
  case CC_E(_, CC_B()) => 2 
  case CC_F(CC_A(_, _), _) => 3 
  case CC_F(CC_A(_, _), CC_F(_, _)) => 4 
  case CC_F(CC_A(_, _), CC_E(_, _)) => 5 
  case CC_F(_, _) => 6 
  case CC_F(_, CC_F(_, _)) => 7 
}
}
// This is not matched: (CC_F (CC_B (T_A (T_A Boolean)))
//      (CC_C Boolean Boolean Boolean)
//      Boolean
//      Wildcard
//      Wildcard
//      (T_B (CC_C Boolean Boolean Boolean) (CC_B (T_A (T_A Boolean)))))
// This is not matched: Pattern match is empty without constants