package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (T_A[Char],T_B[Int]), b: T_A[T_A[(Char,Boolean)]]) extends T_A[Char]
case class CC_B(a: T_A[T_A[Char]], b: (T_A[Char],T_B[Boolean]), c: T_B[T_B[CC_A]]) extends T_A[Char]
case class CC_C(a: T_A[CC_A], b: Char, c: T_B[Char]) extends T_A[T_B[(CC_A,CC_B)]]
case class CC_D() extends T_B[CC_B]
case class CC_E[C](a: T_B[T_B[C]], b: T_A[Char], c: CC_A) extends T_B[C]
case class CC_F(a: T_B[Boolean], b: Boolean) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_, CC_A((_,_), _), CC_A((_,_), _)) => 1 
  case CC_E(_, CC_B(_, _, _), CC_A((_,_), _)) => 2 
  case CC_F(CC_E(CC_E(_, _, _), CC_B(_, _, _), CC_A(_, _)), _) => 3 
}
}
// This is not matched: CC_F(CC_E(CC_E(_, _, _), CC_A(_, _), CC_A(_, _)), _)