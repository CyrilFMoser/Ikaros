package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[T_A[(Byte,Int), T_A[Boolean, Boolean]], C]
case class CC_B[D](a: (T_A[Byte, Int],Byte), b: D, c: T_A[D, D]) extends T_A[T_A[(Byte,Int), T_A[Boolean, Boolean]], D]
case class CC_C(a: (CC_B[Int],CC_B[Byte])) extends T_A[T_A[(Byte,Int), T_A[Boolean, Boolean]], CC_A[CC_A[(Byte,Byte)]]]

val v_a: T_A[T_A[(Byte,Int), T_A[Boolean, Boolean]], CC_C] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_)) => 0 
  case CC_B(_, _, _) => 1 
}
}