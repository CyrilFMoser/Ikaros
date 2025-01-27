package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_A[E, Boolean]) extends T_A[(Byte,Int), E]
case class CC_C[I, H]() extends T_B[I, H]
case class CC_D[K, J]() extends T_B[K, J]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(), _) => 0 
}
}
// This is not matched: (CC_A Byte (CC_A Byte (CC_A Byte Wildcard (T_A Byte)) (T_A Byte)) (T_A Byte))