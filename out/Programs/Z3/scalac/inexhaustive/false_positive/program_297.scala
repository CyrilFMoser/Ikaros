package Program_31 

package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Char) extends T_A[C, D]
case class CC_B[E, F, G](a: CC_A[E, F], b: CC_A[E, E], c: T_A[E, E]) extends T_A[E, F]

val v_a: CC_B[Char, Int, Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_), _, CC_B(_, _, _)) => 0 
  case CC_B(_, _, CC_B(_, _, _)) => 1 
  case CC_B(_, CC_A(_), CC_A(_)) => 2 
}
}
// This is not matched: (CC_B Char
//      Int
//      Byte
//      Wildcard
//      Wildcard
//      (CC_B Char
//            Char
//            Boolean
//            Wildcard
//            (CC_A Char Char Wildcard (T_A Char Char))
//            Wildcard
//            (T_A Char Char))
//      (T_A Char Int))
// This is not matched: (CC_A Wildcard Wildcard T_A)