package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B]() extends T_A[Int]
case class CC_B[C](a: Boolean) extends T_B
case class CC_C(a: T_A[Int], b: CC_A[CC_B[T_B]], c: T_B) extends T_B
case class CC_D(a: T_B, b: T_A[CC_A[CC_C]], c: Int) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(true) => 0 
  case CC_B(false) => 1 
  case CC_C(_, _, _) => 2 
  case CC_D(_, _, _) => 3 
}
}