package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: T_A) extends T_A
case class CC_B(a: CC_A, b: T_A) extends T_A
case class CC_C(a: T_B[T_B[T_A, CC_B], Boolean], b: T_B[T_A, T_B[T_A, CC_B]], c: T_A) extends T_B[T_A, T_B[T_A, CC_B]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(_, CC_A(_, _))) => 1 
  case CC_A(_, CC_B(_, CC_B(_, _))) => 2 
  case CC_B(_, _) => 3 
}
}