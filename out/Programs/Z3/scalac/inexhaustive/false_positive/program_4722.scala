package Program_15 

package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A[B, C]() extends T_A[B]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Char Boolean (T_A Char))
// This is not matched: (CC_B Int Wildcard (T_A (T_A Boolean Char) Int))