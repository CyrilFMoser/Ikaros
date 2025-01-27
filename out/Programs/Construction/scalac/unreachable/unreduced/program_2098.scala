package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_B[Int]) extends T_B[T_B[CC_A]]
case class CC_C[B](a: T_A, b: T_A) extends T_B[T_B[CC_A]]
case class CC_D() extends T_B[T_B[CC_A]]

val v_a: T_B[T_B[CC_A]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _) => 1 
  case CC_D() => 2 
}
}