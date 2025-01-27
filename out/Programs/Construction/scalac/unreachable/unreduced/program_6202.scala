package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: C, c: (T_A[T_B, T_B],T_A[T_B, T_B])) extends T_A[(T_B,(T_B,T_B)), C]
case class CC_B[D](a: CC_A[D], b: T_A[D, D], c: D) extends T_A[(T_B,(T_B,T_B)), D]
case class CC_C[E](a: T_A[E, T_B], b: T_B, c: E) extends T_A[(T_B,(T_B,T_B)), E]
case class CC_D() extends T_B

val v_a: T_A[(T_B,(T_B,T_B)), T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(), _, _) => 0 
  case CC_B(CC_A(CC_D(), CC_D(), (_,_)), _, CC_D()) => 1 
  case CC_C(_, CC_D(), CC_D()) => 2 
}
}