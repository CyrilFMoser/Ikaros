package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Int],T_A[Int]), b: Int, c: T_A[Int]) extends T_A[Int]
case class CC_B(a: T_A[CC_A]) extends T_A[Int]
case class CC_C[B](a: CC_B, b: B, c: B) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, 12, _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(_) => 2 
  case CC_C(CC_B(_), _, _) => 3 
}
}