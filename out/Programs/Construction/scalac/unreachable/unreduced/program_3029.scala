package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: CC_A, b: T_B[T_B[CC_A, CC_A], T_A[CC_A]], c: Byte) extends T_A[T_A[T_A[Byte]]]
case class CC_C[D, E]() extends T_A[D]
case class CC_D() extends T_B[Boolean, Char]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A()