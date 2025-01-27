package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: D, c: T_A[D, T_B[D]]) extends T_A[D, T_B[D]]
case class CC_B() extends T_A[T_B[T_B[Boolean]], CC_A[CC_A[(Int,Char)]]]
case class CC_C[E]() extends T_B[E]
case class CC_D(a: T_A[T_B[CC_B], CC_B], b: (Boolean,T_A[CC_B, CC_B]), c: CC_B) extends T_B[CC_C[Byte]]
case class CC_E() extends T_B[CC_C[Byte]]

val v_a: T_B[CC_C[Byte]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _, CC_B()) => 1 
  case CC_E() => 2 
}
}