package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: (T_B[Boolean],Int)) extends T_A[C]
case class CC_B[D]() extends T_A[D]
case class CC_C[E](a: T_A[E], b: (T_B[Char],CC_B[Char]), c: CC_A[E]) extends T_A[E]
case class CC_D(a: T_B[Byte], b: T_A[T_A[Boolean]]) extends T_B[CC_A[T_A[Char]]]
case class CC_E(a: CC_B[CC_B[CC_D]]) extends T_B[CC_A[T_A[Char]]]

val v_a: T_A[T_B[CC_A[T_A[Char]]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B() => 1 
  case CC_C(CC_A((_,_)), (_,CC_B()), CC_A(_)) => 2 
  case CC_C(CC_B(), (_,CC_B()), CC_A(_)) => 3 
  case CC_C(CC_C(CC_A(_), (_,_), CC_A(_)), (_,CC_B()), CC_A(_)) => 4 
  case CC_C(CC_C(CC_B(), (_,_), CC_A(_)), (_,CC_B()), CC_A(_)) => 5 
  case CC_C(CC_C(CC_C(_, _, _), (_,_), CC_A(_)), (_,CC_B()), CC_A(_)) => 6 
}
}