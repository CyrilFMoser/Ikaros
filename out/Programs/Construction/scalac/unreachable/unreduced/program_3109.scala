package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[Char, C]) extends T_A[T_A[T_A[Byte, Boolean], T_A[Boolean, Int]], C]
case class CC_B[D](a: ((Int,Byte),Int), b: Char) extends T_A[T_A[T_A[Byte, Boolean], T_A[Boolean, Int]], D]
case class CC_C(a: T_A[(Byte,Int), T_A[Int, (Int,Byte)]], b: CC_B[CC_A[Byte]]) extends T_A[T_A[T_A[Byte, Boolean], T_A[Boolean, Int]], (CC_A[Int],CC_B[Byte])]

val v_a: T_A[T_A[T_A[Byte, Boolean], T_A[Boolean, Int]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}