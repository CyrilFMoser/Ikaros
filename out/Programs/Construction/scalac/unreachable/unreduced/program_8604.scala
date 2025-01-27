package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Char], (Byte,Char)]) extends T_A[Byte]
case class CC_B(a: T_A[Byte], b: T_A[Byte]) extends T_A[Byte]
case class CC_C() extends T_A[Byte]
case class CC_D[D]() extends T_B[T_A[D], D]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_)) => 1 
  case CC_B(_, CC_B(CC_A(_), CC_A(_))) => 2 
  case CC_B(_, CC_B(CC_B(_, _), CC_A(_))) => 3 
  case CC_B(_, CC_B(CC_C(), CC_A(_))) => 4 
  case CC_B(_, CC_B(CC_A(_), CC_B(_, _))) => 5 
  case CC_B(_, CC_B(CC_B(_, _), CC_B(_, _))) => 6 
  case CC_B(_, CC_B(CC_C(), CC_B(_, _))) => 7 
  case CC_B(_, CC_B(CC_A(_), CC_C())) => 8 
  case CC_B(_, CC_B(CC_B(_, _), CC_C())) => 9 
  case CC_B(_, CC_B(CC_C(), CC_C())) => 10 
  case CC_B(_, CC_C()) => 11 
  case CC_C() => 12 
}
}