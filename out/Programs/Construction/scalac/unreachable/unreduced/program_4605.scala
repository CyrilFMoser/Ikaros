package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: C) extends T_A[T_A[C, C], C]
case class CC_B(a: Int, b: T_A[T_A[T_A[Int, Boolean], T_A[Int, Boolean]], T_A[Int, Boolean]]) extends T_A[T_A[Int, Int], Int]
case class CC_C(a: T_A[T_A[CC_B, CC_B], T_A[CC_B, CC_B]], b: (CC_B,CC_B)) extends T_A[T_A[Int, Int], Int]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, _)) => 1 
  case CC_C(_, (CC_B(_, _),CC_B(_, _))) => 2 
}
}