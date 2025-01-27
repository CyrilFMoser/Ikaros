package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[(T_A[Boolean],T_B[(Byte,Char)])]
case class CC_B(a: T_B[Int], b: Boolean) extends T_A[(T_A[Boolean],T_B[(Byte,Char)])]
case class CC_C(a: T_B[T_B[Byte]], b: T_A[CC_B], c: T_A[CC_B]) extends T_A[(T_A[Boolean],T_B[(Byte,Char)])]
case class CC_D[C]() extends T_B[C]
case class CC_E[D](a: CC_A, b: Int) extends T_B[D]
case class CC_F(a: CC_A) extends T_B[CC_C]

val v_a: T_A[(T_A[Boolean],T_B[(Byte,Char)])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_D(), _) => 1 
  case CC_B(CC_E(_, _), _) => 2 
  case CC_C(_, _, _) => 3 
}
}