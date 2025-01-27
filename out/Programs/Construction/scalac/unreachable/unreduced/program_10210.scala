package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: T_B[C, C]) extends T_B[C, CC_B]
case class CC_D[D](a: T_A, b: CC_B) extends T_B[D, CC_B]

val v_a: T_B[T_A, CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(CC_B(), _) => 1 
}
}
// This is not matched: CC_D(CC_A(), _)