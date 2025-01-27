package Program_0 

object Test {
sealed trait T_A
case class CC_A(a: (Int,T_A), b: T_A, c: T_A) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C[A]() extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
}
}