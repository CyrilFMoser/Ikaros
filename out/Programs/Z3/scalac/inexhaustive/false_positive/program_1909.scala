package Program_31 

package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (Int,Boolean), b: T_B[D, Int], c: (Char,Byte)) extends T_A[D]
case class CC_B[E, F](a: (Byte,Boolean), b: T_B[E, F], c: CC_A[F]) extends T_A[E]
case class CC_C[G, H](a: (Int,(Byte,Boolean))) extends T_B[H, G]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(_), ('x',_)) => 0 
  case CC_A((_,_), CC_C(_), (_,_)) => 1 
  case CC_A((12,_), _, ('x',0)) => 2 
  case CC_A((_,_), CC_C(_), ('x',_)) => 3 
  case CC_A((_,_), CC_C(_), ('x',0)) => 4 
  case CC_A((12,_), CC_C(_), ('x',0)) => 5 
  case CC_B((_,_), CC_C(_), _) => 6 
  case CC_B((0,_), CC_C(_), CC_A(_, _, _)) => 7 
  case CC_B((_,_), CC_C(_), CC_A(_, _, _)) => 8 
  case CC_B(_, CC_C(_), _) => 9 
  case CC_B(_, CC_C(_), CC_A(_, _, _)) => 10 
  case CC_B((_,_), _, CC_A(_, _, _)) => 11 
  case CC_B((_,_), _, _) => 12 
  case CC_B((0,_), CC_C(_), _) => 13 
}
}
// This is not matched: (CC_B Int
//      (T_A (CC_A (CC_B Boolean Boolean (T_A Boolean) Boolean Boolean Boolean)
//                 Boolean
//                 Boolean
//                 Boolean
//                 Boolean))
//      Wildcard
//      Wildcard
//      (CC_A (T_A (CC_A (CC_B Boolean
//                             Boolean
//                             (T_A Boolean)
//                             Boolean
//                             Boolean
//                             Boolean)
//                       Boolean
//                       Boolean
//                       Boolean
//                       Boolean))
//            Wildcard
//            (CC_C Int
//                  (T_A (CC_A (CC_B Boolean
//                                   Boolean
//                                   Boolean
//                                   Boolean
//                                   Boolean
//                                   Boolean)
//                             Boolean
//                             Boolean
//                             Boolean
//                             Boolean))
//                  Wildcard
//                  (T_B (T_A (CC_A (CC_B Boolean
//                                        Boolean
//                                        Boolean
//                                        Boolean
//                                        Boolean
//                                        Boolean)
//                                  Boolean
//                                  Boolean
//                                  Boolean
//                                  Boolean))
//                       Int))
//            Wildcard
//            (T_A (T_A (CC_A (CC_B Boolean
//                                  Boolean
//                                  (T_A Boolean)
//                                  Boolean
//                                  Boolean
//                                  Boolean)
//                            Boolean
//                            Boolean
//                            Boolean
//                            Boolean))))
//      (T_A Int))
// This is not matched: Pattern match is empty without constants