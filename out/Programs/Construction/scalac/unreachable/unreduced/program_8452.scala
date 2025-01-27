package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_B[T_B[(Boolean,Byte)]], D]
case class CC_B[E](a: T_A[E, E], b: T_B[E], c: E) extends T_A[T_B[T_B[(Boolean,Byte)]], E]

val v_a: T_A[T_B[T_B[(Boolean,Byte)]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}