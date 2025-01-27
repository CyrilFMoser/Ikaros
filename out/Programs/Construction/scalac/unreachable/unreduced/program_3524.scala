package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_B[T_A[Char, Char]]) extends T_A[D, E]
case class CC_B[F, G, H]() extends T_A[G, F]
case class CC_C[I, J](a: T_A[Boolean, J], b: I, c: CC_B[J, I, I]) extends T_A[I, J]
case class CC_D(a: T_A[CC_C[Int, Boolean], CC_B[Char, Char, Int]], b: T_A[CC_C[Int, Byte], T_B[Byte]]) extends T_B[T_B[((Byte,Char),Boolean)]]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_), _, CC_B()) => 2 
  case CC_C(CC_B(), _, CC_B()) => 3 
  case CC_C(CC_C(_, _, _), _, CC_B()) => 4 
}
}