package Program_14 

package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[T_B[Byte]]

val v_a: T_A[T_B[Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Boolean (T_A (T_B Byte)))
// This is not matched: (CC_B Byte Boolean (Tuple Wildcard Int) Wildcard (T_A Boolean Byte))