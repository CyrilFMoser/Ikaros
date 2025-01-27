package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[Boolean, T_A[T_B, T_B]]) extends T_A[T_A[T_A[T_B, T_B], T_B], Byte]
case class CC_B(a: T_A[T_B, (Char,CC_A)], b: CC_A) extends T_B
case class CC_C(a: Int, b: T_B) extends T_B
case class CC_D(a: T_B, b: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_)) => 0 
  case CC_C(_, CC_B(_, _)) => 1 
  case CC_C(_, CC_C(_, CC_B(_, _))) => 2 
  case CC_C(_, CC_C(_, CC_C(_, _))) => 3 
  case CC_C(_, CC_C(_, CC_D(_, _))) => 4 
  case CC_C(_, CC_D(_, CC_C(_, _))) => 5 
  case CC_D(CC_B(_, _), CC_C(_, _)) => 6 
  case CC_D(CC_C(_, CC_B(_, _)), CC_C(_, _)) => 7 
  case CC_D(CC_C(_, CC_C(_, _)), CC_C(_, _)) => 8 
  case CC_D(CC_C(_, CC_D(_, _)), CC_C(_, _)) => 9 
  case CC_D(CC_D(_, _), CC_C(_, _)) => 10 
}
}