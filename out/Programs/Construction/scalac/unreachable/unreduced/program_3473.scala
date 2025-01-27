package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (T_A[Int, Int],T_A[Int, (Int,Byte)]), c: T_A[T_A[Int, C], T_A[Int, C]]) extends T_A[Int, C]
case class CC_B[D, E](a: Int) extends T_A[Int, D]
case class CC_C() extends T_A[Int, T_A[T_A[Int, Boolean], T_A[Int, Int]]]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_A(_, _, _),CC_A(_, _, _)), _) => 0 
  case CC_A(_, (CC_A(_, _, _),CC_B(_)), _) => 1 
  case CC_A(_, (CC_B(_),CC_A(_, _, _)), _) => 2 
  case CC_A(_, (CC_B(_),CC_B(_)), _) => 3 
  case CC_B(_) => 4 
}
}