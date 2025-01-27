package Program_31 

package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: B) extends T_A[B]
case class CC_B[D](a: CC_A[D, Byte]) extends T_A[D]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_)) => 1 
}
}
// This is not matched: (CC_A Char Boolean Wildcard (T_A Char))
// This is not matched: (CC_B (T_B Int)
//      (CC_A (CC_D Int Int Wildcard (T_B Int))
//            (CC_B Byte Wildcard Byte (T_A Byte))
//            (T_A (T_B Int)))
//      Wildcard
//      (T_A (T_B Int)))