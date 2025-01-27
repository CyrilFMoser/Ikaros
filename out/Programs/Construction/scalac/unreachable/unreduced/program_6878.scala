package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_B[T_B[Boolean]]) extends T_A
case class CC_D[B](a: CC_A) extends T_B[T_B[Int]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}