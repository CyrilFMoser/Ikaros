package Program_31 

package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: C, b: D) extends T_A[T_B, C]
case class CC_B(a: (T_B,T_B), b: Boolean, c: T_B) extends T_B

val v_a: T_A[T_B, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A Int T_B Wildcard Wildcard (T_A T_B Int))
// This is not matched: (CC_A Boolean Wildcard (T_A Int Int))