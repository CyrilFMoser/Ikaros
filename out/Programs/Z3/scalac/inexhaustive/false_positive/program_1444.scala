package Program_29 

package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[E, C], b: Byte) extends T_A[C, D]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
  case CC_A(_, _) => 1 
}
}
// This is not matched: (CC_A Int Int Boolean Wildcard Wildcard (T_A Int Int))
// This is not matched: (CC_B Byte Wildcard Wildcard (T_A Byte))