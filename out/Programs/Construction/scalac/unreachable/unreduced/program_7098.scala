package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: Boolean, b: T_B[T_B[D]]) extends T_A[D, E]
case class CC_B(a: T_A[CC_A[Int, Int], T_A[(Boolean,Int), (Byte,Int)]], b: T_B[Int]) extends T_B[Int]
case class CC_C(a: T_A[T_B[CC_B], T_B[CC_B]], b: CC_B) extends T_B[Int]
case class CC_D(a: CC_B) extends T_B[Int]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(CC_A(_, _), CC_B(_, CC_B(_, _))) => 1 
  case CC_C(CC_A(_, _), CC_B(_, CC_D(_))) => 2 
  case CC_D(_) => 3 
}
}
// This is not matched: CC_C(CC_A(_, _), CC_B(_, CC_C(_, _)))