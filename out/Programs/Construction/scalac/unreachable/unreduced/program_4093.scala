package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Boolean], T_A[Byte]]) extends T_A[T_B[T_B[Int, Boolean], T_A[(Boolean,Boolean)]]]
case class CC_B(a: T_A[Boolean], b: T_A[T_A[(Boolean,Byte)]], c: T_A[CC_A]) extends T_A[T_B[T_B[Int, Boolean], T_A[(Boolean,Boolean)]]]
case class CC_C[D](a: T_B[D, D]) extends T_A[D]
case class CC_D(a: Char, b: CC_A, c: T_A[T_B[CC_A, Int]]) extends T_B[CC_B, Char]
case class CC_E(a: CC_B, b: T_B[T_B[CC_B, Char], T_B[CC_D, CC_B]]) extends T_B[CC_B, Char]
case class CC_F(a: CC_A, b: CC_E, c: CC_B) extends T_B[CC_B, Char]

val v_a: T_B[CC_B, Char] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(CC_B(CC_C(_), CC_C(_), CC_C(_)), _) => 1 
}
}
// This is not matched: CC_F(_, CC_E(CC_B(_, _, _), _), CC_B(CC_C(_), CC_C(_), CC_C(_)))