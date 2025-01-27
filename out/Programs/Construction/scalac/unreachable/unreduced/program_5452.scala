package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: Byte) extends T_A[T_B[Byte], Byte]
case class CC_B(a: T_A[T_B[CC_A], T_A[CC_A, CC_A]], b: Int) extends T_A[T_B[Byte], Byte]
case class CC_C(a: Int, b: T_A[CC_A, CC_A]) extends T_A[T_B[Byte], Byte]
case class CC_D(a: CC_A, b: CC_A, c: T_A[T_B[Byte], Byte]) extends T_B[CC_C]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_), CC_A(_), CC_A(_)) => 0 
  case CC_D(CC_A(_), CC_A(_), CC_B(_, _)) => 1 
  case CC_D(CC_A(_), CC_A(_), CC_C(_, _)) => 2 
}
}