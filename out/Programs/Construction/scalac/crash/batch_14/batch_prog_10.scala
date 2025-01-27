package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: T_A[C, C], c: T_A[C, C]) extends T_A[(T_A[Byte, Char],T_A[Byte, Boolean]), C]
case class CC_B(a: T_A[CC_A[Byte], Char], b: CC_A[CC_A[Char]]) extends T_A[(T_A[Byte, Char],T_A[Byte, Boolean]), CC_A[Boolean]]
case class CC_C[D](a: CC_B, b: D) extends T_A[(T_A[Byte, Char],T_A[Byte, Boolean]), D]

val v_a: T_A[(T_A[Byte, Char],T_A[Byte, Boolean]), CC_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_B(_, CC_A(_, _, _)), CC_A(_, _, _)) => 2 
}
}