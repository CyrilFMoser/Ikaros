package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_B[Char]) extends T_A
case class CC_C(a: T_A, b: T_A) extends T_A
case class CC_D() extends T_B[T_B[CC_A]]
case class CC_E(a: T_B[T_B[CC_A]], b: T_A, c: CC_A) extends T_B[T_B[CC_A]]
case class CC_F(a: CC_C) extends T_B[T_B[CC_A]]

val v_a: T_B[T_B[CC_A]] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_D(), _, CC_A()) => 1 
  case CC_E(CC_E(_, CC_A(), _), _, CC_A()) => 2 
  case CC_E(CC_E(_, CC_B(_), _), _, CC_A()) => 3 
  case CC_E(CC_E(_, CC_C(_, _), _), _, CC_A()) => 4 
  case CC_E(CC_F(CC_C(_, _)), _, CC_A()) => 5 
  case CC_F(CC_C(CC_A(), CC_A())) => 6 
  case CC_F(CC_C(CC_B(_), CC_A())) => 7 
  case CC_F(CC_C(CC_C(_, _), CC_A())) => 8 
  case CC_F(CC_C(CC_A(), CC_B(_))) => 9 
  case CC_F(CC_C(CC_B(_), CC_B(_))) => 10 
  case CC_F(CC_C(CC_C(_, _), CC_B(_))) => 11 
  case CC_F(CC_C(CC_A(), CC_C(_, _))) => 12 
  case CC_F(CC_C(CC_B(_), CC_C(_, _))) => 13 
  case CC_F(CC_C(CC_C(_, _), CC_C(_, _))) => 14 
}
}