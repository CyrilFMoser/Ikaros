package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Int], b: (T_B[Char],Char)) extends T_A[Int]
case class CC_B(a: T_A[T_B[CC_A]], b: T_A[T_B[CC_A]]) extends T_A[Int]
case class CC_C[C](a: T_B[CC_A], b: CC_B) extends T_B[C]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_C(_, _),_)) => 0 
  case CC_B(_, _) => 1 
}
}