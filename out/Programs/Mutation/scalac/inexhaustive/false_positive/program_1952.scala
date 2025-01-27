package Program_25 

package Program_27 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B[A](a: A) extends T_A
case class CC_C(a: T_A, b: CC_A, c: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_A() => 1 
  case CC_C(CC_A(), CC_A(), _) => 2 
  case CC_C(CC_A(), _, CC_A()) => 3 
  case CC_C(_, _, CC_C(_, _, CC_C(_, _, _))) => 4 
  case CC_C(_, _, CC_C(_, _, CC_B(_))) => 4 
  case CC_C(_, _, CC_C(_, _, CC_A())) => 4 
  case CC_C(_, CC_A(), CC_B(_)) => 5 
  case CC_C(_, _, CC_A()) => 6 
  case CC_C(CC_C(_, _, _), _, _) => 7 
  case CC_C(_, _, CC_B(_)) => 8 
}
}
// This is not matched: (CC_C (CC_B T_A Wildcard T_A) Wildcard (CC_B Boolean Boolean T_A) T_A)
// Mutation information: 
// Expanded _ at position 4 into: 
// {
//  CC_A()
//  CC_B(_)
//  CC_C(_, _, _)
// }
//
// This is not matched: (CC_C (CC_B T_A Wildcard T_A) Wildcard (CC_B Boolean Boolean T_A) T_A)
// Mutation information: 
// Expanded _ at position 5 into: 
// {
//  CC_A()
//  CC_B(_)
//  CC_C(_, _, _)
// }
//