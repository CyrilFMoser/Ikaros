package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_B[Int, T_A], T_B[T_A, T_A]]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D[C](a: CC_B, b: CC_A, c: (((Int,Char),CC_C),CC_B)) extends T_B[CC_A, C]
case class CC_E[D](a: D, b: CC_D[D]) extends T_B[CC_A, D]
case class CC_F[E](a: E, b: Char) extends T_B[CC_A, E]

val v_a: T_B[CC_A, CC_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(), CC_A(_, _), (_,_)) => 0 
  case CC_E(_, CC_D(_, _, _)) => 1 
}
}
// This is not matched: CC_F(CC_A(_, _), _)