package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: T_A[C, C]) extends T_A[C, Byte]
case class CC_B(a: T_A[T_A[Boolean, Byte], Byte]) extends T_A[T_A[Boolean, Byte], Byte]

val v_a: T_A[T_A[Boolean, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _)) => 1 
  case CC_B(CC_B(CC_A(_, _))) => 2 
  case CC_B(CC_B(CC_B(_))) => 3 
}
}