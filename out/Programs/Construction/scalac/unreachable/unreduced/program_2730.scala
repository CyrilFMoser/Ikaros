package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_B]
case class CC_B(a: Int) extends T_A[T_B]
case class CC_C(a: T_A[Int], b: CC_A, c: CC_B) extends T_A[T_B]
case class CC_D(a: CC_A, b: T_A[T_A[T_B]], c: (CC_B,T_A[CC_A])) extends T_B
case class CC_E(a: ((CC_A,T_B),T_A[Boolean]), b: Char) extends T_B
case class CC_F() extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, _, _)) => 0 
  case CC_A(CC_E(_, _)) => 1 
  case CC_A(CC_F()) => 2 
  case CC_B(_) => 3 
  case CC_C(_, CC_A(CC_D(_, _, _)), CC_B(_)) => 4 
  case CC_C(_, CC_A(CC_E(_, _)), CC_B(_)) => 5 
  case CC_C(_, CC_A(CC_F()), CC_B(_)) => 6 
}
}