package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: (Boolean,Boolean), b: T_A) extends T_A
case class CC_C[B](a: T_B[T_B[B]], b: T_A, c: CC_A) extends T_A
case class CC_D(a: Char, b: T_A) extends T_B[T_A]
case class CC_E() extends T_B[Int]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A()) => 0 
  case CC_B(_, CC_C(_, _, CC_A())) => 1 
}
}
// This is not matched: CC_B(_, CC_B(_, _))