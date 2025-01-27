package Program_31 

package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A[B, C]() extends T_A[B]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Char Boolean (T_A Char))
// This is not matched: (CC_C Boolean Wildcard (T_B Boolean))