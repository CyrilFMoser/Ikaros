package Program_63 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (Byte,Byte)) extends T_A[T_A[Byte, Int], T_A[Boolean, Char]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((_,0)) => 0 
}
}
// This is not matched: (CC_D Char
//      Char
//      Wildcard
//      (CC_D Char
//            Char
//            (CC_C Char Char (T_B Char Char))
//            Wildcard
//            (CC_C Char (Tuple Int Char) (T_B Char (Tuple Int Char)))
//            (T_B Char Char))
//      (CC_D Char
//            (Tuple Int Char)
//            Wildcard
//            (CC_C Char Char (T_B Char Char))
//            Wildcard
//            (T_B Char (Tuple Int Char)))
//      (T_B Char Char))
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_C()
//  CC_D(_, _, _)
// }
//