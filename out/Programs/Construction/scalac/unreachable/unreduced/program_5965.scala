package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: Int, b: Char) extends T_A[E]
case class CC_C() extends T_B[T_B[CC_A[Boolean], Byte], T_A[(Boolean,Byte)]]
case class CC_D(a: CC_A[T_A[CC_C]], b: T_A[CC_A[CC_C]]) extends T_B[T_B[CC_A[Boolean], Byte], T_A[(Boolean,Byte)]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}