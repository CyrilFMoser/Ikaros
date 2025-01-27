package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Boolean, T_B[Int, Byte]], b: T_A[T_A[Byte]], c: T_B[T_A[Int], Byte]) extends T_A[Int]
case class CC_B(a: T_B[T_A[Int], Boolean], b: Int, c: T_B[CC_A, T_A[Int]]) extends T_A[(T_A[Int],CC_A)]
case class CC_C(a: T_A[Int], b: T_B[T_A[Int], T_A[Int]]) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(CC_A(_, _, _), _) => 1 
  case CC_C(CC_C(CC_A(_, _, _), _), _) => 2 
  case CC_C(CC_C(CC_C(_, _), _), _) => 3 
}
}