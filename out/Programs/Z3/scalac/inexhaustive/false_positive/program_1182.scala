package Program_31 

package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[Int]]
case class CC_B[B, C]() extends T_A[B]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}
// This is not matched: (CC_B Byte Boolean (T_A Byte))
// This is not matched: (CC_B Boolean (T_A Boolean))