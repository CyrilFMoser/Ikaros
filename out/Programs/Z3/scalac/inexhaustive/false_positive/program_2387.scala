package Program_31 

package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_B) extends T_A[T_B]

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A T_B Wildcard (T_A T_B))
// This is not matched: (CC_C Boolean Wildcard Wildcard (T_A Boolean (T_A Byte Int)))