package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int], b: Char, c: T_A[T_A[(Char,Char)]]) extends T_A[Int]
case class CC_B() extends T_A[Int]
case class CC_C(a: CC_A, b: CC_B, c: Boolean) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_, _, _), CC_B(), _) => 2 
}
}