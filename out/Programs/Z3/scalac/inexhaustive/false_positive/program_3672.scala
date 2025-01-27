package Program_15 

package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[T_A[Char, Int], C]

val v_a: T_A[T_A[Char, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Int Boolean (T_A (T_A Char Int) Int))
// This is not matched: (CC_B T_A)