package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[(Boolean,Int)], T_A[Int]], b: T_A[Int], c: T_A[Char]) extends T_A[Int]
case class CC_B[D, E](a: T_B[D, D]) extends T_B[D, E]
case class CC_C[F](a: T_A[Int], b: F, c: (CC_B[CC_A, CC_A],T_B[CC_A, CC_A])) extends T_B[T_B[T_A[Char], T_B[(Char,Char), (Char,Char)]], F]
case class CC_D[H, G]() extends T_B[G, H]

val v_a: T_B[T_B[T_A[Char], T_B[(Char,Char), (Char,Char)]], CC_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, _), CC_A(_, CC_A(_, _, _), _), (CC_B(_),CC_B(_))) => 0 
  case CC_C(CC_A(_, _, _), CC_A(_, CC_A(_, _, _), _), (CC_B(_),CC_D())) => 1 
  case CC_D() => 2 
}
}
// This is not matched: CC_B(_)