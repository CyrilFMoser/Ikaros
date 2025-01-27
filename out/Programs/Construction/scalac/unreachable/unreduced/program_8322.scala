package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Int) extends T_A[D]
case class CC_B(a: T_A[T_A[Int]], b: T_B[Char, Boolean]) extends T_A[T_B[CC_A[(Char,Boolean)], CC_A[(Byte,Char)]]]
case class CC_C[E]() extends T_B[E, T_A[CC_B]]

val v_a: T_A[T_B[CC_A[(Char,Boolean)], CC_A[(Byte,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}