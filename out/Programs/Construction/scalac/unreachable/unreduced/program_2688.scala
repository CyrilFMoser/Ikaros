package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: T_B[T_A]) extends T_A
case class CC_C(a: T_A, b: T_B[T_B[CC_A]], c: T_B[(CC_A,T_A)]) extends T_B[T_B[CC_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(_, _)) => 0 
  case CC_A(CC_A(CC_B(_), CC_A(_, _)), CC_A(_, _)) => 1 
  case CC_A(CC_A(CC_A(_, _), CC_B(_)), CC_A(_, _)) => 2 
  case CC_A(CC_A(CC_B(_), CC_B(_)), CC_A(_, _)) => 3 
  case CC_A(CC_B(_), CC_A(_, _)) => 4 
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_B(_)) => 5 
  case CC_A(CC_A(CC_B(_), CC_A(_, _)), CC_B(_)) => 6 
  case CC_A(CC_A(CC_A(_, _), CC_B(_)), CC_B(_)) => 7 
  case CC_A(CC_A(CC_B(_), CC_B(_)), CC_B(_)) => 8 
  case CC_A(CC_B(_), CC_B(_)) => 9 
  case CC_B(_) => 10 
}
}