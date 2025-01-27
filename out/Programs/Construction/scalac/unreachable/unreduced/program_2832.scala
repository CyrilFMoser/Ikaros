package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: T_B[Boolean]) extends T_A[C]
case class CC_B() extends T_B[Int]
case class CC_C(a: Char) extends T_B[Int]
case class CC_D(a: CC_C, b: CC_A[T_A[CC_C]], c: CC_B) extends T_B[Int]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_) => 1 
  case CC_D(_, CC_A(_, _), _) => 2 
}
}