package Program_14 

package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[T_B[D], D]

val v_a: T_A[T_B[Int], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Int Boolean (T_A (T_B Int) Int))
// This is not matched: (CC_A (CC_A (CC_C T_A) Wildcard (Tuple Wildcard Wildcard) T_A)
//      Wildcard
//      Wildcard
//      T_A)