package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: (T_A[Byte, Int],Boolean), b: Char, c: Byte) extends T_A[T_A[D, D], D]
case class CC_B[E](a: T_B[E]) extends T_B[E]
case class CC_C[F](a: (T_B[Boolean],T_A[Char, Boolean]), b: F, c: F) extends T_B[F]
case class CC_D[G](a: T_B[G], b: G) extends T_B[G]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_))) => 0 
  case CC_B(CC_B(CC_C(_, _, _))) => 1 
  case CC_B(CC_B(CC_D(_, _))) => 2 
  case CC_B(CC_C((_,_), 0, _)) => 3 
  case CC_B(CC_C((_,_), _, _)) => 4 
  case CC_B(CC_D(_, _)) => 5 
  case CC_C((CC_B(_),_), _, _) => 6 
  case CC_C((CC_C(_, _, _),_), _, _) => 7 
  case CC_C((CC_D(_, _),_), _, _) => 8 
  case CC_D(CC_B(CC_B(_)), _) => 9 
  case CC_D(CC_B(CC_C(_, _, _)), _) => 10 
  case CC_D(CC_B(CC_D(_, _)), _) => 11 
  case CC_D(CC_C(_, _, _), _) => 12 
  case CC_D(CC_D(CC_C(_, _, _), _), _) => 13 
  case CC_D(CC_D(CC_D(_, _), _), _) => 14 
}
}
// This is not matched: CC_D(CC_D(CC_B(_), _), _)