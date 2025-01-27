package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_A[D], c: T_B[D, D]) extends T_A[D]
case class CC_B(a: T_B[T_A[Boolean], (Byte,Byte)], b: T_B[T_B[Char, Byte], (Byte,Int)], c: T_A[CC_A[Int]]) extends T_A[Char]
case class CC_C(a: T_A[Byte]) extends T_B[CC_A[T_B[CC_B, CC_B]], T_B[CC_B, Byte]]
case class CC_D() extends T_B[CC_A[T_B[CC_B, CC_B]], T_B[CC_B, Byte]]

val v_a: T_B[CC_A[T_B[CC_B, CC_B]], T_B[CC_B, Byte]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, _)) => 0 
  case CC_D() => 1 
}
}