package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Int]], b: T_B[T_B[Boolean]], c: T_A[T_B[Byte]]) extends T_A[T_A[T_B[Int]]]
case class CC_B[C](a: T_B[C]) extends T_B[C]
case class CC_C(a: Int, b: Boolean, c: T_A[CC_B[CC_A]]) extends T_B[T_B[(Int,CC_A)]]
case class CC_D[D, E](a: CC_C) extends T_B[D]

val v_a: T_B[T_B[(Int,CC_A)]] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_))) => 0 
  case CC_B(CC_B(CC_C(_, _, _))) => 1 
  case CC_B(CC_B(CC_D(_))) => 2 
  case CC_B(CC_C(_, true, _)) => 3 
  case CC_B(CC_C(_, false, _)) => 4 
  case CC_B(CC_D(CC_C(_, _, _))) => 5 
  case CC_C(_, true, _) => 6 
  case CC_C(_, false, _) => 7 
  case CC_D(_) => 8 
}
}