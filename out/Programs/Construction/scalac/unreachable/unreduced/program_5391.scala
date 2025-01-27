package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: Int, c: (T_A[(Byte,Int), Int],T_A[T_B, (Int,Char)])) extends T_A[C, Int]
case class CC_B[D](a: T_A[D, Int], b: D) extends T_A[D, Int]
case class CC_C[E](a: E) extends T_A[E, T_B]
case class CC_D() extends T_B
case class CC_E(a: T_B, b: CC_A[T_B], c: CC_C[Int]) extends T_B
case class CC_F(a: Boolean) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_D(), CC_A(_, _, (_,_)), CC_C(_)) => 1 
  case CC_E(CC_E(_, _, _), CC_A(_, _, (_,_)), CC_C(_)) => 2 
  case CC_E(CC_F(_), CC_A(_, _, (_,_)), CC_C(_)) => 3 
  case CC_F(_) => 4 
}
}