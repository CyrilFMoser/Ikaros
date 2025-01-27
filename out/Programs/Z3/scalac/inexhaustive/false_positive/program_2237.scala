package Program_31 

package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[T_A[Int, Byte], C]
case class CC_B(a: CC_A[Boolean, Byte]) extends T_A[T_A[Int, Byte], T_A[Boolean, Boolean]]

val v_a: T_A[T_A[Int, Byte], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Int Boolean (T_A (T_A Int Byte) Int))
// This is not matched: (CC_B T_B)