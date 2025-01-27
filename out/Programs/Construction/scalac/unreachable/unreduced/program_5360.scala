package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[C, (T_A[Byte, (Byte,Boolean)],T_A[Byte, Boolean])]
case class CC_B[D](a: T_A[D, CC_A[D]], b: CC_A[D], c: CC_A[D]) extends T_A[T_A[T_A[(Boolean,Int), Char], Byte], D]
case class CC_C[E]() extends T_A[E, (T_A[Byte, (Byte,Boolean)],T_A[Byte, Boolean])]

val v_a: T_A[Int, (T_A[Byte, (Byte,Boolean)],T_A[Byte, Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}