package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[T_A[D, D], D], b: D) extends T_A[T_A[D, D], D]
case class CC_C(a: CC_A[CC_B[Byte]], b: T_A[T_A[T_A[Boolean, Int], T_A[Boolean, Int]], T_A[Boolean, Int]]) extends T_A[T_A[Int, Int], Int]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_A(_, _), CC_A(_, _)) => 2 
  case CC_C(CC_A(_, _), CC_B(_, _)) => 3 
}
}