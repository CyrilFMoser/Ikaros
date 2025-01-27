package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_B[Byte]], c: T_A) extends T_A
case class CC_B(a: CC_A) extends T_B[CC_A]
case class CC_C() extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_A(_, _, _), _, _)) => 0 
  case CC_C() => 1 
}
}