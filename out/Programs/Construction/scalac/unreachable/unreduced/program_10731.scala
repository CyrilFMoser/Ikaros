package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Int) extends T_A[C, (T_A[Char, Int],(Int,Int))]
case class CC_B[D](a: CC_A[D]) extends T_A[D, (T_A[Char, Int],(Int,Int))]

val v_a: T_A[Boolean, (T_A[Char, Int],(Int,Int))] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}