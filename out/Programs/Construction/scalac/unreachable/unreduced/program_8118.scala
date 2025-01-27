package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: C) extends T_A[C, T_B]
case class CC_B[E, F](a: CC_A[E, E], b: T_A[E, E], c: Byte) extends T_A[E, T_B]
case class CC_C[G](a: G, b: Char) extends T_A[G, T_B]
case class CC_D(a: CC_A[T_A[T_B, T_B], T_A[T_B, T_B]], b: T_A[T_A[Byte, T_B], T_B], c: (T_A[T_B, T_B],T_A[Boolean, T_B])) extends T_B
case class CC_E() extends T_B

val v_a: T_A[T_B, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_D(CC_A(_), CC_A(_), (_,_)), 'x') => 2 
  case CC_C(CC_D(CC_A(_), CC_B(_, _, _), (_,_)), 'x') => 3 
  case CC_C(CC_D(CC_A(_), CC_C(_, _), (_,_)), 'x') => 4 
  case CC_C(CC_E(), 'x') => 5 
  case CC_C(CC_D(CC_A(_), CC_A(_), (_,_)), _) => 6 
  case CC_C(CC_D(CC_A(_), CC_B(_, _, _), (_,_)), _) => 7 
  case CC_C(CC_D(CC_A(_), CC_C(_, _), (_,_)), _) => 8 
}
}
// This is not matched: CC_C(CC_E(), _)