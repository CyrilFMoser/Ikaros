package Program_14 

package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: T_B[D], b: T_A[C]) extends T_A[C]
case class CC_B[E](a: E, b: CC_A[Byte, E], c: (Boolean,Int)) extends T_A[E]
case class CC_C[F](a: T_A[F]) extends T_B[F]
case class CC_D[G]() extends T_B[G]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B('x', CC_A(_, _), (_,12)) => 0 
  case CC_B(_, CC_A(_, _), (_,_)) => 1 
  case CC_B('x', CC_A(_, _), (_,_)) => 2 
  case CC_B('x', CC_A(_, _), _) => 3 
  case CC_A(_, CC_B(_, _, _)) => 4 
  case CC_A(CC_C(_), _) => 5 
  case CC_A(CC_D(), _) => 6 
}
}
// This is not matched: (CC_A Char
//      Byte
//      (CC_C Byte
//            (CC_B Byte
//                  Byte
//                  (CC_A Byte Byte Wildcard Wildcard (T_A Byte))
//                  Wildcard
//                  (T_A Byte))
//            (T_B Byte))
//      (CC_A Char
//            Boolean
//            Wildcard
//            (CC_A Char Boolean (CC_D Boolean (T_B Boolean)) Wildcard (T_A Char))
//            (T_A Char))
//      (T_A Char))
// This is not matched: (CC_B T_A)