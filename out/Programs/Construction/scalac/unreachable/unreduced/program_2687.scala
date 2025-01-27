package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_B[Boolean]]) extends T_A
case class CC_B(a: Int) extends T_A
case class CC_C(a: (T_A,CC_A), b: T_B[Int]) extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(_), _) => 1 
  case CC_B(_) => 2 
}
}