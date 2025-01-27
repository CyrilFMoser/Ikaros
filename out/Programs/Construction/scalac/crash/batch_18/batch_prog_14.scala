package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[Byte, (Int,Byte)], T_A[Byte, Int]]]
case class CC_B[D, E](a: T_A[D, D], b: T_A[Char, D]) extends T_A[E, D]
case class CC_C(a: Byte) extends T_A[CC_A[CC_B[Byte, Int]], Char]

val v_a: T_A[CC_A[CC_B[Byte, Int]], Char] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _)) => 0 
  case CC_C(_) => 1 
}
}