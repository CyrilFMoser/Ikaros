package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, Char]
case class CC_B(a: (Char,T_A[T_B, Char])) extends T_A[T_A[Int, Char], Char]
case class CC_C(a: T_A[Int, CC_B], b: CC_B) extends T_A[T_A[Int, Char], Char]
case class CC_D[D](a: T_A[T_A[Int, Char], Char]) extends T_B
case class CC_E(a: Char) extends T_B

val v_a: T_A[T_A[Int, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, CC_B(_)) => 1 
}
}
// This is not matched: CC_B((_,_))