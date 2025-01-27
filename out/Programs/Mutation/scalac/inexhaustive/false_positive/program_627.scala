package Program_62 

package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A]) extends T_A
case class CC_B(a: CC_A, b: CC_A, c: Int) extends T_A
case class CC_C[B](a: CC_A, b: (T_A,Int)) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), CC_A(_), 12) => 2 
  case CC_B(_, CC_A(_), _) => 3 
  case CC_B(CC_A(_), _, 12) => 4 
  case CC_C(_, (CC_C(_, _),_)) => 5 
  case CC_C(_, (CC_A(_),_)) => 6 
  case CC_C(_, _) => 7 
  case CC_C(CC_A(_), (CC_C(_, _),_)) => 8 
  case CC_C(CC_A(_), (CC_C(_, _),12)) => 9 
  case CC_C(_, (CC_A(_),12)) => 10 
}
}
// This is not matched: (CC_C T_A Wildcard Wildcard T_A)
// Mutation information: 
// Deleted Pattern CC_B(CC_A(_), _, _) at position 1
// This is not matched: (CC_B Wildcard Wildcard Wildcard T_A)
// Mutation information: 
// Deleted Pattern CC_C(_, (CC_C(_, _),12)) at position 1