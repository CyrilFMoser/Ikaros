package Program_22 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: T_B[Byte]) extends T_A
case class CC_C[B](a: CC_B) extends T_B[B]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
}
}