package Program_31 

package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: B) extends T_A[B]
case class CC_B[D](a: T_A[D], b: D) extends T_A[D]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _) => 1 
  case CC_B(CC_B(_, _), _) => 2 
  case CC_B(CC_B(_, _), 12) => 3 
  case CC_B(_, 12) => 4 
}
}
// This is not matched: (CC_A Int Boolean Wildcard (T_A Int))
// This is not matched: (CC_C (T_A T_B))