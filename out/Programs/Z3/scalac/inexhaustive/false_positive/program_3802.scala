package Program_15 

package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: C, b: Int) extends T_A[C, T_A[C, C]]
case class CC_B() extends T_A[Int, T_A[Int, Int]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_A(_, 12) => 1 
  case CC_B() => 2 
}
}
// This is not matched: (CC_A Int Boolean Wildcard Wildcard (T_A Int (T_A Int Int)))
// This is not matched: Pattern match is empty without constants