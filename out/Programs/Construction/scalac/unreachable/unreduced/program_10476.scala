package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_A, b: T_B[T_A, T_B[CC_A, T_A]], c: T_B[CC_A, CC_A]) extends T_A
case class CC_C[C](a: C, b: Byte) extends T_B[C, Char]
case class CC_D[D](a: (Byte,CC_C[CC_A]), b: T_B[D, Char]) extends T_B[D, (Int,(CC_A,CC_A))]
case class CC_E(a: CC_A) extends T_B[Int, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, _, _)) => 1 
  case CC_B(CC_B(_, _, _), _, _) => 2 
}
}
// This is not matched: CC_B(CC_A(_), _, _)