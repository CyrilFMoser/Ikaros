package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: T_B[T_B[T_A, T_A], T_B[T_A, T_A]], c: T_B[Int, T_B[Int, (Int,Char)]]) extends T_A
case class CC_B(a: CC_A, b: CC_A) extends T_A
case class CC_C(a: CC_B, b: T_A, c: CC_A) extends T_A
case class CC_D[C](a: Int) extends T_B[Boolean, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), CC_A(_, _, _)) => 1 
  case CC_C(_, _, _) => 2 
}
}