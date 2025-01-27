package Program_1 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: T_A) extends T_A
case class CC_C[A]() extends T_A

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
}
}