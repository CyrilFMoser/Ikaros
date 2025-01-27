package Program_27 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: Char, c: (T_A[Int],T_A[Byte])) extends T_A[Byte]
case class CC_B(a: CC_A, b: T_A[Byte], c: T_A[CC_A]) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}