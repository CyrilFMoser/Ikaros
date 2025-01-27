package Program_31 

package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[C, E], b: (Char,Char), c: Char) extends T_A[C, D]

val v_a: CC_A[Int, Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_A(_, _, _), ('x',_), 'x') => 1 
  case CC_A(CC_A(_, _, _), (_,_), 'x') => 2 
}
}
// This is not matched: (CC_A Int
//      Byte
//      Char
//      (CC_A Char
//            Byte
//            Boolean
//            (CC_A Boolean
//                  Byte
//                  Boolean
//                  Wildcard
//                  Wildcard
//                  Wildcard
//                  (T_A Byte Boolean))
//            Wildcard
//            Char
//            (T_A Byte Char))
//      Wildcard
//      Wildcard
//      (T_A Byte Int))
// This is not matched: (CC_B Wildcard Wildcard T_A)