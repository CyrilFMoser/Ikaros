package Program_30 

package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C]() extends T_A
case class CC_B(a: T_A, b: CC_A[T_A], c: T_B[Int, Boolean]) extends T_A
case class CC_C(a: T_B[T_A, CC_B], b: CC_A[Int], c: T_B[CC_B, Char]) extends T_A
case class CC_D[E, D](a: CC_B, b: T_B[E, E], c: T_A) extends T_B[E, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(CC_D(_, _, _), CC_A(), CC_D(_, _, _)) => 1 
  case CC_C(CC_D(_, _, _), _, CC_D(_, _, _)) => 2 
  case CC_C(CC_D(_, _, _), _, _) => 3 
  case CC_C(_, CC_A(), _) => 4 
  case CC_C(_, _, _) => 5 
  case CC_B(CC_B(_, _, _), CC_A(), CC_D(_, _, _)) => 6 
  case CC_B(CC_C(_, _, _), CC_A(), CC_D(_, _, _)) => 7 
  case CC_B(CC_A(), CC_A(), _) => 8 
  case CC_B(CC_A(), _, _) => 9 
  case CC_B(CC_B(_, _, _), _, _) => 10 
  case CC_B(CC_A(), CC_A(), CC_D(_, _, _)) => 11 
  case CC_B(_, _, _) => 12 
  case CC_B(CC_B(_, _, _), CC_A(), _) => 13 
}
}
// This is not matched: (CC_A T_A T_A)
// This is not matched: (CC_D T_B Wildcard Wildcard T_B)