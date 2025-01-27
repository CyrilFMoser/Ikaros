package Program_15 

package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A(a: Boolean) extends T_A[T_A[Byte]]
case class CC_B[B]() extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}
// This is not matched: (CC_B Boolean (T_A (T_A Byte)))
// This is not matched: (CC_A T_A T_A)