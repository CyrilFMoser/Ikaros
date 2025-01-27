package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, Byte], T_B[T_A, T_A]], b: T_A) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C[C](a: T_B[Byte, C], b: T_B[C, C], c: C) extends T_B[Byte, C]
case class CC_D(a: T_A, b: T_B[Byte, CC_B]) extends T_B[Byte, CC_B]
case class CC_E[D](a: CC_A, b: T_B[Byte, Byte], c: T_A) extends T_B[Byte, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, CC_A(_, _))) => 1 
  case CC_B(CC_A(_, CC_B(_))) => 2 
  case CC_B(CC_B(CC_A(_, _))) => 3 
  case CC_B(CC_B(CC_B(_))) => 4 
}
}