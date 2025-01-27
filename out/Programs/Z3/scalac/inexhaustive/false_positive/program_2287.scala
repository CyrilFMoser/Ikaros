package Program_31 

package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[Char, C], b: D, c: C) extends T_A[D, C]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(_, _, _) => 1 
}
}
// This is not matched: (CC_A Boolean Int Boolean Wildcard Wildcard Wildcard (T_A Int Boolean))
// This is not matched: (CC_D Wildcard
//      (CC_C Char Byte (T_A Char Byte))
//      (T_B (CC_C Int Boolean Boolean)))