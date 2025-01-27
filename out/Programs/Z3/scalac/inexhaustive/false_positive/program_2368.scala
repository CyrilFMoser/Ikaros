package Program_30 

package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C]() extends T_A[D, C]
case class CC_B(a: T_A[T_B, T_B]) extends T_A[CC_A[T_B, T_B], CC_A[T_B, (Int,Char)]]
case class CC_C[E, F](a: F) extends T_A[E, F]
case class CC_D(a: (CC_B,CC_B), b: (CC_B,T_B), c: CC_C[CC_B, Byte]) extends T_B
case class CC_E(a: T_A[Boolean, CC_B], b: CC_C[CC_B, Byte], c: CC_B) extends T_B
case class CC_F[G](a: CC_B, b: Int) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_F(CC_B(_), _) => 0 
  case CC_D((CC_B(_),CC_B(_)), (CC_B(_),CC_F(_, _)), _) => 1 
  case CC_D(_, (CC_B(_),CC_E(_, _, _)), CC_C(_)) => 2 
  case CC_D(_, (CC_B(_),CC_E(_, _, _)), _) => 3 
  case CC_D((CC_B(_),CC_B(_)), (CC_B(_),CC_D(_, _, _)), CC_C(_)) => 4 
  case CC_D(_, (CC_B(_),CC_D(_, _, _)), _) => 5 
  case CC_D((CC_B(_),CC_B(_)), (CC_B(_),CC_F(_, _)), CC_C(_)) => 6 
  case CC_D(_, _, CC_C(_)) => 7 
  case CC_D((CC_B(_),CC_B(_)), (CC_B(_),CC_D(_, _, _)), _) => 8 
  case CC_D((CC_B(_),CC_B(_)), _, CC_C(_)) => 9 
  case CC_D(_, (CC_B(_),CC_F(_, _)), CC_C(_)) => 10 
  case CC_D(_, (CC_B(_),CC_F(_, _)), _) => 11 
  case CC_E(_, CC_C(_), _) => 12 
  case CC_E(CC_C(_), CC_C(_), CC_B(_)) => 13 
  case CC_E(_, CC_C(_), CC_B(_)) => 14 
  case CC_E(CC_A(), CC_C(_), _) => 15 
  case CC_E(CC_A(), CC_C(_), CC_B(_)) => 16 
  case CC_E(CC_C(_), _, _) => 17 
  case CC_E(_, _, CC_B(_)) => 18 
}
}
// This is not matched: (CC_F T_B Wildcard Wildcard T_B)
// This is not matched: (CC_B T_A)