package Program_31 

package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: CC_A, b: CC_A, c: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[B](a: T_A, b: CC_A, c: (CC_C,Boolean)) extends T_B[B]
case class CC_E[C, D](a: CC_B, b: CC_A) extends T_B[C]
case class CC_F[E](a: T_B[CC_C]) extends T_B[E]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_E(CC_B(_, _, _), CC_A(_)) => 0 
  case CC_E(CC_B(_, _, _), _) => 1 
  case CC_D(_, _, (CC_C(),_)) => 2 
  case CC_D(CC_B(_, _, _), _, (CC_C(),_)) => 3 
  case CC_D(CC_C(), _, (CC_C(),_)) => 4 
  case CC_D(_, CC_A(_), (CC_C(),_)) => 5 
  case CC_D(CC_B(_, _, _), CC_A(_), _) => 6 
  case CC_D(CC_A(_), CC_A(_), _) => 7 
  case CC_D(CC_C(), CC_A(_), _) => 8 
  case CC_D(CC_A(_), _, _) => 9 
  case CC_D(CC_C(), CC_A(_), (CC_C(),_)) => 10 
  case CC_D(CC_C(), _, _) => 11 
  case CC_D(_, _, _) => 12 
  case CC_F(_) => 13 
}
}
// This is not matched: (CC_E Char T_A Wildcard Wildcard (T_B Char))
// This is not matched: (CC_C Wildcard (CC_E Boolean Wildcard T_B) Wildcard T_A)