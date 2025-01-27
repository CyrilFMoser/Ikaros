package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: ((Boolean,Int),Char)) extends T_A[T_B[T_A[Boolean, (Boolean,Boolean)]], D]
case class CC_B[E](a: T_B[E], b: CC_A[E]) extends T_B[E]
case class CC_C(a: T_A[T_B[Int], Byte], b: T_B[Int]) extends T_B[Int]
case class CC_D(a: CC_B[T_B[Int]]) extends T_B[Int]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _), CC_A(_, _)) => 0 
  case CC_B(CC_C(_, _), CC_A(_, _)) => 1 
  case CC_B(CC_D(_), CC_A(_, _)) => 2 
  case CC_C(_, _) => 3 
  case CC_D(CC_B(_, _)) => 4 
}
}