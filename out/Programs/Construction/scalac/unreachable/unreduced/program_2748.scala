package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Boolean], b: T_A[T_B], c: Byte) extends T_A[T_B]
case class CC_B(a: CC_A, b: CC_A, c: (T_B,T_A[CC_A])) extends T_A[T_B]
case class CC_C(a: Boolean, b: T_A[T_B], c: T_A[T_B]) extends T_A[T_B]
case class CC_D[B](a: CC_B, b: CC_C) extends T_B
case class CC_E(a: T_A[T_B], b: Boolean, c: Boolean) extends T_B
case class CC_F(a: CC_E, b: CC_B) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, CC_A(_, _, _), _), _, (CC_D(_, _),_)) => 1 
  case CC_B(CC_A(_, CC_B(_, _, _), _), _, (CC_D(_, _),_)) => 2 
  case CC_B(CC_A(_, CC_C(_, _, _), _), _, (CC_D(_, _),_)) => 3 
  case CC_B(CC_A(_, CC_A(_, _, _), _), _, (CC_E(_, _, _),_)) => 4 
  case CC_B(CC_A(_, CC_B(_, _, _), _), _, (CC_E(_, _, _),_)) => 5 
  case CC_B(CC_A(_, CC_C(_, _, _), _), _, (CC_E(_, _, _),_)) => 6 
  case CC_B(CC_A(_, CC_A(_, _, _), _), _, (CC_F(_, _),_)) => 7 
  case CC_B(CC_A(_, CC_B(_, _, _), _), _, (CC_F(_, _),_)) => 8 
  case CC_B(CC_A(_, CC_C(_, _, _), _), _, (CC_F(_, _),_)) => 9 
  case CC_C(_, _, CC_A(_, CC_A(_, _, _), _)) => 10 
  case CC_C(_, _, CC_A(_, CC_B(_, _, _), _)) => 11 
  case CC_C(_, _, CC_A(_, CC_C(_, _, _), _)) => 12 
  case CC_C(_, _, CC_B(_, _, _)) => 13 
  case CC_C(_, _, CC_C(_, CC_A(_, _, _), CC_A(_, _, _))) => 14 
  case CC_C(_, _, CC_C(_, CC_A(_, _, _), CC_B(_, _, _))) => 15 
  case CC_C(_, _, CC_C(_, CC_B(_, _, _), CC_A(_, _, _))) => 16 
  case CC_C(_, _, CC_C(_, CC_B(_, _, _), CC_B(_, _, _))) => 17 
  case CC_C(_, _, CC_C(_, CC_B(_, _, _), CC_C(_, _, _))) => 18 
  case CC_C(_, _, CC_C(_, CC_C(_, _, _), CC_A(_, _, _))) => 19 
  case CC_C(_, _, CC_C(_, CC_C(_, _, _), CC_B(_, _, _))) => 20 
  case CC_C(_, _, CC_C(_, CC_C(_, _, _), CC_C(_, _, _))) => 21 
}
}
// This is not matched: CC_C(_, _, CC_C(_, CC_A(_, _, _), CC_C(_, _, _)))