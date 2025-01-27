package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C]) extends T_A[C]
case class CC_B() extends T_A[Char]
case class CC_C(a: Byte, b: T_B[T_A[Char]], c: T_B[CC_B]) extends T_A[Char]
case class CC_D(a: (Char,T_A[Boolean]), b: CC_B, c: T_B[CC_A[Int]]) extends T_B[CC_A[Int]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B())) => 1 
  case CC_A(CC_A(CC_C(_, _, _))) => 2 
  case CC_A(CC_B()) => 3 
  case CC_A(CC_C(_, _, _)) => 4 
  case CC_B() => 5 
  case CC_C(_, _, _) => 6 
}
}