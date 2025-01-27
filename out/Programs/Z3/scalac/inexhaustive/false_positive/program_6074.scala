package Program_14 

package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B]) extends T_A[T_A[Byte]]
case class CC_B[C]() extends T_A[C]
case class CC_C[D]() extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_A(_)) => 1 
  case CC_A(_) => 2 
  case CC_C() => 3 
}
}
// This is not matched: (CC_A (CC_C Boolean (T_A Boolean))
//      (CC_B (CC_C Boolean Boolean) (T_A (CC_C Boolean Boolean)))
//      (T_A (T_A Byte)))
// This is not matched: Pattern match is empty without constants