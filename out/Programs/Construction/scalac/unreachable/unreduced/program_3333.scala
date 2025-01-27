package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[T_B[T_B[Byte, Boolean], T_A[Byte]]]
case class CC_B(a: CC_A[T_A[Int]], b: T_A[CC_A[Byte]]) extends T_A[T_B[T_B[Byte, Boolean], T_A[Byte]]]
case class CC_C() extends T_A[T_B[T_B[Byte, Boolean], T_A[Byte]]]
case class CC_D[E]() extends T_B[CC_C, E]

val v_a: T_A[T_B[T_B[Byte, Boolean], T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
}
}
// This is not matched: CC_C()