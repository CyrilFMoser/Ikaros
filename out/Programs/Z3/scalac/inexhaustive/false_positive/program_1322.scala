package Program_31 

package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[Byte, E], b: T_A[D, E], c: E) extends T_A[D, E]
case class CC_B[F, G]() extends T_A[F, G]
case class CC_C[I, H]() extends T_A[I, H]
case class CC_D(a: ((Byte,Char),Boolean), b: T_A[Char, (Boolean,Boolean)]) extends T_B[CC_B[Boolean, Byte]]
case class CC_E[J, K](a: CC_C[J, K], b: Int, c: (CC_D,Char)) extends T_B[J]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_E(_, _, (CC_D(_, _),_)) => 0 
  case CC_E(_, _, (CC_D(_, _),'x')) => 1 
  case CC_E(CC_C(), 12, (CC_D(_, _),'x')) => 2 
  case CC_E(CC_C(), 12, (CC_D(_, _),_)) => 3 
  case CC_E(CC_C(), _, (CC_D(_, _),'x')) => 4 
  case CC_E(_, 12, (CC_D(_, _),_)) => 5 
  case CC_E(_, 12, (CC_D(_, _),'x')) => 6 
}
}
// This is not matched: (CC_E Boolean
//      (CC_D (T_A Boolean (T_A Boolean Boolean))
//            (T_A Boolean Boolean)
//            (T_A Boolean Boolean))
//      (CC_C Boolean
//            (CC_D (T_A Boolean Boolean)
//                  (T_A Boolean Boolean)
//                  (T_A Boolean Boolean))
//            (T_A Boolean
//                 (CC_D (T_A Boolean Boolean)
//                       (T_A Boolean Boolean)
//                       (T_A Boolean Boolean))))
//      Wildcard
//      Wildcard
//      (T_B Boolean))
// This is not matched: (CC_C T_B)