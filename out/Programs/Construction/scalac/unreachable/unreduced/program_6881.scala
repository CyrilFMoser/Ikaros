package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: T_A[T_A[T_B]], b: T_A[T_B]) extends T_A[T_B]
case class CC_C(a: CC_B, b: (Int,CC_B)) extends T_B
case class CC_D(a: CC_A, b: T_A[Byte], c: Boolean) extends T_B
case class CC_E(a: CC_D) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _))) => 1 
  case CC_A(CC_B(_, CC_A(_))) => 2 
  case CC_A(CC_B(_, CC_B(_, _))) => 3 
  case CC_B(_, CC_A(_)) => 4 
  case CC_B(_, CC_B(_, _)) => 5 
}
}