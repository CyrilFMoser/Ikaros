package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Char, b: T_B) extends T_A[T_B]
case class CC_B(a: CC_A) extends T_A[T_B]
case class CC_C(a: Byte, b: T_A[CC_B]) extends T_A[T_B]
case class CC_D(a: T_A[(CC_C,CC_A)], b: T_A[T_B], c: CC_B) extends T_B
case class CC_E(a: CC_D) extends T_B
case class CC_F(a: T_A[CC_E]) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(_, CC_A(_, _), CC_B(_))) => 0 
  case CC_A(_, CC_D(_, CC_B(_), CC_B(_))) => 1 
  case CC_A(_, CC_D(_, CC_C(_, _), CC_B(_))) => 2 
  case CC_A(_, CC_E(CC_D(_, _, _))) => 3 
  case CC_A(_, CC_F(_)) => 4 
  case CC_B(CC_A(_, _)) => 5 
  case CC_C(_, _) => 6 
}
}