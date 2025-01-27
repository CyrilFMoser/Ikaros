package Program_28 

package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: B) extends T_A[B]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Char Boolean Wildcard (T_A Char))
// This is not matched: (CC_A Wildcard Wildcard T_A)