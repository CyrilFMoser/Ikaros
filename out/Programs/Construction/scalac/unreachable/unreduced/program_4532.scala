package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[Int]
case class CC_B(a: T_B[Int, Int]) extends T_A[Int]
case class CC_C(a: CC_B, b: T_A[T_B[CC_B, CC_B]], c: Char) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, _) => 2 
}
}