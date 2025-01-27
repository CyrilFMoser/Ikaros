package Program_31 

package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B, b: Boolean) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard (T_A (T_A Byte)))
// This is not matched: (CC_A Int T_B Wildcard Wildcard (T_A Int T_B))