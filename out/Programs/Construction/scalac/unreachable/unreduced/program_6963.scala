package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[(Boolean,Char), T_A], T_B[T_A, T_A]], b: T_B[T_B[T_A, T_A], T_A]) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C[C](a: T_A, b: T_A) extends T_B[C, T_B[CC_B, C]]
case class CC_D[D](a: (CC_A,T_B[CC_B, Char]), b: CC_A) extends T_B[D, T_B[CC_B, D]]
case class CC_E[E](a: CC_B) extends T_B[E, T_B[CC_B, E]]

val v_a: T_B[Char, T_B[CC_B, Char]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _), _) => 0 
  case CC_C(CC_B(CC_A(_, _)), _) => 1 
  case CC_C(CC_B(CC_B(_)), _) => 2 
  case CC_D(_, CC_A(_, _)) => 3 
  case CC_E(_) => 4 
}
}