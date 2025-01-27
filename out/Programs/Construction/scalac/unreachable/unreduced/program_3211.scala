package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_A[T_A[T_B, T_B], T_A[T_B, T_B]]]
case class CC_B[D](a: T_A[D, T_A[D, D]], b: (T_A[T_B, T_B],T_B), c: Char) extends T_A[D, T_A[D, D]]
case class CC_C(a: Boolean) extends T_A[CC_B[T_A[T_B, Int]], T_A[CC_B[T_A[T_B, Int]], CC_B[T_A[T_B, Int]]]]
case class CC_D(a: CC_C) extends T_B

val v_a: T_A[CC_B[T_A[T_B, Int]], T_A[CC_B[T_A[T_B, Int]], CC_B[T_A[T_B, Int]]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _, _), _, _), (_,CC_D(_)), 'x') => 0 
  case CC_B(CC_B(CC_B(_, _, _), _, _), (_,CC_D(_)), _) => 1 
  case CC_B(CC_B(CC_C(_), _, _), (_,CC_D(_)), 'x') => 2 
  case CC_B(CC_B(CC_C(_), _, _), (_,CC_D(_)), _) => 3 
  case CC_B(CC_C(_), (_,CC_D(_)), 'x') => 4 
  case CC_B(CC_C(_), (_,CC_D(_)), _) => 5 
  case CC_C(_) => 6 
}
}