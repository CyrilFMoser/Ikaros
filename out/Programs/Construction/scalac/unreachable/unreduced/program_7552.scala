package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: T_B[D], b: D) extends T_A[D]
case class CC_C() extends T_A[T_A[(Byte,Int)]]
case class CC_D(a: CC_A[T_A[(Int,Boolean)]], b: CC_A[T_A[CC_C]]) extends T_B[(T_A[CC_C],(Char,Char))]
case class CC_E[E](a: T_B[Boolean], b: E) extends T_B[(T_A[CC_C],(Char,Char))]
case class CC_F(a: CC_B[CC_A[CC_C]], b: Boolean) extends T_B[(T_A[CC_C],(Char,Char))]

val v_a: T_B[(T_A[CC_C],(Char,Char))] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(), CC_A()) => 0 
  case CC_E(_, _) => 1 
  case CC_F(CC_B(_, _), true) => 2 
  case CC_F(CC_B(_, _), false) => 3 
}
}