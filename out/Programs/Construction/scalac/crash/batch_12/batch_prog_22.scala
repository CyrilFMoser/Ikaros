package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (T_B[Boolean, Byte],T_B[Int, Byte]), b: T_B[T_B[Byte, Char], T_B[Char, Char]]) extends T_A[T_B[T_A[Byte], T_B[Byte, Int]]]
case class CC_B[D]() extends T_A[T_B[T_A[Byte], T_B[Byte, Int]]]
case class CC_C(a: CC_B[CC_A], b: T_B[T_B[CC_A, CC_A], CC_B[CC_A]], c: (CC_B[CC_A],T_A[Int])) extends T_A[T_B[T_A[Byte], T_B[Byte, Int]]]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}