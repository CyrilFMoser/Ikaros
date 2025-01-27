package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]]) extends T_A
case class CC_B(a: CC_A) extends T_B[(Char,(T_A,T_A))]
case class CC_C(a: Int) extends T_B[(Char,(T_A,T_A))]
case class CC_D() extends T_B[(Char,(T_A,T_A))]

val v_a: T_B[(Char,(T_A,T_A))] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_)) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_D()