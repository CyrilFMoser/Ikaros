package Program_31 

package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[Int, D], b: (Byte,Boolean), c: C) extends T_A[C, D]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_A(CC_A(_, _, _), _, 0) => 1 
}
}
// This is not matched: (CC_A Byte Int Boolean Wildcard Wildcard Wildcard (T_A Byte Int))
// This is not matched: (CC_B Boolean (T_A Boolean))