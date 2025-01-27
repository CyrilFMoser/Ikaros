package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A() extends T_A[T_A[(T_B,Int), T_B], T_A[T_B, Int]]
case class CC_B() extends T_A[T_A[(T_B,Int), T_B], T_A[T_B, Int]]
case class CC_C(a: T_A[T_B, CC_A], b: T_B, c: CC_B) extends T_A[T_A[(T_B,Int), T_B], T_A[T_B, Int]]
case class CC_D(a: T_A[Char, CC_C], b: T_B) extends T_B

val v_a: T_A[T_A[(T_B,Int), T_B], T_A[T_B, Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}