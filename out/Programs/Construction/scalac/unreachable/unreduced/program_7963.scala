package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: T_B[C], c: (T_A[Boolean],T_A[Int])) extends T_A[C]
case class CC_B[D](a: T_A[D], b: T_B[D]) extends T_A[D]
case class CC_C(a: CC_A[T_B[Boolean]], b: T_A[Boolean]) extends T_B[CC_B[T_A[Int]]]
case class CC_D() extends T_B[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(true, CC_D(), (CC_A(_, _, _),CC_A(_, _, _))) => 0 
  case CC_A(true, CC_D(), (CC_A(_, _, _),CC_B(_, _))) => 1 
  case CC_A(true, CC_D(), (CC_B(_, _),CC_A(_, _, _))) => 2 
  case CC_A(true, CC_D(), (CC_B(_, _),CC_B(_, _))) => 3 
  case CC_A(false, CC_D(), (CC_A(_, _, _),CC_A(_, _, _))) => 4 
  case CC_A(false, CC_D(), (CC_A(_, _, _),CC_B(_, _))) => 5 
  case CC_A(false, CC_D(), (CC_B(_, _),CC_A(_, _, _))) => 6 
  case CC_A(false, CC_D(), (CC_B(_, _),CC_B(_, _))) => 7 
  case CC_B(CC_B(CC_A(_, _, _), _), _) => 8 
  case CC_B(CC_B(CC_B(_, _), _), _) => 9 
}
}
// This is not matched: CC_B(CC_A(_, CC_D(), (_,_)), _)