package Program_15 

package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E]() extends T_A[C, D]

val v_a: T_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Boolean Char Boolean (T_A Boolean Char))
// This is not matched: (CC_B Char (CC_A Char Wildcard (T_A Char)) Wildcard (T_A Char))