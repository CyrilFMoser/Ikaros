package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: (T_A[Boolean, Int],T_A[Boolean, Char]), c: Char) extends T_A[C, (T_A[Byte, Boolean],T_A[Byte, Int])]
case class CC_B(a: T_A[CC_A[Char], CC_A[Byte]], b: CC_A[Int]) extends T_A[Byte, (T_A[Byte, Boolean],T_A[Byte, Int])]

val v_a: T_A[Byte, (T_A[Byte, Boolean],T_A[Byte, Int])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A(_, _, _)) => 1 
}
}