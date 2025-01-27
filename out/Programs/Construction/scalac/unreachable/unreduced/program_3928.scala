package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[C, Int]
case class CC_B(a: T_A[Char, Int]) extends T_A[CC_A[Int], Int]
case class CC_C[D](a: T_A[CC_A[Int], Int], b: CC_A[D], c: (Int,CC_B)) extends T_A[D, Int]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
  case CC_A(_, _) => 1 
  case CC_C(_, _, _) => 2 
}
}