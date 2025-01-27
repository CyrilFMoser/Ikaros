package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Boolean, b: T_B[T_B[(Char,Int), (Char,Char)], T_B[(Int,Boolean), T_A]], c: T_A) extends T_A
case class CC_B[C](a: Boolean, b: C) extends T_B[C, CC_A]
case class CC_C[D](a: CC_A) extends T_B[D, CC_A]
case class CC_D(a: CC_B[CC_A]) extends T_B[CC_C[T_A], CC_A]

val v_a: T_B[Boolean, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_, true) => 0 
  case CC_B(_, false) => 1 
  case CC_C(CC_A(_, _, _)) => 2 
}
}