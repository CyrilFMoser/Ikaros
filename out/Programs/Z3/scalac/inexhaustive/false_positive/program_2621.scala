package Program_31 

package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[T_A[(Boolean,Int), Byte], C]

val v_a: T_A[T_A[(Boolean,Int), Byte], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Int Boolean (T_A (T_A (Tuple Boolean Int) Byte) Int))
// This is not matched: (CC_B Boolean Wildcard (CC_A Boolean (T_A Boolean)) Wildcard (T_A Boolean))