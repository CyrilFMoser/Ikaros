package Program_31 

package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C]) extends T_A[T_A[Int]]
case class CC_B[D](a: CC_A[D]) extends T_B[D]
case class CC_C[E](a: CC_B[E], b: (Boolean,Byte), c: Int) extends T_B[E]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A (T_A Int)
//      (CC_A (T_A Int) (CC_A Boolean Wildcard (T_A (T_A Int))) (T_A (T_A Int)))
//      (T_A (T_A Int)))
// This is not matched: (CC_C (CC_B Wildcard (CC_C Wildcard Wildcard T_A) T_A) Wildcard T_A)