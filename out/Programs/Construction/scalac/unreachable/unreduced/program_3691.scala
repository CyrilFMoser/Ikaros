package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Int, b: C, c: (T_A[T_B, T_B],T_B)) extends T_A[T_B, C]
case class CC_B[D](a: T_A[D, D], b: D) extends T_A[T_B, D]

val v_a: T_A[T_B, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (CC_A(_, _, _),_)) => 0 
  case CC_A(_, _, (CC_B(_, _),_)) => 1 
  case CC_B(_, _) => 2 
}
}