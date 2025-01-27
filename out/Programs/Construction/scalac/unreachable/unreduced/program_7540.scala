package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[Boolean], b: T_B[T_B[T_A]], c: T_B[T_A]) extends T_A
case class CC_B(a: Byte, b: CC_A, c: Char) extends T_A
case class CC_C(a: Boolean, b: T_B[T_A]) extends T_B[((T_A,Boolean),T_B[CC_B])]
case class CC_D(a: T_B[T_A], b: CC_C, c: Int) extends T_B[((T_A,Boolean),T_B[CC_B])]
case class CC_E(a: CC_C) extends T_B[((T_A,Boolean),T_B[CC_B])]

val v_a: T_B[((T_A,Boolean),T_B[CC_B])] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(_, CC_C(_, _), _) => 1 
  case CC_E(_) => 2 
}
}