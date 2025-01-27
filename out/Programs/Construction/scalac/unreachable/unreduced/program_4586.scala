package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, Char]
case class CC_B[G, F]() extends T_B[F, G]
case class CC_C(a: CC_A[T_B[Int, (Byte,Char)]], b: T_A[CC_B[Int, Int], Char]) extends T_B[T_A[Char, CC_B[Int, Char]], CC_B[Int, Boolean]]
case class CC_D(a: T_A[CC_B[CC_C, CC_C], T_B[Int, Char]], b: Byte, c: Char) extends T_B[T_A[Char, CC_B[Int, Char]], CC_B[Int, Boolean]]

val v_a: T_B[T_A[Char, CC_B[Int, Char]], CC_B[Int, Boolean]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_D(_, _, _) => 1 
}
}
// This is not matched: CC_C(CC_A(), CC_A())