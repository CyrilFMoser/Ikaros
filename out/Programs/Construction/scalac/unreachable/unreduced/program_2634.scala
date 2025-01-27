package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: (T_A,T_A), c: T_B[Char, (T_A,Int)]) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: CC_B, b: T_A) extends T_B[C, T_B[C, C]]
case class CC_D[D](a: CC_B) extends T_B[D, T_B[D, D]]
case class CC_E[E](a: CC_A) extends T_B[E, T_B[E, E]]

val v_a: T_B[T_A, T_B[T_A, T_A]] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(), CC_A(CC_A(_, _, _), (_,_), _)) => 0 
  case CC_C(CC_B(), CC_A(CC_B(), (_,_), _)) => 1 
  case CC_C(CC_B(), CC_B()) => 2 
  case CC_D(CC_B()) => 3 
}
}
// This is not matched: CC_E(_)