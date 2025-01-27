package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Boolean) extends T_A[(T_A[T_B],T_A[T_B])]
case class CC_B(a: T_A[T_A[CC_A]], b: CC_A, c: Char) extends T_A[(T_A[T_B],T_A[T_B])]
case class CC_C() extends T_A[(T_A[T_B],T_A[T_B])]
case class CC_D(a: CC_C, b: CC_C) extends T_B
case class CC_E[B](a: T_B, b: CC_B) extends T_B

val v_a: T_A[(T_A[T_B],T_A[T_B])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}