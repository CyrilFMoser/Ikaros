package Program_31 

package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Byte, T_A]) extends T_A
case class CC_B[D, C, E](a: T_B[C, C]) extends T_B[D, C]
case class CC_C[F, G](a: CC_B[T_A, F, G], b: CC_A, c: T_B[G, G]) extends T_B[F, G]

val v_a: T_B[Boolean, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
  case CC_B(CC_C(_, _, _)) => 1 
  case CC_C(_, _, CC_B(_)) => 2 
  case CC_C(_, CC_A(_), _) => 3 
  case CC_C(CC_B(_), CC_A(_), CC_C(_, _, _)) => 4 
  case CC_C(CC_B(_), CC_A(_), CC_B(_)) => 5 
  case CC_C(_, CC_A(_), CC_B(_)) => 6 
  case CC_C(CC_B(_), _, _) => 7 
  case CC_C(_, _, CC_C(_, _, _)) => 8 
}
}
// This is not matched: (CC_B Boolean
//      (CC_A (CC_A T_A T_A) (CC_A T_A T_A))
//      T_A
//      Wildcard
//      (T_B Boolean (CC_A (CC_A T_A T_A) (CC_A T_A T_A))))
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_A)