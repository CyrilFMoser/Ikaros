package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (T_A[Char],T_B[Byte, Byte])) extends T_A[D]
case class CC_B() extends T_A[T_B[T_A[Boolean], T_A[Char]]]
case class CC_C[E](a: (T_A[CC_B],T_A[CC_B]), b: (T_A[CC_B],T_B[CC_B, CC_B]), c: (T_A[CC_B],T_A[(Byte,Boolean)])) extends T_A[E]
case class CC_D(a: Char, b: CC_A[CC_C[CC_B]], c: T_A[Int]) extends T_B[Int, T_A[CC_A[(Int,Int)]]]
case class CC_E(a: CC_A[T_A[CC_B]], b: (T_A[CC_B],CC_B), c: (T_A[CC_D],CC_B)) extends T_B[Int, T_A[CC_A[(Int,Int)]]]
case class CC_F(a: (Char,T_A[Boolean])) extends T_B[Int, T_A[CC_A[(Int,Int)]]]

val v_a: T_B[Int, T_A[CC_A[(Int,Int)]]] = null
val v_b: Int = v_a match{
  case CC_E(CC_A((_,_)), _, _) => 0 
  case CC_F(_) => 1 
}
}
// This is not matched: CC_D(_, _, _)