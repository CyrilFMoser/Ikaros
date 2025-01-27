package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C]) extends T_A[C]
case class CC_B[D](a: (Char,(Char,Int)), b: T_B[D]) extends T_A[D]
case class CC_C[E](a: T_A[E], b: E, c: Char) extends T_A[E]
case class CC_D(a: T_B[T_A[Int]]) extends T_B[T_B[CC_C[Boolean]]]
case class CC_E() extends T_B[T_B[CC_C[Boolean]]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _))) => 1 
  case CC_A(CC_A(CC_C(_, _, _))) => 2 
  case CC_A(CC_B((_,_), _)) => 3 
  case CC_A(CC_C(CC_A(_), _, _)) => 4 
  case CC_A(CC_C(CC_B(_, _), _, _)) => 5 
  case CC_A(CC_C(CC_C(_, _, _), _, _)) => 6 
  case CC_B((_,(_,_)), _) => 7 
  case CC_C(_, _, _) => 8 
}
}