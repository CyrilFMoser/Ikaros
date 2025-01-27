package Program_31 

package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_A,T_A)) extends T_A
case class CC_B() extends T_A
case class CC_C[B](a: Int, b: T_B[B], c: CC_B) extends T_A
case class CC_D[C](a: Int, b: Int) extends T_B[C]
case class CC_E() extends T_B[T_A]
case class CC_F() extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(12, _, CC_B()) => 1 
  case CC_C(12, _, _) => 2 
  case CC_C(12, CC_E(), _) => 3 
  case CC_C(_, CC_D(_, _), _) => 4 
  case CC_C(12, CC_F(), CC_B()) => 5 
  case CC_C(_, CC_F(), CC_B()) => 6 
  case CC_C(_, _, CC_B()) => 7 
  case CC_C(_, CC_F(), _) => 8 
  case CC_C(_, CC_E(), _) => 9 
  case CC_C(12, CC_D(_, _), CC_B()) => 10 
  case CC_A((CC_A(_),CC_C(_, _, _))) => 11 
  case CC_A((CC_C(_, _, _),CC_A(_))) => 12 
  case CC_A((CC_C(_, _, _),CC_B())) => 13 
  case CC_A((CC_C(_, _, _),CC_C(_, _, _))) => 14 
  case CC_A(_) => 15 
  case CC_A((CC_B(),CC_A(_))) => 16 
  case CC_A((CC_A(_),CC_B())) => 17 
}
}
// This is not matched: (CC_C T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_B T_A)