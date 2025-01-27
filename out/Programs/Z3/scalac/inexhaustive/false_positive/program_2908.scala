package Program_15 

package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: D) extends T_A[(T_B,T_B), C]

val v_a: T_A[(T_B,T_B), Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Int T_B Wildcard (T_A (Tuple T_B T_B) Int))
// This is not matched: (CC_A Wildcard
//      Wildcard
//      (Tuple (CC_A Wildcard (CC_A Wildcard Wildcard Wildcard T_A) Wildcard T_A)
//             (CC_B Wildcard Char Wildcard T_A))
//      T_A)