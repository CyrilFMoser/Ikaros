package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Int], b: T_A[C, Int]) extends T_A[C, Int]
case class CC_B(a: Boolean, b: T_A[Int, T_A[Boolean, Int]]) extends T_A[T_A[T_A[Byte, Int], T_A[Boolean, Int]], Int]
case class CC_C(a: CC_B) extends T_A[T_A[T_A[Byte, Int], T_A[Boolean, Int]], Int]

val v_a: T_A[T_A[T_A[Byte, Int], T_A[Boolean, Int]], Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_A(_, _)) => 0 
  case CC_A(CC_A(_, _), CC_B(_, _)) => 1 
  case CC_A(CC_A(_, _), CC_C(_)) => 2 
  case CC_A(CC_B(_, _), CC_A(_, _)) => 3 
  case CC_A(CC_B(_, _), CC_B(_, _)) => 4 
  case CC_A(CC_B(_, _), CC_C(_)) => 5 
  case CC_A(CC_C(CC_B(_, _)), CC_A(_, _)) => 6 
  case CC_A(CC_C(CC_B(_, _)), CC_B(_, _)) => 7 
  case CC_A(CC_C(CC_B(_, _)), CC_C(_)) => 8 
  case CC_B(_, _) => 9 
  case CC_C(CC_B(_, _)) => 10 
}
}