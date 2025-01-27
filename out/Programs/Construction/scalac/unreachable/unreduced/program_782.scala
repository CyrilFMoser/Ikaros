package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[C, Byte]
case class CC_B(a: CC_A[CC_A[T_B]], b: T_A[T_A[Boolean, Byte], Byte]) extends T_A[T_B, Byte]
case class CC_C[D]() extends T_A[D, Byte]

val v_a: T_A[T_B, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), CC_A(_, _)) => 1 
  case CC_B(CC_A(_, _), CC_C()) => 2 
  case CC_C() => 3 
}
}