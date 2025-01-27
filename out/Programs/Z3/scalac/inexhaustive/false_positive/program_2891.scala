package Program_15 

package Program_13 

object Test {
sealed trait T_A
case class CC_A[A]() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A T_A T_A)
// This is not matched: (CC_A Wildcard (T_A (T_A Char)))