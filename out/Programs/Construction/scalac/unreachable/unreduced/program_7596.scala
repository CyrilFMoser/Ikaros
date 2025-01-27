package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[T_A[C, C], C], c: Boolean) extends T_A[T_A[T_A[Boolean, Char], Int], C]
case class CC_B[D](a: Boolean, b: (CC_A[Boolean],CC_A[Int])) extends T_A[T_A[T_A[Boolean, Char], Int], D]

val v_a: T_A[T_A[T_A[Boolean, Char], Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}