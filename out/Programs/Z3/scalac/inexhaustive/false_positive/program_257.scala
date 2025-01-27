package Program_31 

package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D, E](a: (Int,Boolean), b: T_A[E]) extends T_A[D]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,_), _) => 1 
  case CC_B((12,_), CC_A()) => 2 
  case CC_B(_, _) => 3 
  case CC_B((12,_), _) => 4 
  case CC_B(_, CC_A()) => 5 
  case CC_B(_, CC_B(_, _)) => 6 
}
}
// This is not matched: (CC_B Char Boolean Wildcard Wildcard (T_A Char))
// This is not matched: (CC_C Boolean (T_B Boolean))