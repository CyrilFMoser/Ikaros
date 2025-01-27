package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, (Boolean,Int)]
case class CC_B[F](a: Char) extends T_B[F, CC_A[Char]]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_B (CC_B (CC_B (CC_B (CC_A Byte (T_A Byte)) Wildcard Wildcard (T_A Byte))
//                  Wildcard
//                  (CC_A Byte (T_A Byte))
//                  (T_A Byte))
//            (Tuple Int Wildcard)
//            Wildcard
//            (T_A Byte))
//      Wildcard
//      Wildcard
//      (T_A Byte))