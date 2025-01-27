package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: Boolean, b: T_A, c: T_B[Byte]) extends T_A
case class CC_C(a: T_B[CC_B]) extends T_B[T_B[T_B[T_A]]]
case class CC_D(a: T_B[T_B[Int]]) extends T_B[Int]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, CC_A(_), _)) => 1 
  case CC_A(CC_B(_, CC_B(_, _, _), _)) => 2 
  case CC_B(_, _, _) => 3 
}
}