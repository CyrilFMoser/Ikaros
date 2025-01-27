package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_A[E, E]]
case class CC_B() extends T_B[T_A[(Int,Char), T_A[(Int,Char), (Int,Char)]], T_B[CC_A[Int], Boolean]]
case class CC_C(a: CC_A[T_B[CC_B, CC_B]], b: T_A[Char, T_A[Char, Char]], c: T_B[CC_B, CC_B]) extends T_B[T_A[(Int,Char), T_A[(Int,Char), (Int,Char)]], T_B[CC_A[Int], Boolean]]
case class CC_D(a: CC_B, b: CC_C) extends T_B[T_A[(Int,Char), T_A[(Int,Char), (Int,Char)]], T_B[CC_A[Int], Boolean]]

val v_a: T_B[T_A[(Int,Char), T_A[(Int,Char), (Int,Char)]], T_B[CC_A[Int], Boolean]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(), CC_A(), _) => 1 
}
}
// This is not matched: CC_D(_, _)