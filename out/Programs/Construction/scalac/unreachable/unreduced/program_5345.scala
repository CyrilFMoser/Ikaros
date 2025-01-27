package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, ((Int,Char),(Int,Boolean))]) extends T_A[D]
case class CC_B(a: T_B[(Boolean,Char), T_A[(Boolean,Char)]], b: T_B[Boolean, T_B[Int, Int]]) extends T_A[Char]
case class CC_C(a: CC_A[Int]) extends T_A[Char]
case class CC_D[E](a: T_B[Char, E], b: T_A[Char]) extends T_B[Char, E]
case class CC_E(a: T_A[Char], b: CC_D[Boolean], c: T_A[Char]) extends T_B[Char, (T_B[Char, CC_B],(CC_C,Char))]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C(CC_A(_))