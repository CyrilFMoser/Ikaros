package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Boolean]]) extends T_A[T_A[T_A[(Byte,Boolean)]]]
case class CC_B(a: T_A[Byte], b: Boolean) extends T_B[CC_A]
case class CC_C[C]() extends T_B[C]
case class CC_D(a: T_B[CC_A], b: T_B[Int], c: CC_C[T_B[CC_A]]) extends T_B[CC_A]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_, _), CC_C(), CC_C()) => 0 
  case CC_D(CC_C(), CC_C(), CC_C()) => 1 
  case CC_D(CC_D(CC_B(_, _), CC_C(), CC_C()), CC_C(), CC_C()) => 2 
  case CC_D(CC_D(CC_C(), CC_C(), CC_C()), CC_C(), CC_C()) => 3 
  case CC_D(CC_D(CC_D(_, _, _), CC_C(), CC_C()), CC_C(), CC_C()) => 4 
}
}