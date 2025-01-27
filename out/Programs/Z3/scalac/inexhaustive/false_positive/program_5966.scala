package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Byte,(Byte,Char))) extends T_A[C, (Byte,Char)]
case class CC_B() extends T_A[CC_A[(Int,Byte)], (Byte,Char)]

val v_a: CC_A[CC_B] = null
val v_b: Int = v_a match{
  case CC_A((0,_)) => 0 
}
}
// This is not matched: (CC_B Wildcard
//      (Tuple (CC_F (CC_D (CC_A Char Wildcard Wildcard T_A)
//                         Wildcard
//                         Wildcard
//                         T_B)
//                   T_B)
//             Wildcard)
//      Wildcard
//      T_A)