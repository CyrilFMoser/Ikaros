package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Int]]) extends T_A[Int]
case class CC_B(a: (Byte,Char), b: CC_A) extends T_A[Int]
case class CC_C() extends T_A[Int]
case class CC_D[C](a: Int, b: C, c: CC_B) extends T_B[C]
case class CC_E[D]() extends T_B[D]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((0,'x'), _) => 1 
  case CC_B((0,_), _) => 2 
  case CC_B((_,'x'), _) => 3 
  case CC_C() => 4 
}
}
// This is not matched: CC_B((_,_), _)