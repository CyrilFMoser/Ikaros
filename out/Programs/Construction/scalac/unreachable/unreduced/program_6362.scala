package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: (T_A,T_A)) extends T_A
case class CC_C[C](a: CC_B, b: C, c: (Char,T_B[CC_B, CC_B])) extends T_B[T_B[T_A, C], C]
case class CC_D[D](a: T_B[T_B[T_A, D], D], b: T_B[D, D]) extends T_B[T_B[T_A, D], D]
case class CC_E[E, F](a: CC_B, b: T_B[T_B[T_A, E], E], c: (CC_D[T_A],T_B[Int, CC_A])) extends T_B[T_B[T_A, E], E]

val v_a: T_B[T_B[T_A, T_A], T_A] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(CC_C(_, _, (_,_)), _) => 1 
  case CC_D(CC_D(CC_C(_, _, _), _), _) => 2 
  case CC_D(CC_D(CC_D(_, _), _), _) => 3 
  case CC_D(CC_D(CC_E(_, _, _), _), _) => 4 
  case CC_D(CC_E(CC_B(_, _), _, (_,_)), _) => 5 
  case CC_E(CC_B(_, _), CC_C(_, CC_A(), _), (CC_D(_, _),_)) => 6 
  case CC_E(CC_B(_, _), CC_C(_, CC_B(_, _), _), (CC_D(_, _),_)) => 7 
  case CC_E(CC_B(_, _), CC_E(CC_B(_, _), _, (_,_)), (CC_D(_, _),_)) => 8 
}
}
// This is not matched: CC_E(CC_B(_, _), CC_D(_, _), (CC_D(_, _),_))