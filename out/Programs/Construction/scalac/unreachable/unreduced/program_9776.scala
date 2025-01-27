package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_A], b: T_A, c: T_A) extends T_A
case class CC_C(a: T_A) extends T_B[Boolean]
case class CC_D(a: T_A, b: T_B[T_B[Boolean]], c: CC_C) extends T_B[Boolean]
case class CC_E() extends T_B[CC_D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_B(_, _, _), _) => 1 
}
}
// This is not matched: CC_B(_, CC_A(), _)