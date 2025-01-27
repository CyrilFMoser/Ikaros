package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Char]]) extends T_A[(Boolean,T_A[Int])]
case class CC_B[C](a: T_B[C], b: C, c: Byte) extends T_B[C]
case class CC_C[D](a: Byte, b: T_A[D], c: T_B[D]) extends T_B[D]
case class CC_D[E](a: T_B[E], b: T_B[E]) extends T_B[E]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _, _), _, _), _, _) => 0 
  case CC_B(CC_B(CC_C(_, _, _), _, _), _, _) => 1 
  case CC_B(CC_B(CC_D(_, _), _, _), _, _) => 2 
  case CC_B(CC_C(_, _, CC_B(_, _, _)), _, _) => 3 
  case CC_B(CC_C(_, _, CC_C(_, _, _)), _, _) => 4 
  case CC_B(CC_C(_, _, CC_D(_, _)), _, _) => 5 
  case CC_B(CC_D(CC_B(_, _, _), _), _, _) => 6 
  case CC_B(CC_D(CC_C(_, _, _), _), _, _) => 7 
  case CC_B(CC_D(CC_D(_, _), _), _, _) => 8 
  case CC_C(_, _, CC_B(CC_B(_, _, _), CC_A(_), _)) => 9 
  case CC_C(_, _, CC_B(CC_C(_, _, _), CC_A(_), _)) => 10 
  case CC_C(_, _, CC_B(CC_D(_, _), CC_A(_), _)) => 11 
  case CC_C(_, _, CC_C(_, _, CC_B(_, _, _))) => 12 
  case CC_C(_, _, CC_C(_, _, CC_C(_, _, _))) => 13 
  case CC_C(_, _, CC_C(_, _, CC_D(_, _))) => 14 
  case CC_C(_, _, CC_D(_, CC_B(_, _, _))) => 15 
  case CC_C(_, _, CC_D(_, CC_C(_, _, _))) => 16 
  case CC_C(_, _, CC_D(_, CC_D(_, _))) => 17 
  case CC_D(_, _) => 18 
}
}