package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[Int]
case class CC_B[B](a: Byte, b: (T_A[Int],Boolean)) extends T_A[Int]
case class CC_C(a: CC_A) extends T_A[Int]
case class CC_D(a: CC_B[Boolean], b: T_A[T_A[Int]], c: Char) extends T_B
case class CC_E[C](a: CC_C, b: CC_D) extends T_B

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, (CC_A(_),_)) => 1 
  case CC_B(_, (CC_B(_, _),_)) => 2 
  case CC_C(CC_A(CC_D(_, _, _))) => 3 
  case CC_C(CC_A(CC_E(_, _))) => 4 
}
}
// This is not matched: CC_B(_, (CC_C(_),_))