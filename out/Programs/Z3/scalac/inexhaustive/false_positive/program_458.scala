package Program_31 

package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: T_A[D, D], b: T_A[Int, D], c: T_A[D, D]) extends T_A[C, D]
case class CC_B[F, E, G](a: CC_A[E, E], b: (Boolean,Boolean)) extends T_A[F, E]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_A(CC_B(_, _), _, CC_A(_, _, _)) => 1 
  case CC_A(_, _, CC_B(_, _)) => 2 
  case CC_A(CC_A(_, _, _), _, _) => 3 
}
}
// This is not matched: (CC_A Char
//      Byte
//      (CC_B Char Char (T_A Boolean Boolean) Wildcard Wildcard (T_A Char Char))
//      Wildcard
//      (CC_B Char
//            Char
//            (CC_B Boolean Boolean Boolean Boolean Boolean Boolean)
//            Wildcard
//            Wildcard
//            (T_A Char Char))
//      (T_A Byte Char))
// This is not matched: Pattern match is empty without constants