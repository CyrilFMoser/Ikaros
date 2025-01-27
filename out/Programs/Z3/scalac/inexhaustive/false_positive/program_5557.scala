package Program_15 

package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, D], b: C, c: T_A[D, D]) extends T_A[D, C]
case class CC_B[F, E, G](a: T_A[F, E], b: T_A[E, F], c: Char) extends T_A[F, E]
case class CC_C(a: (Char,Int), b: T_A[Byte, Boolean]) extends T_A[(Char,Byte), Char]

val v_a: CC_A[Boolean, CC_C] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 0 
  case CC_A(CC_B(_, _, _), _, CC_B(_, _, _)) => 1 
  case CC_A(CC_B(_, _, _), _, _) => 2 
  case CC_A(CC_A(_, _, _), _, _) => 3 
}
}
// This is not matched: (CC_A Boolean
//      (CC_C (T_A Boolean Boolean) Boolean Boolean)
//      (CC_B (CC_C (T_A Boolean Boolean) Boolean Boolean)
//            (CC_C (T_A Boolean Boolean) Boolean Boolean)
//            Boolean
//            Wildcard
//            Wildcard
//            Wildcard
//            (T_A (CC_C (T_A Boolean Boolean) Boolean Boolean)
//                 (CC_C (T_A Boolean Boolean) Boolean Boolean)))
//      Wildcard
//      Wildcard
//      (T_A (CC_C (T_A Boolean Boolean) Boolean Boolean) Boolean))
// This is not matched: Pattern match is empty without constants