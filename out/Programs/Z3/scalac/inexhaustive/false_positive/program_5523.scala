package Program_15 

package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[T_B[Int, Char]]

val v_a: T_A[T_B[Int, Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Boolean (T_A (T_B Int Char)))
// This is not matched: (CC_A Byte Boolean (T_A Byte))