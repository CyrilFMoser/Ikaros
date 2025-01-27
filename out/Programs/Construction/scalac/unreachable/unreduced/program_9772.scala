package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char], b: T_A[(Boolean,Byte)]) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: Char, b: Byte, c: T_A[Char]) extends T_A[Int]
case class CC_C() extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
}
}