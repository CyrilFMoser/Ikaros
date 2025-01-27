package Program_31 

package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Boolean (T_A Boolean))
// This is not matched: (CC_B Char Wildcard (T_A (T_A Char Char) Char))