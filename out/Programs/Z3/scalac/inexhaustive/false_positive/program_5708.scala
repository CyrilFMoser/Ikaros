package Program_15 

package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[T_A[C, C], C]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Int Boolean (T_A (T_A Int Int) Int))
// This is not matched: (CC_A (CC_A (CC_A Wildcard Wildcard (CC_C T_B) T_A) (CC_C T_B) Wildcard T_A)
//      Wildcard
//      (CC_C T_B)
//      T_A)