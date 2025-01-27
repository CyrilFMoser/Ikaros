package Program_31 

package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: Int, b: T_A[T_B], c: T_B) extends T_A[B]
case class CC_B[C]() extends T_A[C]
case class CC_C() extends T_A[Char]
case class CC_D[D](a: Boolean) extends T_B

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_B() => 1 
  case CC_A(_, CC_A(_, _, _), CC_D(_)) => 2 
  case CC_A(12, CC_A(_, _, _), _) => 3 
  case CC_A(12, _, _) => 4 
  case CC_A(12, CC_B(), _) => 5 
  case CC_A(12, CC_B(), CC_D(_)) => 6 
  case CC_A(_, CC_B(), CC_D(_)) => 7 
  case CC_A(_, CC_B(), _) => 8 
  case CC_A(12, _, CC_D(_)) => 9 
}
}
// This is not matched: (CC_A Char
//      Wildcard
//      (CC_A T_B
//            Int
//            (CC_A T_B
//                  Int
//                  (CC_B T_B (T_A T_B))
//                  (CC_D T_B Wildcard T_B)
//                  (T_A T_B))
//            Wildcard
//            (T_A T_B))
//      (CC_D T_B Wildcard T_B)
//      (T_A Char))
// This is not matched: (CC_A Char
//      Wildcard
//      (CC_A T_B
//            Int
//            (CC_A T_B
//                  Int
//                  (CC_B T_B (T_A T_B))
//                  (CC_D T_B Wildcard T_B)
//                  (T_A T_B))
//            Wildcard
//            (T_A T_B))
//      (CC_D T_B Wildcard T_B)
//      (T_A Char))