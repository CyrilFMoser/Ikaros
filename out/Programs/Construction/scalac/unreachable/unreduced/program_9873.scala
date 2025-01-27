package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Byte], b: T_A[T_B[Int]]) extends T_A[Byte]
case class CC_B(a: T_A[Byte]) extends T_A[Byte]
case class CC_C(a: CC_A, b: Boolean) extends T_A[Byte]
case class CC_D[C](a: Byte) extends T_B[C]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(CC_A(_, _), _)) => 1 
  case CC_B(CC_A(CC_B(_), _)) => 2 
  case CC_B(CC_B(CC_A(_, _))) => 3 
  case CC_B(CC_B(CC_B(_))) => 4 
  case CC_B(CC_B(CC_C(_, _))) => 5 
  case CC_B(CC_C(_, _)) => 6 
  case CC_C(CC_A(CC_A(_, _), _), _) => 7 
  case CC_C(CC_A(CC_B(_), _), _) => 8 
  case CC_C(CC_A(CC_C(_, _), _), _) => 9 
}
}
// This is not matched: CC_B(CC_A(CC_C(_, _), _))