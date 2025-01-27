package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: Char) extends T_A
case class CC_D(a: (T_B[Int, T_A],Int)) extends T_B[Int, T_A]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D((CC_D(_),_)) => 0 
}
}