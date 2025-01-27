package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Int, b: Boolean) extends T_A[T_B]
case class CC_B(a: T_A[T_B], b: (T_A[T_B],Int), c: T_A[T_B]) extends T_A[T_B]
case class CC_C(a: T_A[CC_A], b: CC_A) extends T_A[T_B]
case class CC_D() extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, (CC_A(_, _),_), CC_A(_, _)) => 1 
  case CC_B(_, (CC_A(_, _),_), CC_B(CC_A(_, _), _, CC_A(_, _))) => 2 
  case CC_B(_, (CC_A(_, _),_), CC_B(CC_A(_, _), _, CC_B(_, _, _))) => 3 
  case CC_B(_, (CC_A(_, _),_), CC_B(CC_A(_, _), _, CC_C(_, _))) => 4 
  case CC_B(_, (CC_A(_, _),_), CC_B(CC_B(_, _, _), _, CC_A(_, _))) => 5 
  case CC_B(_, (CC_A(_, _),_), CC_B(CC_B(_, _, _), _, CC_B(_, _, _))) => 6 
  case CC_B(_, (CC_A(_, _),_), CC_B(CC_B(_, _, _), _, CC_C(_, _))) => 7 
  case CC_B(_, (CC_A(_, _),_), CC_B(CC_C(_, _), _, CC_A(_, _))) => 8 
  case CC_B(_, (CC_A(_, _),_), CC_B(CC_C(_, _), _, CC_B(_, _, _))) => 9 
  case CC_B(_, (CC_A(_, _),_), CC_B(CC_C(_, _), _, CC_C(_, _))) => 10 
  case CC_B(_, (CC_A(_, _),_), CC_C(_, _)) => 11 
  case CC_B(_, (CC_B(_, _, _),_), CC_B(CC_A(_, _), _, CC_A(_, _))) => 12 
  case CC_B(_, (CC_B(_, _, _),_), CC_B(CC_A(_, _), _, CC_B(_, _, _))) => 13 
  case CC_B(_, (CC_B(_, _, _),_), CC_B(CC_A(_, _), _, CC_C(_, _))) => 14 
  case CC_B(_, (CC_B(_, _, _),_), CC_B(CC_B(_, _, _), _, CC_A(_, _))) => 15 
  case CC_B(_, (CC_B(_, _, _),_), CC_B(CC_B(_, _, _), _, CC_B(_, _, _))) => 16 
  case CC_B(_, (CC_B(_, _, _),_), CC_B(CC_B(_, _, _), _, CC_C(_, _))) => 17 
  case CC_B(_, (CC_B(_, _, _),_), CC_B(CC_C(_, _), _, CC_A(_, _))) => 18 
  case CC_B(_, (CC_B(_, _, _),_), CC_B(CC_C(_, _), _, CC_B(_, _, _))) => 19 
  case CC_B(_, (CC_B(_, _, _),_), CC_B(CC_C(_, _), _, CC_C(_, _))) => 20 
  case CC_B(_, (CC_B(_, _, _),_), CC_C(_, _)) => 21 
  case CC_B(_, (CC_C(_, _),_), CC_A(_, _)) => 22 
  case CC_B(_, (CC_C(_, _),_), CC_B(CC_A(_, _), _, CC_A(_, _))) => 23 
  case CC_B(_, (CC_C(_, _),_), CC_B(CC_A(_, _), _, CC_B(_, _, _))) => 24 
  case CC_B(_, (CC_C(_, _),_), CC_B(CC_A(_, _), _, CC_C(_, _))) => 25 
  case CC_B(_, (CC_C(_, _),_), CC_B(CC_B(_, _, _), _, CC_A(_, _))) => 26 
  case CC_B(_, (CC_C(_, _),_), CC_B(CC_B(_, _, _), _, CC_B(_, _, _))) => 27 
  case CC_B(_, (CC_C(_, _),_), CC_B(CC_B(_, _, _), _, CC_C(_, _))) => 28 
  case CC_B(_, (CC_C(_, _),_), CC_B(CC_C(_, _), _, CC_A(_, _))) => 29 
  case CC_B(_, (CC_C(_, _),_), CC_B(CC_C(_, _), _, CC_B(_, _, _))) => 30 
  case CC_B(_, (CC_C(_, _),_), CC_B(CC_C(_, _), _, CC_C(_, _))) => 31 
  case CC_B(_, (CC_C(_, _),_), CC_C(_, _)) => 32 
  case CC_C(_, _) => 33 
}
}
// This is not matched: CC_B(_, (CC_B(_, _, _),_), CC_A(_, _))