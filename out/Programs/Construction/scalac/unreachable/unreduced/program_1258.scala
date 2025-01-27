package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[(Int,Int), T_A[Char]], b: (T_B[Int, (Byte,Int)],T_B[Byte, (Char,Byte)])) extends T_A[T_B[T_A[Char], T_B[Int, Int]]]
case class CC_B[D](a: CC_A, b: CC_A, c: D) extends T_A[D]
case class CC_C(a: CC_A, b: T_B[CC_B[CC_A], T_B[CC_A, (Char,Int)]]) extends T_B[Char, T_B[T_A[CC_A], (CC_A,(Int,Char))]]
case class CC_D() extends T_B[Char, T_B[T_A[CC_A], (CC_A,(Int,Char))]]

val v_a: T_B[Char, T_B[T_A[CC_A], (CC_A,(Int,Char))]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _), _) => 0 
  case CC_D() => 1 
}
}