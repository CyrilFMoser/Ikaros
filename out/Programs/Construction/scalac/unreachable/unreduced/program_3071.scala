package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, (Int,T_A[Int, Int])]
case class CC_B[D](a: T_A[D, D], b: D) extends T_A[D, (Int,T_A[Int, Int])]

val v_a: T_A[Byte, (Int,T_A[Int, Int])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, 0) => 1 
  case CC_B(_, _) => 2 
}
}