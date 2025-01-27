package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[(Byte,Char), T_A[Boolean, Int]], T_A[T_A[Byte, Boolean], T_A[Int, (Int,Int)]]]
case class CC_B[C](a: C) extends T_A[Int, C]
case class CC_C(a: Char) extends T_A[Int, T_A[Int, T_A[CC_A, CC_A]]]

val v_a: T_A[Int, T_A[Int, T_A[CC_A, CC_A]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
  case CC_C(_) => 1 
}
}