package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: (T_B,T_A[T_B, Int])) extends T_A[C, T_A[Int, Int]]
case class CC_B[D](a: T_A[D, T_A[Int, Int]]) extends T_A[D, T_A[Int, Int]]
case class CC_C[E](a: Int, b: Byte) extends T_A[E, T_A[Int, Int]]
case class CC_D(a: CC_B[CC_A[T_B]], b: CC_A[CC_A[(Char,Int)]]) extends T_B
case class CC_E(a: T_B, b: T_A[T_A[Int, CC_D], T_A[Int, Int]], c: T_B) extends T_B

val v_a: T_A[T_B, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_D(_, _),_)) => 0 
  case CC_A(_, (CC_E(_, _, _),_)) => 1 
  case CC_B(CC_A(_, _)) => 2 
  case CC_B(CC_B(CC_A(_, _))) => 3 
  case CC_B(CC_B(CC_B(_))) => 4 
  case CC_B(CC_B(CC_C(_, _))) => 5 
  case CC_B(CC_C(_, _)) => 6 
  case CC_C(_, _) => 7 
}
}