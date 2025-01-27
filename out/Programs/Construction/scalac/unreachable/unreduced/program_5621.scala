package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Int) extends T_A[T_A[C, T_B], C]
case class CC_B(a: T_A[T_A[(T_B,Int), T_B], (T_B,Int)], b: T_A[T_A[T_B, T_B], T_A[T_B, Int]]) extends T_B
case class CC_C(a: CC_A[CC_B]) extends T_B
case class CC_D(a: Int, b: (T_B,Byte), c: Boolean) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(12), _) => 0 
  case CC_B(CC_A(_), _) => 1 
  case CC_C(_) => 2 
  case CC_D(_, (CC_B(_, _),_), _) => 3 
  case CC_D(_, (CC_C(_),_), _) => 4 
  case CC_D(_, (CC_D(_, _, _),_), _) => 5 
}
}