package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E) extends T_A[T_B[Byte, Int], E]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_D (T_A (T_A Byte))
//      (CC_A (T_A (T_A Byte)) (T_A (T_A (T_A Byte))))
//      (T_B (T_A (T_A Byte))))