package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, T_B]) extends T_A[C, (T_A[Boolean, T_B],T_B)]
case class CC_B[D](a: Char) extends T_A[D, (T_A[Boolean, T_B],T_B)]
case class CC_C(a: CC_A[CC_B[T_B]], b: Int, c: (CC_B[T_B],T_A[(Int,Char), Char])) extends T_B

val v_a: T_A[Char, (T_A[Boolean, T_B],T_B)] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}