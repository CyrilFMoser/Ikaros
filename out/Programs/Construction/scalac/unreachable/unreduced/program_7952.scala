package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B[C]() extends T_B[C, CC_A]
case class CC_C[D](a: T_B[T_B[D, CC_A], D]) extends T_B[D, CC_A]
case class CC_D[E, F]() extends T_B[E, CC_A]

val v_a: T_B[Int, CC_A] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_) => 1 
  case CC_D() => 2 
}
}