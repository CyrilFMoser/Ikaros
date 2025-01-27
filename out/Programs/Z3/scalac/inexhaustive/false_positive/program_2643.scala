package Program_30 

package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A[B, C]() extends T_A[B]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Boolean Boolean (T_A Boolean))
// This is not matched: (CC_A (T_B Char) (T_A (T_B Char)))