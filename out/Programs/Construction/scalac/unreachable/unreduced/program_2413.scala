package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[(Boolean,Char), T_A[Boolean, Boolean]]]
case class CC_B[D]() extends T_A[D, T_A[(Boolean,Char), T_A[Boolean, Boolean]]]
case class CC_C() extends T_A[CC_B[T_A[Int, Char]], T_A[(Boolean,Char), T_A[Boolean, Boolean]]]

val v_a: T_A[CC_C, T_A[(Boolean,Char), T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}