package Program_37 

package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_A) extends T_A
case class CC_B(a: (CC_A,T_A), b: T_A) extends T_A
case class CC_C(a: CC_A) extends T_B[T_A]
case class CC_D[B](a: CC_C, b: B) extends T_B[T_A]
case class CC_E[C]() extends T_B[C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_E(), CC_B(_, _)) => 0 
  case CC_A(CC_C(_), CC_A(_, _)) => 1 
  case CC_A(CC_C(_), _) => 2 
  case CC_A(CC_D(_, _), _) => 3 
  case CC_A(_, CC_A(CC_D(_, _), _)) => 4 
  case CC_A(_, CC_A(CC_C(_), _)) => 4 
  case CC_A(CC_E(), _) => 5 
  case CC_B((CC_A(_, _),CC_B(_, _)), CC_A(_, _)) => 6 
  case CC_B(_, CC_B(_, _)) => 7 
  case CC_B((CC_A(_, _),CC_B(_, _)), _) => 8 
  case CC_B(_, CC_A(_, _)) => 9 
}
}
// This is not matched: (CC_A (CC_D T_A
//            (CC_C (CC_A Wildcard Wildcard T_A) (T_B T_A))
//            Wildcard
//            (T_B T_A))
//      (CC_B Wildcard Wildcard T_A)
//      T_A)
// Mutation information: 
// Expanded _ at position 4 into: 
// {
//  CC_C(_)
//  CC_D(_, _)
// }
//
// This is not matched: (CC_A (CC_D T_A
//            (CC_C (CC_A Wildcard Wildcard T_A) (T_B T_A))
//            Wildcard
//            (T_B T_A))
//      (CC_B Wildcard Wildcard T_A)
//      T_A)
// Mutation information: 
// Expanded _ at position 9 into: 
// {
//  CC_C(_)
// }
//