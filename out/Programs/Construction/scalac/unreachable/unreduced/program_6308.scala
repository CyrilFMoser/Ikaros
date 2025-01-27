package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[Int], b: T_B[(Char,Boolean)], c: T_A[T_A[Int]]) extends T_A[T_A[T_B[Boolean]]]
case class CC_B[C](a: T_B[C], b: C) extends T_B[C]
case class CC_C[D](a: T_B[D], b: T_A[D], c: Byte) extends T_B[D]
case class CC_D[E](a: (Int,T_B[Byte]), b: T_B[E], c: CC_B[E]) extends T_B[E]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _), 'x'), _) => 0 
  case CC_B(CC_B(CC_B(_, _), _), _) => 1 
  case CC_B(CC_B(CC_C(_, _, _), 'x'), _) => 2 
  case CC_B(CC_B(CC_C(_, _, _), _), _) => 3 
  case CC_B(CC_B(CC_D(_, _, _), 'x'), _) => 4 
  case CC_B(CC_B(CC_D(_, _, _), _), _) => 5 
  case CC_B(CC_C(_, _, _), _) => 6 
  case CC_B(CC_D(_, _, _), _) => 7 
  case CC_C(_, _, _) => 8 
  case CC_D((_,CC_B(_, _)), _, _) => 9 
  case CC_D((_,CC_C(_, _, _)), _, _) => 10 
  case CC_D((_,CC_D(_, _, _)), _, _) => 11 
}
}