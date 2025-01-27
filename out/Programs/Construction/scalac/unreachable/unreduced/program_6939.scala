package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Byte, b: Byte, c: T_B) extends T_A[T_B]
case class CC_B(a: T_A[Int], b: T_A[T_B], c: CC_A) extends T_A[T_B]
case class CC_C(a: Int, b: T_B, c: CC_B) extends T_A[T_B]
case class CC_D(a: T_A[T_B], b: (CC_C,T_A[(Boolean,Byte)]), c: Int) extends T_B
case class CC_E(a: CC_B, b: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _, 12) => 0 
  case CC_D(_, _, _) => 1 
  case CC_E(CC_B(_, _, CC_A(_, _, _)), CC_B(_, CC_A(_, _, _), CC_A(_, _, _))) => 2 
  case CC_E(CC_B(_, _, CC_A(_, _, _)), CC_B(_, CC_C(_, _, _), CC_A(_, _, _))) => 3 
}
}
// This is not matched: CC_E(CC_B(_, _, CC_A(_, _, _)), CC_B(_, CC_B(_, _, _), CC_A(_, _, _)))