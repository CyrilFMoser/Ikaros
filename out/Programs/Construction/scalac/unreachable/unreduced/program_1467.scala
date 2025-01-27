package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_B[D], c: T_A[Char, D]) extends T_A[Char, D]
case class CC_B(a: T_B[Boolean]) extends T_B[(T_A[Char, Char],Int)]
case class CC_C(a: T_A[Char, T_A[Char, CC_B]], b: T_A[Char, Int], c: T_A[Char, CC_B]) extends T_B[(T_A[Char, Char],Int)]
case class CC_D[E](a: (Byte,CC_C)) extends T_B[(T_A[Char, Char],Int)]

val v_a: T_B[(T_A[Char, Char],Int)] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)) => 1 
  case CC_D(_) => 2 
}
}