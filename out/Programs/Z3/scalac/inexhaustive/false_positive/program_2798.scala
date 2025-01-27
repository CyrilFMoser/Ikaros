package Program_31 

package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A]) extends T_A
case class CC_B(a: Byte, b: (Char,CC_A)) extends T_A
case class CC_C(a: (Char,(Boolean,Int)), b: T_B[Boolean], c: CC_B) extends T_A
case class CC_D(a: Byte, b: (Char,Boolean)) extends T_B[CC_C]
case class CC_E[B, C](a: Boolean, b: Boolean, c: T_A) extends T_B[B]
case class CC_F(a: CC_D, b: Byte, c: T_B[CC_C]) extends T_B[CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_E(_, _, _)) => 0 
  case CC_B(_, _) => 1 
  case CC_C((_,(_,_)), CC_E(_, _, _), _) => 2 
  case CC_C(('x',(_,_)), _, CC_B(_, _)) => 3 
  case CC_C(_, _, CC_B(_, _)) => 4 
}
}
// This is not matched: (CC_A (CC_E T_A
//            T_A
//            Wildcard
//            Boolean
//            (CC_C Wildcard
//                  (CC_E Boolean
//                        T_A
//                        Boolean
//                        Wildcard
//                        (CC_A Wildcard T_A)
//                        (T_B Boolean))
//                  (CC_B Wildcard Wildcard T_A)
//                  T_A)
//            (T_B T_A))
//      T_A)
// This is not matched: Pattern match is empty without constants