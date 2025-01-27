package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: (T_A[Int],T_A[Boolean])) extends T_A[C]
case class CC_B[D](a: T_B[D], b: CC_A[Int]) extends T_A[D]
case class CC_C(a: T_A[Boolean]) extends T_B[T_A[T_A[Int]]]
case class CC_D(a: T_A[T_A[CC_C]], b: ((CC_C,Boolean),T_A[CC_C]), c: T_A[T_A[CC_C]]) extends T_B[T_A[T_A[Int]]]
case class CC_E() extends T_B[T_A[T_A[Int]]]

val v_a: T_B[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A((_,_))) => 0 
  case CC_C(CC_B(_, _)) => 1 
  case CC_D(CC_A(_), ((_,_),CC_A(_)), CC_A((_,_))) => 2 
  case CC_D(CC_A(_), ((_,_),CC_A(_)), CC_B(_, _)) => 3 
  case CC_D(CC_A(_), ((_,_),CC_B(_, _)), CC_A((_,_))) => 4 
  case CC_D(CC_A(_), ((_,_),CC_B(_, _)), CC_B(_, _)) => 5 
  case CC_D(CC_B(_, _), ((_,_),CC_A(_)), CC_A((_,_))) => 6 
  case CC_D(CC_B(_, _), ((_,_),CC_A(_)), CC_B(_, _)) => 7 
  case CC_D(CC_B(_, _), ((_,_),CC_B(_, _)), CC_A((_,_))) => 8 
  case CC_E() => 9 
}
}
// This is not matched: CC_D(CC_B(_, _), ((_,_),CC_B(_, _)), CC_B(_, _))