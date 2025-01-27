package Program_15 

package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C, E](a: T_B, b: T_A[C, C], c: T_A[C, C]) extends T_A[C, D]
case class CC_B[F, G](a: G, b: CC_A[G, G, G], c: G) extends T_A[F, G]

val v_a: CC_A[T_B, Char, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_B(_, _, _)) => 0 
  case CC_A(_, CC_A(_, _, _), CC_B(_, _, _)) => 1 
  case CC_A(_, CC_B(_, _, _), CC_B(_, _, _)) => 2 
  case CC_A(_, _, CC_A(_, _, _)) => 3 
  case CC_A(_, CC_A(_, _, _), _) => 4 
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 5 
}
}
// This is not matched: (CC_A T_B
//      Char
//      Char
//      Wildcard
//      (CC_B Char Char Char Wildcard Char (T_A Char Char))
//      (CC_A Char
//            Char
//            T_B
//            Wildcard
//            (CC_A Char
//                  Char
//                  T_B
//                  Wildcard
//                  Wildcard
//                  (CC_B Char Char Char Wildcard Wildcard (T_A Char Char))
//                  (T_A Char Char))
//            (CC_B Char
//                  Char
//                  Wildcard
//                  (CC_A Char
//                        Char
//                        Char
//                        Wildcard
//                        Wildcard
//                        Wildcard
//                        (T_A Char Char))
//                  Char
//                  (T_A Char Char))
//            (T_A Char Char))
//      (T_A Char T_B))
// This is not matched: (CC_E (CC_B T_A) Wildcard Wildcard T_B)