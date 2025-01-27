package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[T_A[C]], b: Boolean, c: T_A[C]) extends T_A[C]
case class CC_B[D](a: T_A[D], b: T_A[D], c: T_A[T_A[D]]) extends T_A[D]
case class CC_C() extends T_B[(T_A[Int],(Int,Int))]
case class CC_D(a: Byte, b: T_B[T_A[Int]], c: T_A[CC_A[CC_C]]) extends T_B[(T_A[Int],(Int,Int))]
case class CC_E(a: CC_C, b: (T_B[(Int,Byte)],T_A[CC_C])) extends T_B[(T_A[Int],(Int,Int))]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), _, CC_A(_, _, _)) => 0 
  case CC_B(CC_B(_, _, _), _, CC_A(_, _, _)) => 1 
  case CC_B(CC_A(_, _, _), _, CC_B(_, _, _)) => 2 
  case CC_B(CC_B(_, _, _), _, CC_B(_, _, _)) => 3 
}
}