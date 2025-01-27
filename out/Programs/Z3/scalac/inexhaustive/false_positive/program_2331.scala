package Program_31 

package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[Int]) extends T_A[T_A[Int]]
case class CC_B(a: CC_A[Int], b: T_A[Boolean], c: Byte) extends T_A[CC_A[(Int,Int)]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _, _), _) => 0 
}
}
// This is not matched: (CC_A (T_A Int)
//      (CC_A Boolean Wildcard Wildcard (T_A (T_A Int)))
//      Wildcard
//      (T_A (T_A Int)))
// This is not matched: (CC_C Wildcard (Tuple (CC_A Byte T_A) (CC_B Wildcard Wildcard T_A)) T_B)