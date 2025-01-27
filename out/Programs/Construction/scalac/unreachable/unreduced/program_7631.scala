package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, Int]) extends T_A
case class CC_B(a: CC_A, b: (T_B[T_A, CC_A],Char), c: CC_A) extends T_A
case class CC_C[C](a: T_B[C, T_A], b: C, c: CC_B) extends T_B[C, T_A]
case class CC_D[D]() extends T_B[D, T_A]
case class CC_E[E]() extends T_B[E, T_A]

val v_a: T_B[CC_A, T_A] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_B(_, (_,_), CC_A(_))) => 0 
  case CC_D() => 1 
  case CC_E() => 2 
}
}