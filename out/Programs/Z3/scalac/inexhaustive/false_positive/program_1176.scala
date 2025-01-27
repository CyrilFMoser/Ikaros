package Program_31 

package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: C, b: Byte, c: T_A[Char]) extends T_A[C]
case class CC_B[E]() extends T_A[E]
case class CC_C(a: T_A[Int], b: Char, c: T_A[Byte]) extends T_A[CC_B[Char]]

val v_a: T_A[T_A[CC_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, _, CC_B()) => 1 
  case CC_A(CC_A(_, _, _), 0, CC_B()) => 2 
  case CC_A(CC_B(), _, CC_B()) => 3 
  case CC_A(CC_C(_, _, _), _, CC_A(_, _, _)) => 4 
  case CC_A(CC_C(_, _, _), _, CC_B()) => 5 
  case CC_A(CC_A(_, _, _), 0, CC_A(_, _, _)) => 6 
  case CC_A(CC_A(_, _, _), _, _) => 7 
  case CC_A(CC_A(_, _, _), _, CC_B()) => 8 
  case CC_A(CC_C(_, _, _), 0, CC_A(_, _, _)) => 9 
  case CC_A(CC_B(), _, _) => 10 
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 11 
  case CC_A(CC_A(_, _, _), 0, _) => 12 
  case CC_A(CC_C(_, _, _), _, _) => 13 
}
}
// This is not matched: (CC_A (T_A (CC_B Char Boolean))
//      Boolean
//      (CC_C (CC_A Int Boolean Int Wildcard (CC_B Char (T_A Char)) (T_A Int))
//            Char
//            (CC_A Byte Boolean Wildcard Byte (CC_B Char (T_A Char)) (T_A Byte))
//            (T_A (CC_B Char Boolean)))
//      Wildcard
//      Wildcard
//      (T_A (T_A (CC_B Char Boolean))))
// This is not matched: (CC_A Int Byte (T_A Int Byte))