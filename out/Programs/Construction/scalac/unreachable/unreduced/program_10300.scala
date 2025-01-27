package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: (T_A[T_B, Byte],Byte), b: T_A[T_B, Byte]) extends T_A[T_B, Byte]
case class CC_B(a: CC_A, b: T_A[T_B, T_A[T_B, Byte]]) extends T_A[T_B, Byte]
case class CC_C(a: Boolean, b: Int, c: CC_A) extends T_B
case class CC_D(a: T_B, b: Byte) extends T_B
case class CC_E(a: T_B, b: CC_B, c: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(CC_C(_, _, CC_A(_, _)), _) => 1 
  case CC_D(CC_D(_, _), _) => 2 
  case CC_D(CC_E(_, _, CC_A(_, _)), _) => 3 
  case CC_E(CC_C(_, _, _), CC_B(_, _), CC_A(_, CC_A(_, _))) => 4 
  case CC_E(CC_C(_, _, _), CC_B(_, _), CC_A(_, CC_B(_, _))) => 5 
  case CC_E(CC_D(_, _), CC_B(_, _), CC_A(_, CC_A(_, _))) => 6 
  case CC_E(CC_D(_, _), CC_B(_, _), CC_A(_, CC_B(_, _))) => 7 
  case CC_E(CC_E(_, CC_B(_, _), CC_A(_, _)), CC_B(_, _), CC_A(_, CC_A(_, _))) => 8 
  case CC_E(CC_E(_, CC_B(_, _), CC_A(_, _)), CC_B(_, _), CC_A(_, CC_B(_, _))) => 9 
}
}