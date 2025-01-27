package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]], b: T_B[Byte], c: T_A) extends T_A
case class CC_B(a: T_A, b: T_A, c: T_B[Int]) extends T_B[Int]
case class CC_C(a: CC_A, b: T_B[Int], c: T_B[Int]) extends T_B[Int]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, CC_A(_, _, _)), _, CC_B(CC_A(_, _, _), _, _)) => 0 
  case CC_B(CC_A(_, _, CC_A(_, _, _)), _, CC_C(CC_A(_, _, _), _, CC_B(_, _, _))) => 1 
  case CC_B(CC_A(_, _, CC_A(_, _, _)), _, CC_C(CC_A(_, _, _), _, CC_C(_, _, _))) => 2 
  case CC_C(_, _, _) => 3 
}
}