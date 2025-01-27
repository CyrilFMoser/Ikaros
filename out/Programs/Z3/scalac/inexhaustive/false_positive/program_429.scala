package Program_30 

package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[(Boolean,Int)]
case class CC_B[D](a: D) extends T_B[D]

val v_a: T_B[T_A[(Boolean,Int)]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
}
}
// This is not matched: (CC_B (T_A (Tuple Boolean Int))
//      (CC_A Boolean (T_A (Tuple Boolean Int)))
//      (T_B (T_A (Tuple Boolean Int))))
// This is not matched: (CC_C Byte Byte Wildcard (T_A Byte))