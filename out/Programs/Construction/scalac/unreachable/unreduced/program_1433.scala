package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[C, (T_A[Int, Int],T_A[Int, Int])]
case class CC_B[D](a: CC_A[D], b: (CC_A[Byte],Boolean)) extends T_A[D, (T_A[Int, Int],T_A[Int, Int])]
case class CC_C[E](a: CC_A[E]) extends T_A[E, (T_A[Int, Int],T_A[Int, Int])]

val v_a: T_A[Byte, (T_A[Int, Int],T_A[Int, Int])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_A(_, _)) => 2 
}
}