package Program_31 

package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: Boolean, b: (Byte,Boolean)) extends T_A[C, D]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_A(_, (0,_)) => 1 
}
}
// This is not matched: (CC_A Int Int Boolean Wildcard Wildcard (T_A Int Int))
// This is not matched: (CC_A Wildcard (CC_B T_A) Wildcard T_A)