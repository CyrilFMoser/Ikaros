package Program_14 

package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_B[C, C], b: T_B[T_A, C], c: T_B[C, C]) extends T_A
case class CC_B(a: CC_A[Char], b: T_A) extends T_A
case class CC_C[D, E, F]() extends T_B[E, D]
case class CC_D[G, H]() extends T_B[G, H]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_C(), _, CC_D()) => 0 
  case CC_A(_, CC_D(), _) => 1 
  case CC_A(_, CC_C(), _) => 2 
  case CC_A(CC_D(), _, _) => 3 
  case CC_A(CC_D(), CC_D(), CC_C()) => 4 
  case CC_A(_, _, _) => 5 
  case CC_A(CC_D(), _, CC_D()) => 6 
  case CC_A(CC_D(), CC_C(), CC_C()) => 7 
  case CC_A(CC_C(), _, CC_C()) => 8 
  case CC_A(_, _, CC_D()) => 9 
  case CC_A(CC_C(), CC_D(), _) => 10 
  case CC_A(CC_C(), CC_C(), _) => 11 
  case CC_A(CC_C(), CC_D(), CC_D()) => 12 
  case CC_A(CC_D(), CC_C(), CC_D()) => 13 
  case CC_A(_, CC_D(), CC_D()) => 14 
  case CC_A(CC_C(), CC_D(), CC_C()) => 15 
  case CC_A(_, CC_C(), CC_C()) => 16 
  case CC_A(CC_D(), CC_D(), _) => 17 
  case CC_A(CC_C(), CC_C(), CC_C()) => 18 
  case CC_A(CC_C(), CC_C(), CC_D()) => 19 
  case CC_A(CC_D(), CC_D(), CC_D()) => 20 
  case CC_B(CC_A(_, _, _), CC_A(_, _, _)) => 21 
  case CC_B(_, _) => 22 
  case CC_B(_, CC_A(_, _, _)) => 23 
  case CC_B(_, CC_B(_, _)) => 24 
  case CC_B(CC_A(_, _, _), _) => 25 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_B T_A)