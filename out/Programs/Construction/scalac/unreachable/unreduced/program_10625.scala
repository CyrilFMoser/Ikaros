package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[(Byte,Char), Char]]) extends T_A[T_B[T_A[Byte], Byte]]
case class CC_B(a: T_B[T_A[CC_A], CC_A], b: T_A[(CC_A,Char)], c: T_A[T_A[Byte]]) extends T_A[T_B[T_A[Byte], Byte]]
case class CC_C() extends T_A[T_B[T_A[Byte], Byte]]
case class CC_D[E, D]() extends T_B[D, E]

val v_a: T_A[T_B[T_A[Byte], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(CC_D(), _, _)