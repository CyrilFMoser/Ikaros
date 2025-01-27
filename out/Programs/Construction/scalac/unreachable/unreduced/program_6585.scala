package Program_20 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]
case class CC_B(a: (CC_A,CC_A)) extends T_A[T_A[Boolean]]
case class CC_C(a: T_A[T_A[Boolean]], b: CC_A, c: T_A[Char]) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B((_,_))) => 1 
  case CC_A(CC_C(_, _, _)) => 2 
  case CC_B((CC_A(_),CC_A(_))) => 3 
  case CC_C(CC_A(CC_A(_)), CC_A(_), _) => 4 
  case CC_C(CC_A(CC_B(_)), CC_A(_), _) => 5 
  case CC_C(CC_A(CC_C(_, _, _)), CC_A(_), _) => 6 
  case CC_C(CC_B((_,_)), CC_A(_), _) => 7 
  case CC_C(CC_C(CC_A(_), _, _), CC_A(_), _) => 8 
  case CC_C(CC_C(CC_B(_), _, _), CC_A(_), _) => 9 
  case CC_C(CC_C(CC_C(_, _, _), _, _), CC_A(_), _) => 10 
}
}