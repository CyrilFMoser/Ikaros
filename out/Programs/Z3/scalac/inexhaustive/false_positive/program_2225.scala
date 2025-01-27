package Program_31 

package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[C, E], b: Int, c: C) extends T_A[C, D]
case class CC_B() extends T_A[T_A[Char, Byte], T_A[Char, Int]]

val v_a: T_A[T_A[Char, Byte], T_A[Char, Int]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_A(_, _, _), _, _) => 1 
  case CC_A(CC_B(), 12, CC_A(_, _, _)) => 2 
  case CC_A(CC_A(_, _, _), 12, CC_A(_, _, _)) => 3 
  case CC_A(_, _, _) => 4 
  case CC_A(_, _, CC_A(_, _, _)) => 5 
  case CC_A(CC_B(), _, _) => 6 
  case CC_A(CC_B(), 12, _) => 7 
  case CC_A(CC_A(_, _, _), 12, _) => 8 
}
}
// This is not matched: (CC_A (T_A Char Int)
//      (T_A Char Byte)
//      Boolean
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A (T_A Char Byte) (T_A Char Int)))
// This is not matched: (CC_B (T_A (T_A Char Byte) (T_A Char Int)))