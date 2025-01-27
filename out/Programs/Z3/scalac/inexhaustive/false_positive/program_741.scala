package Program_30 

package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, C], b: D) extends T_A[T_A[C, C], C]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A Int Boolean Wildcard Wildcard (T_A (T_A Int Int) Int))
// This is not matched: (CC_B Wildcard Wildcard T_A)