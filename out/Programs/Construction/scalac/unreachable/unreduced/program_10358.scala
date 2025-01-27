package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_B[T_A]], b: CC_A) extends T_A
case class CC_C(a: Boolean, b: CC_A, c: CC_B) extends T_A
case class CC_D(a: T_A, b: Int) extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, CC_A(), CC_B(_, CC_A())) => 1 
}
}
// This is not matched: CC_B(_, _)