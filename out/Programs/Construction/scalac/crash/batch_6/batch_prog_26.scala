package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: (T_A,Byte), c: T_A) extends T_A
case class CC_B(a: T_B[T_B[CC_A, CC_A], CC_A]) extends T_A
case class CC_C(a: T_B[T_A, T_A], b: CC_A, c: CC_A) extends T_A
case class CC_D[C]() extends T_B[CC_C, C]
case class CC_E[D](a: (CC_B,CC_A)) extends T_B[CC_C, D]
case class CC_F[E, F]() extends T_B[E, F]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_F(), _, CC_A(CC_F(), (_,_), _)) => 0 
  case CC_A(CC_F(), _, CC_B(CC_F())) => 1 
  case CC_A(CC_F(), _, CC_C(_, _, CC_A(_, _, _))) => 2 
  case CC_B(CC_F()) => 3 
  case CC_C(CC_F(), _, CC_A(_, _, CC_A(_, _, _))) => 4 
  case CC_C(CC_F(), _, CC_A(_, _, CC_B(_))) => 5 
  case CC_C(CC_F(), _, CC_A(_, _, CC_C(_, _, _))) => 6 
}
}