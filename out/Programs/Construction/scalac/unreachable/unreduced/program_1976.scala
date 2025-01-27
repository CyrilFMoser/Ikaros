package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_A], c: T_B[Boolean]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_B, b: CC_A) extends T_B[Int]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}