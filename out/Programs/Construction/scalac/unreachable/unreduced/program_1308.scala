package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: (Int,T_B[Boolean]), b: T_B[Boolean]) extends T_A
case class CC_C(a: CC_B, b: T_B[T_B[Boolean]], c: CC_B) extends T_A
case class CC_D(a: T_B[T_A], b: T_B[T_A]) extends T_B[T_A]
case class CC_E(a: T_B[Int]) extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(_, _), CC_D(_, _)) => 0 
  case CC_D(CC_D(_, _), CC_E(_)) => 1 
  case CC_D(CC_E(_), CC_D(_, _)) => 2 
  case CC_D(CC_E(_), CC_E(_)) => 3 
  case CC_E(_) => 4 
}
}