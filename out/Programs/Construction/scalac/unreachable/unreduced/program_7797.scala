package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Byte]) extends T_A[Byte]
case class CC_B(a: T_A[CC_A], b: Byte) extends T_A[Byte]
case class CC_C() extends T_A[Byte]
case class CC_D() extends T_B[CC_A]
case class CC_E[C](a: C, b: T_A[Byte]) extends T_B[CC_A]
case class CC_F[D](a: T_B[CC_A]) extends T_B[D]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _))) => 1 
  case CC_A(CC_A(CC_C())) => 2 
  case CC_A(CC_B(_, _)) => 3 
  case CC_A(CC_C()) => 4 
  case CC_B(_, _) => 5 
  case CC_C() => 6 
}
}