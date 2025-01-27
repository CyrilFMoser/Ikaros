package Program_30 

package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[E, C], b: Byte) extends T_A[C, D]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
}
}
// This is not matched: (CC_A Int Int Boolean Wildcard Wildcard (T_A Int Int))
// This is not matched: (CC_B Byte Wildcard Wildcard (T_A Byte))