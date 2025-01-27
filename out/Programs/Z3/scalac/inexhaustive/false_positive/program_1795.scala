package Program_31 

package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: C, b: B) extends T_A[B]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
  case CC_A(_, _) => 1 
}
}
// This is not matched: (CC_A Char Boolean Wildcard Wildcard (T_A Char))
// This is not matched: (CC_A T_B
//      (CC_B Wildcard
//            (CC_A T_B (CC_D Int Wildcard Wildcard T_B) Wildcard (T_A T_B))
//            Wildcard
//            T_B)
//      Wildcard
//      (T_A T_B))