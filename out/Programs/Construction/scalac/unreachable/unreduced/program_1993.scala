package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: CC_A, c: T_A) extends T_A
case class CC_C(a: T_B[((Char,Boolean),T_A)], b: T_A) extends T_B[T_B[Char]]
case class CC_D(a: CC_A) extends T_B[T_B[Char]]

val v_a: T_B[T_B[Char]] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A()) => 0 
  case CC_C(_, CC_B(CC_A(), CC_A(), _)) => 1 
  case CC_C(_, CC_B(CC_B(_, _, _), CC_A(), _)) => 2 
  case CC_D(_) => 3 
}
}