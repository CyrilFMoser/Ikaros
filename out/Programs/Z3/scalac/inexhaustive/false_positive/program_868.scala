package Program_30 

package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[C, E], b: (Char,Char), c: Char) extends T_A[C, D]

val v_a: CC_A[Int, Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), (_,'x'), 'x') => 0 
  case CC_A(_, ('x','x'), _) => 1 
  case CC_A(CC_A(_, _, _), ('x','x'), _) => 2 
  case CC_A(_, (_,'x'), 'x') => 3 
  case CC_A(CC_A(_, _, _), (_,_), _) => 4 
}
}
// This is not matched: (CC_A Int
//      Byte
//      Char
//      (CC_A Char
//            Byte
//            Boolean
//            Wildcard
//            (Tuple Wildcard Wildcard)
//            Wildcard
//            (T_A Byte Char))
//      Wildcard
//      Wildcard
//      (T_A Byte Int))
// This is not matched: (CC_B Wildcard Wildcard T_A)