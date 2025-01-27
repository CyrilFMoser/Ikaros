package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Int, b: T_B[T_B[Char]], c: T_A[T_A[Int]]) extends T_A[T_B[T_B[(Boolean,Byte)]]]
case class CC_B(a: T_A[Byte], b: Boolean, c: CC_A) extends T_A[T_B[T_B[(Boolean,Byte)]]]
case class CC_C(a: T_B[T_B[(Byte,Char)]]) extends T_A[T_B[T_B[(Boolean,Byte)]]]
case class CC_D[C](a: C, b: Byte) extends T_B[C]
case class CC_E[D]() extends T_B[D]

val v_a: T_A[T_B[T_B[(Boolean,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, CC_A(_, _, _)) => 1 
  case CC_C(CC_D(CC_D(_, _), _)) => 2 
  case CC_C(CC_D(CC_E(), _)) => 3 
  case CC_C(CC_E()) => 4 
}
}