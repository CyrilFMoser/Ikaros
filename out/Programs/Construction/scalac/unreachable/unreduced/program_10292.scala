package Program_23 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_A]) extends T_A
case class CC_B() extends T_A
case class CC_C[B](a: Boolean) extends T_A
case class CC_D(a: T_A, b: Boolean, c: T_A) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _), _, _) => 0 
  case CC_D(CC_B(), _, _) => 1 
  case CC_D(CC_C(_), _, _) => 2 
}
}