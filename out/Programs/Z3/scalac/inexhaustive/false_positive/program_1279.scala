package Program_31 

package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B, b: (Int,Boolean)) extends T_A[B]
case class CC_B[C, D](a: D, b: D) extends T_A[C]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_A(_, (_,_)) => 1 
}
}
// This is not matched: (CC_B Int Boolean Wildcard Wildcard (T_A Int))
// This is not matched: (CC_A Boolean Wildcard Wildcard (T_A (T_A Int)))