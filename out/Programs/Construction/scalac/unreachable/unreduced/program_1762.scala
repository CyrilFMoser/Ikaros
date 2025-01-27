package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Char], b: T_A[(Byte,Int)]) extends T_A[Int]
case class CC_B[C](a: T_B[CC_A], b: Boolean, c: C) extends T_B[C]
case class CC_C[D](a: (T_B[CC_A],CC_B[CC_A]), b: D, c: CC_B[D]) extends T_B[D]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _, _), _, CC_A(_, _)) => 0 
  case CC_B(CC_C(_, _, _), _, CC_A(_, _)) => 1 
  case CC_C(_, _, _) => 2 
}
}