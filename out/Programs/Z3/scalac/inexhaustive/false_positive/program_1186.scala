package Program_31 

package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: C) extends T_A[B]
case class CC_B[D, E](a: ((Byte,Byte),Char)) extends T_A[D]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(((_,_),_)) => 1 
}
}
// This is not matched: (CC_B Boolean Boolean Wildcard (T_A Boolean))
// This is not matched: (CC_B (CC_A (CC_A (CC_C Wildcard T_A) Char T_A) Char T_A)
//      Wildcard
//      (CC_A (CC_B (CC_A Wildcard Wildcard T_A) Wildcard (CC_C Wildcard T_A) T_A)
//            Char
//            T_A)
//      T_A)