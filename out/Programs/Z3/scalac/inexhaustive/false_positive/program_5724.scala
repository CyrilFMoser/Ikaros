package Program_13 

package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: C) extends T_A[B]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Char Boolean Wildcard (T_A Char))
// This is not matched: (CC_C T_B)